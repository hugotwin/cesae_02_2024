<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function allUsers(){

        $cesaeInfo = $this->getCesaeInfo();
        $allUsers = $this->getUsers();

        $delegadoTurma = DB::table('users')
                        ->where('id', 1)
                        ->where('name', 'Sara')
                        ->first();

       // dd( $delegado);
        return view('users.all_users', compact('cesaeInfo', 'allUsers', 'delegadoTurma'));
    }



    public function viewUser($id){

       $user = Db::table('users')->where('id', $id)->first();


        return view('users.user_view', compact('user'));
    }





    public function deleteUser($id){

        DB::table('tasks')->where('user_id', $id)->delete();
        DB::table('users')->where('id', $id)->delete();

        return redirect()->route('users.all');
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


                //->where('name', 'liliana')
       // $users = User::whereNull('updated_at')

                $users = User::all();


        //dd($users);

        return  $users;
    }


    public function createUser(Request $request){

        //$request->all();

        if(isset($request->id)){


            $request->validate([
                'name' =>'string|max:10',
                'cpostal'=>'string',

            ]);

            user::where('id', $request->id)
            ->update([
                'name'=>$request->name,
                'cpostal'=>$request->cpostal,

            ]);

            return redirect()->route('users.all')->with('message', 'atualizado com sucesso');




        }else{

            $request->validate([
                'name' =>'string|max:50',
                'email'=>'required|email|unique:users'

            ]);

            User::insert([
                'name'=>$request->name,
                'email'=>$request->email,
                'password'=>Hash::make($request->password),

            ]);


        //dd($request->all());
        return redirect()->route('users.all')->with('message', 'inserido com suceso');





        }



    }



}
