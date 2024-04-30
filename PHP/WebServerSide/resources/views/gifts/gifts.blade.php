@extends('layouts.fe')

@section('content')
    <

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Nome da prenda</th>
                <th scope="col">Nome</th>
                <th scope="col">Valor Previsto</th>
                <th></th>
                <th></th>

            </tr>
        </thead>
        <tbody>
            @foreach ($users_gifts as $gift)
                <tr>
                    <td scope="row">{{$gift->name}}</td>
                    <td>{{$gift->user}}</td>
                    <td>{{$gift->topValue}}</td>
                    <td><a href="{{route('gifts.description',$gift->id)}}" class="btn btn-info">Ver detalhes</a></td>

                    <td><a href="{{route('gifts.delete',$gift->id)}}" class="btn btn-danger">Apagar</a></td>

                </tr>
            @endforeach

        </tbody>
    </table>
@endsection
