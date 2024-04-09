@extends('layouts.fe')

@section('content')
    <h1>Olá, aqui tens uma lista de todos os users.</h1>

    <h1>{{$variavel['name']}}</h1>

    <ul>




        <div class= "container text-center">
        <table class="table">
            <thead>
              <tr>
                <th scope="col">id</th>
                <th scope="col">nome</th>
                <th scope="col">contacto</th>

              </tr>
            </thead>
            <tbody>

                @foreach ($users as $user)
              <tr>

                <td scope="row">{{$user['id']}}</td>
                <td>{{$user['name']}}</td>
                <td>{{$user['phone']}}</td>

              </tr>

                 @endforeach
            </tbody>
          </table>
        </div>







        </ul>




@endsection
