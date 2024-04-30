@extends('layouts.fe')

@section('content')
    <

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Nome da prenda</th>
                <th scope="col">Nome</th>
                <th scope="col">Valor Previsto</th>
                <th cope="col">Valor gasto</th>
                <th cope="col">Descrição</th>

            </tr>
        </thead>
        <tbody>
            @foreach ($gift as $gift)
                <tr>
                    <td scope="row">{{$gift->name}}</td>
                    <td>{{$gift->user}}</td>
                    <td>{{$gift->topValue}}</td>
                    <td>{{$gift->spendValue}}</td>
                    <td>{{$gift->description}}</td>

                </tr>
            @endforeach

        </tbody>
    </table>
@endsection
