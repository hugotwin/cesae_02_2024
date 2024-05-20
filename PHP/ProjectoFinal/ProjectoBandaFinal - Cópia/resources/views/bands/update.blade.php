
@extends('layouts.fe')

@section('content')

<div class ="container">
    <div class='row'>
        <div  class='col-3 offset-3'>

    <form method = "POST"  action = "{{route('bands.newband')}}" enctype="multipart/form-data">
        <div class="form-group">
            @csrf

        <input name="id" type="hidden" value="{{ $band->id }}">

          <label for="exampleInputEmail1">Nome da banda</label>
          <input type="text" class="form-control" id="nameBanda"  value = "{{ $band->name}}" name="name" aria-describedby="emailHelp" placeholder="{{ $band->name }}">
          @error('name')
          <label>Nome de banda invalido</label>
          @enderror

        </div>

        <div class="form-group">
            <label for="photo">Selecione o arquivo: Photo</label>
            <input type="file" id="file" name="image" accept="image/*" name =image><br><br>
            @error('image')
            <label>Endereço de imagem invalido</label>
            @enderror

        </div>
        <div class='text-center m-2'><button type="submit" class="btn btn-primary">Actualizar</button></div>
    </form>

    @if(session('message'))
    <div class="alert alert-success" role="alert">
        {{ session('message') }}
    </div>
    @endif

</div>

@endsection

