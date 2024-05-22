<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TipoUtilizadorController;

Route::get('/', function () {
    return view('welcome');
});


Route::get('/', [TipoUtilizadorController::class, 'dados'])->name('dados');
