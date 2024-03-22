<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})-> name('home.welcome');


Route::get('/hello/{name}', function ($name) {
    return '<h2>Olá '.$name.'</h2>';
});


Route::get('/home', function () {
    return view('home.index');
})->name('index');// o nme e um alias que permite alterar a pagina html ou o nome a aparecer o url


Route :: fallback(function(){// retorno para uma pagina caso naão encontre uma pagina
    return view('erros.fallback');
});// nao se coloca o nome 

Route::get('/users', function () {
    return view("utilizadores.utilizadores");
})-> name('home.utilizadores');
