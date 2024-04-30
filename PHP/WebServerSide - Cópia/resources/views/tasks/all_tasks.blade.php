@extends('layouts.fe')
@section('content')


    <h1>Tarefas</h1>
    <ol>
        <li>Rui: mudar as tarefas da turma</li>
        <li>Maru: dizer à Sara para ir mais devagar</li>

        <table class="table">
            <thead>
                <tr>

                    <th scope="col">tarefa</th>
                    <th scope="col">descricao</th>
                    <th scope="col">username</th>
                    <th scope="col">id_user</th>

                </tr>
            </thead>
            <tbody>
                @foreach ($tasks as $task)
                    <tr>
                        <th scope="row">{{ $task->name }}</th>
                        <td>{{ $task->description }}</td>
                        <td>{{ $task->username}}</td>
                        <td>{{ $task->user_id}}</td>
                      


                    </tr>
                @endforeach

            </tbody>
        </table>

@endsection
