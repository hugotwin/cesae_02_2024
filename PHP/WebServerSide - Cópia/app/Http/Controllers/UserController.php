<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function allUsers(){
        $cesaeInfo = $this->getCesaeInfo();
        $allUsers = $this->getUsers();

        $delegadoTurma = DB::table('users')
                        ->where('id', 4)
                        ->where('name', 'Sara')
                        ->first();

       // dd( $delegado);
        return view('users.all_users', compact('cesaeInfo', 'allUsers', 'delegadoTurma'));
    }

    public function viewUser(){
        return view('users.user_view');
    }

    public function addUser(){

        DB::table('users')
        ->updateOrInsert(
            [
            'email' => 'liliana@gmail.com',
            ],
            [
            'name' => 'liliana',
            'password'=> 6666,
            'updated_at'=>now()
        ]);

    }

    protected function getCesaeInfo(){
        $cesaeInfo = [
            'name'=>'cesae',
            'address' =>'rua do cesae'
        ];

        return     $cesaeInfo;
    }

    protected function getUsers(){
        /*$users = [
            ['id'=> 1, 'name'=> 'Ana', 'phone'=> '912222333'],
            ['id'=>2, 'name'=> 'Luís', 'phone'=> '912222333'],
            ['id'=>3, 'name'=> 'Miguel', 'phone'=> '912222333'],
            ['id'=>4, 'name'=> 'Jéssica', 'phone'=>'912222333'],
            ['id'=> 5, 'name'=>  'Filipe','phone'=> '912222333'],
        ];*/

        $users = DB::table('users')
                //->where('name', 'liliana')
                ->whereNotNull('updated_at')
                ->get();

        //dd($users);

        return  $users;
    }

//-----------------------------
    protected function infoId($id){

        $user = DB::table('users')
                ->where('id', $id)
                ->first();

       //dd($user);

        return $user;
    }

//------------------------------

public function userInfo($id)
{

    $user = $this->infoId($id);
    //dd($user);

    return view('users.userview',compact('user'));

}





}
