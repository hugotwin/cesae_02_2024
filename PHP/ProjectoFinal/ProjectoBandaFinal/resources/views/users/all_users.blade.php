@extends('layouts.fe')

@section('content')

<div class="container">
    <form action="">
        <input type="text" name="search" value="{{ request()->query('search') }}">
        <button class="btn btn-info">Procurar</button>
    </form>
    @if (session('message'))
        <div class="alert alert-success">
            {{ session('message') }}
        </div>
    @endif

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">Tipo de utilizador</th>
                <th></th>
                <th></th>

            </tr>
        </thead>
        <tbody>
            @foreach ($allUsers as $user)
                <tr>
                    <th scope="row">{{ $user->id }}</th>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->email }}</td>
                    <td>{{ $user->user_type }}</td>
                    <td><a href="{{ route('users.view', $user->id) }}" class="btn btn-warning">update</a></td>
                    <td><a href="{{ route('users.delete', $user->id) }}" class="btn btn-danger">Apagar</a></td>

                </tr>
            @endforeach

        </tbody>
    </table>
    <div>

    <div class="container">
    <h5>Adicionar User</h5>
    <form method="POST" action="{{ route('users.create') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome</label>
            <input name="name" value="" type="text" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('name')
                erro de name
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input name="email" value="{{ old('email') }}" type="email" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('email')
                erro de email
            @enderror
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input name="password" value="" type="password" class="form-control" id="exampleInputPassword1">
            @error('password')
                erro de pass
            @enderror
        </div>


        <div class = 'form-label m-1'>
            <select name="user_type" id="user_type">
                <option>Tipo Utilizador</option>
                <option value ='1'>Utilizador</option>
                <option value ='2'>Administrador</option>

            </select>
        </div>

        <button type="submit" class="btn btn-primary">Guardar User</button>
    </form>
</div>
@endsection
