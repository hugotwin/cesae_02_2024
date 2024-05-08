<?php

namespace App\Http\Controllers;

use App\Models\Band;
use App\Models\Album;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;

class AlbumController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index($id)
    {

        $albums = $this->show($id);

        //
       return view('bands.albums', compact('albums'));
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
    protected function show(string $id)
    {
        $albums = Album::where('id', $id)->get();
        //dd($albums);
        $bandas_albums = Band::rightJoin('albums', 'bands.id', '=', 'albums.band_id')
        ->selectRaw('bands.name as bandName, albums.*')
        ->where('bands.id', $id)
        ->get();


        return $bandas_albums;

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


    public function apagarAlbum($id){

        Album::where('id', $id)->delete();

        return  back();

    }
}
