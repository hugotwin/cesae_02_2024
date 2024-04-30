<?php

use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TaskController;

Route::get('/', function () {
    return view('welcome');
})->name('home.welcome');

Route::get('/home', [IndexController::class, 'homePage'] )->name('homenomedarotaparachamarno<a></a>');

Route::get('/users', [UserController::class, 'allUsers'])->name('users.all');
Route::get('/user', [UserController::class, 'viewUser'])->name('users.view');
Route::get('/add-user', [UserController::class, 'addUser'])->name('users.add');

/*
Route::get('/tasks', function () {
    return view('tasks.all_tasks');
})->name('tasks.all');*/

Route :: get ('/tasks',[TaskController::class, 'allTasks'])->name('tasks.all');


Route::get('/hello', [IndexController::class, 'helloWorld'])->name('home.hello');

Route::get('/hello/{name}', function ($name) {
    return '<h2>Olá '.$name.'</h2>';
});

//rota fallback - para onde vai caso o user coloque um url que não existe

Route::fallback(function(){
    return view('errors.fallback');
});

Route::get('/user/{id}', [UserController::class, 'userInfo'])->name('users.user');


