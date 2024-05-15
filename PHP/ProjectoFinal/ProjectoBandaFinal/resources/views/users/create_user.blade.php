@extends('layouts.fe')


@section('content')

<div class='container'>
<form method="POST" action="{{ route('users.create') }}">
    @csrf


<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Nome do utilizador</label>
    <input name="name" value="" type="text" class="form-control" id="exampleInputEmail1"
        aria-describedby="emailHelp">
    @error('name')
        erro de name
    @enderror
</div>


<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">password</label>
    <input name="password" value="" type="password" class="form-control" id="exampleInputEmail1"
        aria-describedby="emailHelp">
    @error('password')
        Erro na password
    @enderror
</div>


<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input name="email" value="" type="email" class="form-control"
        id="exampleInputEmail1" aria-describedby="emailHelp">
    @error('email')
        Erro no email
    @enderror
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
</div>

<div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
</div>


<button type="submit" class="btn btn-primary"> Criar User</button>

@if(session('message'))
<div class="alert alert-success" role="alert">
    {{ session('message') }}
</div>
@endif
</form>
</div>

@endsection
