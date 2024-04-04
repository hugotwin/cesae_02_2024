<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function utilizadores() {// ver na pagina do servidor
        $sum = $this->sum(1,3);


        return view("utilizadores.utilizadores");
    }

    protected function sum($sum1,$sum2sum2){

     return $sum1+$sum2;

    }
}
