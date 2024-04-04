<?php

use App\Http\Controllers\IndexController;




Route::get('/', function () {
    return view('welcome');
})-> name('home.welcome');


//Route::get('/hello/{name}', function ($name) {
  //  return '<h2>Olá '.$name.'</h2>';
//});

Route::get('/hello/{name}', [IndexController::class, 'nome']);


/*Route::get('/home', function () {
    return view('home.index');// faz ligacao a pagina html nas pasta views nese caso
})->name('index');// o nme e um alias que permite alterar a pagina html ou o nome a aparecer o url dar um nome para depois fazer a ligação so em <a> tage*/


Route::get('/home', [IndexController::class,'index']// faz ligacao a pagina html nas pasta views nese caso
)->name('index');


//Route :: fallback(function(){// retorno para uma pagina caso naão encontre uma pagina
  //  return view('erros.fallback');// faz ligacao a pagina html
//});// nao se coloca o nome



Route :: fallback([IndexController::class, 'fallback']);// nao se coloca o nome


//Route::get('/users', function () {// ver na pagina do servidor
  //  return view("utilizadores.utilizadores");
//})-> name('home.utilizadores');//posso dar o nome que


Route::get('/users',[UserController::class, 'utilizadores'])-> name('home.utilizadores');//posso dar o nome que


//Route::get('/users', function () {// ver na pagina do servidor
  //  return view("utilizadores.utilizadores");
//})-> name('home.utilizadores');//posso dar o nome que


Route::get('/hello_', [IndexController::class, 'home'])-> name('home.hello');//posso dar o nome que
