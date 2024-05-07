@extends('layouts.fe')


@section('content')


<h5>
    <form method="post" action= {{route('users.create')}}>
        @csrf

        <input type="hidden" value="{{ $user->email }}" name="id">

        <div class="form-group">
          <label for="exampleInputEmail1">Email address</label>
          <input readonly type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="{{ $user->email }}" name="email" value="{{ $user->email }}" required>
          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        @error('email')
        <div class="Invalid-feedback" >Erro no mail</div>
    @enderror

        <div class="form-group">
            <label for="exampleInputPassword1">Nome</label>
            <input type="text" class="form-control" id="exampleInputPassword1" placeholder="{{ $user->name }}" name = "name" value="{{ $user->name }}" required>
        </div>



        <div class="form-group">
            <label for="exampleInputPassword1">Codigo postal</label>
            <input type="text" class="form-control" id="exampleInputPassword1" placeholder="{{ $user->cpostal }}" name = "adress" value="{{ $user->cpostal }}" required>
        </div>


        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </h5>












    <h1>Olá, sou um user</h1>

    <h3>Nome: {{ $user->name }}</h3>
    <h3>Email: {{ $user->email }}</h3>
    <h3>Email: {{ $user->password }}</h3>
@endsection
