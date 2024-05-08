@extends('layouts.fe')

@section('content')

    <h4>Tarefas</h4>

    <h5>
    <form method="POST" action="{{route('tasks.create')}}">
        @csrf

        <div class="form-group">
          <label for="exampleInputEmail1">nome tarefa</label>
          <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="{{$task->name}}" name="name" value="{{$task->name}}" required>
        </div>
        @error('name')
        <div class="Invalid-feedback" >Erro no mail</div>
        @enderror
        <div class="form-group">
            <label for="exampleInputPassword1">Descrição</label>
            <input type="text" class="form-control" id="exampleInputPassword1" placeholder="{{$task->description}}" name = "description" value="{{$task->description}}" required>
        </div>



     



        <input type ='hidden'name="id" value="{{$task->id}}" >



        <select class="form-select" aria-label="Default select example" name='user_id' >
            <option  value={{ $task->user_id }} selected>{{$task->username}}</option>
            @foreach ($users as $user)
            <option value={{ $user->id }}>{{ $user->name }}</option>
            @endforeach
          </select>





        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </h5>

@endsection
