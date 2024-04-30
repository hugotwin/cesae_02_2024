<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\GiftController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\IndexController;

Route::get('/', function () {
    return view('welcome');
})->name('home.welcome');

Route::get('/home', [IndexController::class, 'homePage'] )->name('homenomedarotaparachamarno<a></a>');

Route::get('/users', [UserController::class, 'allUsers'])->name('users.all');

Route::get('/user/{id}', [UserController::class, 'viewUser'])->name('users.view');
Route::get('/delete-user/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

Route::get('/add-user', [UserController::class, 'addUser'])->name('users.add');


Route::get('/tasks', [TaskController::class, 'allTasks'])->name('tasks.all');


Route::get('/hello', [IndexController::class, 'helloWorld'])->name('home.hello');

Route::get('/hello/{name}', function ($name) {
    return '<h2>Olá '.$name.'</h2>';
});

//rota fallback - para onde vai caso o user coloque um url que não existe

Route::fallback(function(){
    return view('errors.fallback');
});




Route::get('/gifts', [GiftController::class, 'index'])->name('gifts.gift');
Route::get('/gifts/{id?}', [GiftController::class, 'show'])->name('gifts.description');

Route::get('/{id?}', [GiftController::class, 'delete'])->name('gifts.delete');

//Route::get('/register_errado', [GiftController::class, 'form'])->name('forms.formu');

//Route::get('/forms', [GiftController::class, 'createUser'])->name('forms.formulario');

Route::post('/register', [UserController::class, 'createUser'])->name('users.create');
Route::post('/register', [TaskController::class, 'createTask'])->name('tasks.create');



