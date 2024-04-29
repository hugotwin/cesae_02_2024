<?php

use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\TaskController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('home.welcome');

Route::get('/home', [IndexController::class, 'homePage'] )->name('homenomedarotaparachamarno<a></a>');

Route::get('/users', [UserController::class, 'allUsers'])->name('users.all');

Route::get('/tasks', function () {
    return view('c');
})->name('tasks.all');


Route::get('/hello', [IndexController::class, 'helloWorld'])->name('home.hello');

Route::get('/hello/{name}', function ($name) {
    return '<h2>Olá '.$name.'</h2>';
});

//rota fallback - para onde vai caso o user coloque um url que não existe

Route::fallback(function(){
    return view('errors.fallback');
});

Route::get('/users/view/{id}', [UserController::class, 'viewUsers'])->name('users.user');

Route::get('/user-dd', [UserController::class, 'userAdd'])->name('users.useradd');

Route::get('/user-update', [UserController::class, 'userUpdate'])->name('users.userUpdate');

Route::get('/all_tasks', [TaskController::class, 'allTasks'])->name('users.allTasks');
