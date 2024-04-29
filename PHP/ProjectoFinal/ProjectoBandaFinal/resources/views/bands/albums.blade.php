
@extends('Layouts.fe')

@section('content')


<div class="container mt-5">
    <h1 class="mb-4">Albums</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Foto</th>
            <th>Data de lançamento</th>
            <th></th> <!-- Coluna para o botão "Ver Álbuns" -->
        </tr>
        </thead>
        <tbody>
        @foreach($albums as $band)
            <tr>
                <td>{{ $band['name'] }}</td>
                <td><img src="{{ $band['image'] }}" alt="{{ $band['name'] }}" style="max-width: 100px;"></td>
                <td>{{ $band['release_date'] }}</td> <!-- deve ser o numero de albuns" -->
            </tr>
        @endforeach
        </tbody>
    </table>
</div>

@endsection

