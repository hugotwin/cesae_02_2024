



@extends('layouts.fe')
@section('titulo')
<title>Pagina</title>
@endsection
@section('content')
    <h1>home page</h1>
    <ul>
    <li><a href="{{route('home.welcome')}}">welcome</a></li><!-- tem o nome das alias  para fazer a religação como jinja do python-->
    <li><a href="{{route('home.utilizadores')}}">users</a></li>
    <li><a href="{{route('home.hello')}}">hello</a></li>
    </ul>


    <p>ola estou aqui</p>
    <img class="img-test" src ="{{asset('img/img.avif')}}"></img>
@endsection
