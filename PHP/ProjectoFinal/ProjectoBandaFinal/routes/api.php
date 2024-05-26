<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TaskApiController;
use App\Http\Controllers\AlbumApiController;

Route::get('/user', function (Request $request) {
    return $request->user();
})->middleware('auth:sanctum');



Route::apiResource('/task', TaskApiController::class);
Route::apiResource('/album', AlbumApiController::class);
