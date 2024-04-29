<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Band;//preciso colocar o caminho do model
use DB;

class BandController extends Controller
{
    /**
     * Display a listing of the resource.
     */


    public function index()
    {
        //$bands = $this->bands();
        $bands=$this->numberAlbums();
        return view('index.index', compact('bands'));
    }


    protected function bands()
    {
        $bands = Band::all();
        return $bands;
    }


    protected function numberAlbums()
    {

        //$bandas_albums = DB::select('select count(*) as total, bands.name, bands.image from bands join albums on bands.id=albums.band_id group by albums.band_id');
        $bandas_albums = Band::join('albums', 'bands.id', '=', 'albums.band_id')
        ->selectRaw('COUNT(*) as total, bands.name, bands.image, bands.id')
        ->groupBy('bands.id', 'bands.name', 'bands.image')
        ->get();
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
}
