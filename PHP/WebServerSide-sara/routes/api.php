<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

Route::get('/user', function (Request $request) {
    return $request->user();
})->middleware('auth:sanctum');

//Route::get('/task/{task}', [TaskApiController::class, 'show']);

Route::apiResource('/task', TaskApiController::class);

