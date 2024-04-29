@extends('layouts.fe')

@section('content')
    <h1>Olá, aqui tens uma lista de todos os users.</h1>


    <p>{{$cesae->name}}</p>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">password</th>
                <th scope="col">email</th>

            </tr>
        </thead>
        <tbody>
            @foreach ($allUsers as $user)
                <tr>
                    <th scope="row">{{ $user->id }}</th>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->password }}</td>
                    <td>{{ $user->email }}</td>
                    <td><a href ="{{route('users.user', $user->id )}}"class ="btn btn-info" > Ver </a></td>
                    <td><a class ="btn btn-warning">Apagar</a></td>

                </tr>
            @endforeach

        </tbody>
    </table>
@endsection
