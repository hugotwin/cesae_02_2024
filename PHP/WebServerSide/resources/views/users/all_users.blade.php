@extends('layouts.fe')

@section('content')
    <h1>Olá, aqui tens uma lista de todos os users.</h1>
    <h5>Delegado de turma: {{ $delegadoTurma->name }}: {{ $delegadoTurma->email }}{{ $delegadoTurma->id }}</h5>

    @if(session('message'))

    <div>{{session('message')}}</div>

   @endif

    {{ $cesaeInfo['name'] }}

    <form action="">
            <input class="ms-5" type='text'  value ="{{request()->query('search')}}" name="search"
            id="" placeholder="procurar">
            <button class ="btn btn-secondary">Procurar</button>


    </form>



    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
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
                    <td><a href="{{route('users.view', $user->id)}}" class="btn btn-info">Ver</a></td>
                    <td><a href="{{route('users.delete', $user->id)}}" class="btn btn-danger">Apagar</a></td>

                </tr>
            @endforeach

        </tbody>
    </table>

    <h5>
        <form method="post" action= {{route('users.create')}}>
            @csrf

            <div class="form-group">
              <label for="exampleInputEmail1">Email address</label>
              <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email" value="" required>
              <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            @error('email')
            <div class="Invalid-feedback" >Erro no mail</div>
        @enderror

            <div class="form-group">
                <label for="exampleInputPassword1">Nome</label>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="name" name = "name" value="" required>
            </div>



            <div class="form-group">
              <label for="exampleInputPassword1">Password</label>
              <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password" value="" required>
            </div>



            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </h5>
@endsection
