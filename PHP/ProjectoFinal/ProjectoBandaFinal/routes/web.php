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


Route::get('/', [BandController::class,'index'])->name('index.index');
Route::get('/login', [LoginController::class,'index'])->name('login.loginForm');
Route::get('/{id?}', [AlbumController::class,'index'])->name('bands.albums'); //sempre no fim das rotas ou Route::get('/users/{id?}', [AlbumController::class,'index'])->name('bands.albums');


