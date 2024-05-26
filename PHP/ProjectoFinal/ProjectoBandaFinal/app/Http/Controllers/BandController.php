<?php

namespace App\Http\Controllers;

use DB;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\Storage;
use App\Models\Band;//preciso colocar o caminho do model
use GuzzleHttp\Client;
use Carbon\Carbon;


class BandController extends Controller
{
    /**
     * Display a listing of the resource.
     */




    public function index()
    {
        //$bands = $this->bands();
        $bands_albuns=$this->numberAlbums();
       //dd($bands_albuns);
      //$bands=Band::all();

       $search =request()->query('search')?request()->query('search'):null;
        if($search){
            $bands = Band::where('name', 'LIKE', "%{$search}%")
            ->get();

        }else{

            $bands=Band::all();

        }

        $client = new Client();
        $url = 'https://api.open-meteo.com/v1/forecast?latitude=41.1496&longitude=-8.611&hourly=temperature_2m&forecast_days=1';


        try {
            $response = $client->get($url);
            $data = json_decode($response->getBody(), true);

            // Verifique se a estrutura de dados está correta
            if (!isset($data['hourly']['temperature_2m'], $data['hourly']['time'])) {
                throw new Exception('Unexpected response structure');
            }

            $temperatureData = $data['hourly']['temperature_2m'];
            $timeData = $data['hourly']['time'];

            //dd($temperatureData);


        } catch (Exception $e) {
            return response()->json(['error' => 'Unable to fetch data', 'message' => $e->getMessage()], 500);
        }

        //dd($temperatureData);

        $hora=Carbon::now()->format('H')+1;
        //dd($hora);






        return view('bands.index', compact('bands', 'bands_albuns', 'hora', 'temperatureData'));
    }




    protected function bands()
    {
        $bands = Band::all();
        return $bands;
    }




    protected function numberAlbums()
    {

        //$bandas_albums = DB::select('select count(*) as total, bands.name, bands.image from bands join albums on bands.id=albums.band_id group by albums.band_id');
        $bandas_albums = Band::rightJoin('albums', 'bands.id', '=', 'albums.band_id')
        ->selectRaw('COUNT(*) as total, bands.name, bands.image, bands.id')
        ->groupBy('bands.id', 'bands.name', 'bands.image')
        ->get();

            //dd($bandas_albums->all());
        return  $bandas_albums;


    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
           $albums =$id;

        return view('bands.albums', compact('albums'));// vais buscar o id que foi enviado


    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }


    public function insertBand(Request $request)
    {

        //dd($request->image);

        $image=null;

        if ($request->hasFile('image')) {
            $image = Storage::putFile('image', $request->image);// define o caminho para colocar no xamp
        }




        if(isset($request->id)){
            $request->validate([

                'name' => 'required|string|max:255',
                'image' => 'image',

            ]);



            Band::where('id', $request->id)->update([
                'name' => $request->name,
                'image' => $image,
                'updated_at' => now(),
            ]);
            return redirect()->route('bands.index')->with('message', 'Banda actualizada com sucesso!');

        }else{




        //dd($request->all());
        $request->validate([

            'name' => 'required|unique:bands|max:255',
            'image' => 'image',

        ]);


        Band::insert([
            'name'=>$request->name,
            'image'=>$image,

        ]);



        return redirect()->route('bands.index')->with('message', 'Inserido com sucesso');}
    }





    public function apagarBand($id){

        Band::where('id', $id)->delete();

        return  back();

    }




    public function updateBand($id){
        $band = Band::where('id', $id)
        ->first();

        //$allUsers = DB::table('users')->get();

        return view('bands.update', compact('band'));
    }


    public function dashboard(){


        return view('auth.dashboard');
    }








}
