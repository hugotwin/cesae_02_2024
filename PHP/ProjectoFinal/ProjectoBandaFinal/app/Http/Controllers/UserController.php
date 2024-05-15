<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{


   /* public function __construct(){

            $this->middleware('auth');

    }*/

    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }




    public function addUser()
    {
        return view('users.create_user');
    }



    public function createUser(Request $request){

        if(isset($request->id)){
            $request->validate([
                'name' => 'string',
                

            ]);

            User::where('id', $request->id)
            ->update([
                'name' => $request->name,
                'user_type' => $request->user_type,

            ]);




            return redirect()->route('users.all')->with('message', 'User actualizado com sucesso');

        }else{

            $request->validate([
                'name' => 'string|max:10',
                'password' => 'required|min:5',
                'email' => 'required|email|unique:users',
            ]);

        User::insert([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password),
        ]);

        return redirect()->back()->with('message', 'User adicionado com sucesso');
        }


    }



    public function allUsers(){





        $search = request()->query('search')?request()->query('search'):null;

        if( $search){
            $allUsers = DB::table('users')
            ->where('name', 'LIKE', "%{$search}%")
            ->orWhere('email', 'LIKE', "%{$search}%")
            ->get();
        }else{
             //query que busca todos os users
            $allUsers = Db::table('users')->get();
        }


       // dd( $delegado);
        return view('users.all_users', compact( 'allUsers' ));
    }

    public function deleteUser($id){

        DB::table('tasks')->where('user_id', $id)->delete();
        DB::table('users')->where('id', $id)->delete();

        return redirect()->route('users.all');
     }


     public function viewUser($id){

        $user = Db::table('users')->where('id', $id)->first();


         return view('users.user_view', compact('user'));
     }





}
