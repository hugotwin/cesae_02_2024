@extends('layouts.fe')
@section('content')
<h1>sou um utilizador</h1>
  <h1>home page</h1>
    <ul>
    <li><a href="{{route('home.welcome')}}">welcome</a></li><!-- tem o nome das alias  para fazer a religação como jinja do python-->
    <li><a href="{{route('home.utilizadores')}}">users</a></li>
    <li><a href="{{route('home.hello')}}">hello</a></li>
    <li><a href=""></a></li>






    </ul>



@endsection

