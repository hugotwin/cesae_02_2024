@extends('layouts.fe')
@section('content')

<h1>ola sou um user</h1>

<h1>{{$user->name}}</h1>
<h1>{{$user->email}}</h1>
<h1>{{$user->password}}</h1>


@endsection
