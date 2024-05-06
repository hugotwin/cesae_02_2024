<?php

namespace App\Http\Controllers;

use App\Models\Gift;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class GiftController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $users_gifts=$this->allData();
        //dd($users_gifts);
        return view('gifts.gifts', compact('users_gifts'));
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

        $gift = DB::table('gifts')
        ->select('users.name as user','gifts.*')
        ->join('users', 'users.id', '=', 'gifts.user_id')
        ->where('gifts.id',$id)
        ->get();

        //dd($gift);

        return view('gifts.giftsDescription', compact('gift'));
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

    protected function allData(){


        $users_gifts = DB::table('gifts')
            ->select('users.name as user','gifts.*')
            ->join('users', 'users.id', '=', 'gifts.user_id')
            ->get();

            //dd($users_gifts);

        return $users_gifts;

    }


    public function delete($id){


        $deleted = DB::table('gifts')->where('id',$id)->delete();

        $users_gifts=$this->allData();
        //dd($users_gifts);
        return back();

    }



    public function createUser(Request $request)
    {
        //

        $request->all();

    }

    public function form()
    {
        //

        return view('forms.formu');

    }






}
