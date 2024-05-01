<?php

namespace App\Http\Controllers;

use App\Models\Task;
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

            $request->validate([
                'name' =>'string|max:50',
                'description'=>'string|max:50',

            ]);

            Task::insert([
                'name'=>$request->name,
                'description'=>$request->description,
                'user_id'=>$request->id,

            ]);




            return redirect()->route('tasks.all')->with('message','tarefa enserida com sucesso');

        }






}
