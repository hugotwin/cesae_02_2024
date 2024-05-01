@extends('layouts.fe')

@section('content')
    <h4>Tarefas</h4>

    @if (@session('message'))

    <div>{{session('message')}}</div>

    @endif

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome da Tarefa</th>
                <th scope="col">Responsável da Tarefa</th>
                <th scope="col">Descrição</th>
            </tr>
        </thead>
        <tbody>
            @foreach ($tasks as $key)
                <tr>
                    <th scope="row">{{ $key->id }}</th>
                    <td>{{ $key->name }}</td>
                    <td>{{ $key->username }}</td>
                    <td>{{ $key->description }}</td>
                </tr>
            @endforeach
        </tbody>
    </table>


<h5>
    <form method="post" action= {{route('tasks.create')}}>
        @csrf

        <div class="form-group">
          <label for="exampleInputEmail1">nome tarefa</label>

          <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="nome da tarefa" name="name" value="" required>

        </div>
        @error('email')
        <div class="Invalid-feedback" >Erro no mail</div>
        @enderror

        <div class="form-group">
            <label for="exampleInputPassword1">Descrição</label>
            <input type="text" class="form-control" id="exampleInputPassword1" placeholder="descrição " description = "description" value="" required>
        </div>



        <div class="form-group">
          <label for="exampleInputPassword1">id</label>
          <input type="number" class="form-control" id="exampleInputPassword1" placeholder="id" name="id" value="" required>
        </div>


        <select class="form-select" aria-label="Default select example" name='id'>
            <option selected>Open this select menu</option>
            @foreach ($tasks as $key)
            <option value={{ $key->id }}>{{ $key->username }}</option>
          </select>

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </h5>

@endsection
