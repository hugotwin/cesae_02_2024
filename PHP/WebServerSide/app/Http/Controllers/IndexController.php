<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    //
    public  function index(){
        return view('home.index');

    }

   public function home() {// ver na pagina do servidor
        return view("home.hello");
    }

    

    public function fallback()  {
        return view('erros.fallback');}

    public function nome($name) {
        return '<h2>Olá '.$name.'</h2>';
    }

}
