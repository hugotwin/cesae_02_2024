<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BandController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\AlbumController;
use App\Http\Controllers\LoginController;

/*Route::get('/', function () {
    return view('welcome');
});*/

//Route::get('/', [IndexController::class,'index'])->name('index.index');

/*Route::get('/albums', function () {
    return view('bands.albums');
})->name('bands.albums');*/

//Route::resource('/band', 'BandController');
//Route::resource('bands.albums', 'AlbumController');// nome da pagina html e do controlador


Route::get('/', [BandController::class,'index'])->name('bands.index');
Route::post('/newband', [BandController::class,'insertBand'])->name('bands.newband');

Route::get('/albums/{id?}', [AlbumController::class,'index'])->name('bands.albums'); //sempre no fim das rotas ou Route::get('/users/{id?}', [AlbumController::class,'index'])->name('bands.albums');

Route::get('/bands/{id?}', [BandController::class,'apagarBand'])->name('bands.delete');

Route::get('/deleteAlbums/{id?}', [AlbumController::class,'apagarAlbum'])->name('bands.albumsDelete');

Route::post('/insertAlbums', [AlbumController::class,'insertAlbum'])->name('bands.albumsinsert');

Route::get('/newband/{id}', [BandController::class,'updateBand'])->name('bands.update');
Route::get('/insertBand', function () {
    return view('bands.insertBand');
})->name('bands.insertBand');

