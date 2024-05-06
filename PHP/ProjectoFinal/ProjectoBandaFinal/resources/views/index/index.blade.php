
@extends('Layouts.fe')
@section('content')

<div class="container mt-5">
    <h1 class="mb-4">Bandas</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Foto</th>
            <th>Número de Álbuns</th>
            <th></th> <!-- Coluna para o botão "Ver Álbuns" -->
        </tr>
        </thead>
        <tbody>
        @foreach($bands as $band)
            <tr>
                <td>{{ $band['name'] }}</td>
                <td><img src="{{ $band['image'] }}" alt="{{ $band['name'] }}" style="max-width: 100px;"></td>
                <td>{{ $band['total'] }}</td> <!-- deve ser o numero de albuns" -->
                <td>
                    <a href="{{route('bands.albums',$band->id)}}" class="btn btn-primary">Ver Álbuns</a>


                </td>
            </tr>


        @endforeach
        </tbody>
    </table>
    
    <a href="{{route('login.loginForm')}}" >Login</a>

</div>

@endsection


