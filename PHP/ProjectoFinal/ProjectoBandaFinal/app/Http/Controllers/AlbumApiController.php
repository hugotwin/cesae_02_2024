<?php

namespace App\Http\Controllers;

use App\Models\Album;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use App\Http\Resources\AlbumResourceCollection;

class AlbumApiController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index():AlbumResourceCollection
    {
        return new AlbumResourceCollection(resource: Album::paginate(2) );
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
        $request->validate([
            'band_id'=>'required',
            'name'=>'required|string',
            'image'=>'url',
            'release_date'=>'date',
            ]);

            $album =Album::create($request->all());

            return response()->json('album inserido');
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
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
    public function update(Request $request, string $id,Album $album)
    {
        $album->update($request->all());

        return response()->json('ok');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        $album->delete();

        return response()->json(null, 204);
    
    }
}
