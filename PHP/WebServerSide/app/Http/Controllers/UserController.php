<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function allUsers(){


        $cesae=$this->getCesaeInfo();
        $allUsers = $this->getUsers();
        //dd( $allUsers);
        return view('users.all_users', compact('allUsers','cesae'));
    }

    protected function getCesaeInfo(){
        $cesaeInfo =DB::table('users')
        ->where('name', 'hugo')
        ->first();

        return     $cesaeInfo;
    }

    protected function getUsers(){
       /* $users = [
            ['id'=> 1, 'name'=> 'Ana', 'phone'=> '912222333'],
            ['id'=>2, 'name'=> 'Luís', 'phone'=> '912222333'],
            ['id'=>3, 'name'=> 'Miguel', 'phone'=> '912222333'],
            ['id'=>4, 'name'=> 'Jéssica', 'phone'=>'912222333'],
            ['id'=> 5, 'name'=>  'Filipe','phone'=> '912222333'],
        ];*/

       // $users = DB::table('users')->get();
        //dd($users);
        $users =DB::table('users')
        ->where('name', 'hugo')
        ->get();

       /* $users =DB::table('users')
        ->where('name', 'hugo')
        ->firts(); -- vai buscar
*/




        return  $users;
    }


    public function viewUsers($id){

        $user =DB::table('users')->where('id',$id)->first();

        return view('users.userview', compact('user'));
    }



    public function userAdd(){

        DB::table('users')
        ->insert([
            'name'=>'ricardo',
            'email'=>'ricardo@gmail',
            'password'=>12345
        ]);
    }
    public function userUpdate(){

        DB::table('users')
        ->updateOrInsert(
            [
           'email'=>"manel@gmail"
            ],
           [
            'name'=>'manel',
           'password'=>123654,
           'updated_at'=>now()
        ]);
    }







}
