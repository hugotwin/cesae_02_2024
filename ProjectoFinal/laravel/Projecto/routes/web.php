<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TipoUtilizadorController;

Route::get('/welcome', function () {
    return view('welcome');
});

Route::get('/home', [TipoUtilizadorController::class, 'dados'])->name('dados');
