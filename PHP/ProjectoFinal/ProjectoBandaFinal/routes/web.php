<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BandController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\AlbumController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\TaskApiController;
use App\Http\Controllers\WeatherController;

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
Route::post('/newband', [BandController::class,'insertBand'])->name('bands.newband')->middleware('auth');

Route::get('/albums/{id?}', [AlbumController::class,'index'])->name('bands.albums'); //sempre no fim das rotas ou Route::get('/users/{id?}', [AlbumController::class,'index'])->name('bands.albums');

Route::get('/bands/{id?}', [BandController::class,'apagarBand'])->name('bands.delete')->middleware('auth');

Route::get('/deleteAlbums/{id?}', [AlbumController::class,'apagarAlbum'])->name('bands.albumsDelete')->middleware('auth');

Route::post('/insertAlbums', [AlbumController::class,'insertAlbum'])->name('bands.albumsinsert')->middleware('auth');
Route::get('/updateAlbum/{id}', [AlbumController::class,'updateAlbum'])->name('bands.updateAlbum')->middleware('auth');




Route::get('/newband/{id}', [BandController::class,'updateBand'])->name('bands.update')->middleware('auth');


Route::get('/insertBand', function () {
    return view('bands.insertBand');
})->name('bands.insertBand')->middleware('auth');


Route::post('/create-user', [UserController::class, 'createUser'])->name('users.create')->middleware('auth');
Route::get('/add-user', [UserController::class, 'addUser'])->name('add.user')->middleware('auth');
Route::get('/home', [BandController::class,'index'])->name('bands.index');


Route::get('/user/{id}', [UserController::class, 'viewUser'])->name('users.view')->middleware('auth');;
Route::get('/users', [UserController::class, 'allUsers'])->name('users.all')->middleware('auth');;
Route::get('/delete-user/{id}', [UserController::class, 'deleteUser'])->name('users.delete')->middleware('auth');;
Route::get('/dashboard', [BandController::class, 'dashboard'])->name('auth.dashboard')->middleware('auth');;


// api





