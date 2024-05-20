@extends('layouts.fe')


@section('content')
<div class="container">
    <form method="POST" action="{{ route('users.create') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $user->id }}">
        <input type="hidden" name="oldname" value="{{ $user->name }}">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome</label>
            <input name="name" value="{{ $user->name }}" type="text" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('name')
                erro de name
            @enderror
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Tipo Utilizador</label>
            <input name="user_type" value="{{ $user->user_type }}" type="text" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('user_type')
                erro de name
            @enderror


            
        <button type="submit m-1" class="btn btn-primary">Update User</button>
    </form>
    @if(session('message'))
    <div class="alert alert-success" role="alert">
        {{ session('message') }}
    </div>
    @endif
</div>
@endsection
