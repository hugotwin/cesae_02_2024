<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function allUsers(){

        $variavel=$this->getCesae();

        $users = $this->getUsers();

        //dd($users);


        return view('users.all_users', compact('variavel', 'users'));
    }


  protected function getCesae(){

    $myvar=['name'=>'cesae','adress'=>'rua...','email'=>'cesae@cesae.pt'];

        return $myvar;
  }



  protected function getUsers()
  {
        $users = [
            ['id'=>1,'name'=>'ana', 'phone'=>'987654321'],
            ['id'=>2,'name'=>'luis', 'phone'=>'987654321'],
            ['id'=>3,'name'=>'jose', 'phone'=>'987654321'],
            ['id'=>4,'name'=>'hugo', 'phone'=>'987654321'],
        ];


        return $users;

}


}
