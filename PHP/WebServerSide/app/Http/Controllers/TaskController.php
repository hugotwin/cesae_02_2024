<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
class TaskController extends Controller
{

    public function allTasks()
    {

        $tasks = $this->tarefas();


        return view('tasks.all_tasks', compact('tasks'));

    }


    protected function tarefas()
    {
        $tarefas = DB::table('tasks')
        ->select('tasks.*','users.name as username')
        ->join('users','users.id',"=","tasks.user_id")
        ->get();


            return $tarefas;
    }


}
