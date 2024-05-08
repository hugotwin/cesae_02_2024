<?php

namespace App\Http\Controllers;

use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class TaskController extends Controller
{
    public function allTasks(){
        $tasks = $this-> getAllTasks();


        return view('tasks.all_tasks', compact('tasks'));
    }



    protected function getAllTasks(){
        $tasks = DB::table('tasks')
        ->select('tasks.*', 'users.name as username')
        ->join('users', 'users.id', '=', 'tasks.user_id')
        ->get();

        //dd($tasks);

        return  $tasks;



    }


        public function createTask(Request $request){


            //dd($request->all());


            if(isset($request->id)){

                //dd($request->all());


                $request->validate([
                    'name' =>'string|max:30',
                    'description' =>'string|max:50',
                    'username' =>'string|max:50',
                ]);

                Task::where('id', $request->id)
                ->update([
                    'name'=>$request->name,
                    'description'=>$request->description,
                    'user_id' =>$request->user_id

                ]);

                return redirect()->route('tasks.all')->with('message', 'atualizado com sucesso');



            }else{





                $request->validate([
                    'name' =>'string|max:50',
                    'description'=>'string|max:250',


                ]);

                Task::insert([
                    'name'=>$request->name,
                    'description'=>$request->description,
                    'user_id'=>$request->id,

                ]);




                return redirect()->route('tasks.all')->with('message','tarefa enserida com sucesso');






            }



        }



        public function viewTask($id){

            $task = DB::table('tasks')
            ->select('tasks.*', 'users.name as username')
            ->join('users', 'users.id', '=', 'tasks.user_id')
            ->where('tasks.id', $id)
            ->first();

            $users = User::all();



             return view('tasks.viewTask', compact('task', 'users'));
         }




         /*


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



    }*/






}
