@extends('layouts.fe')

@section('content')

<div class ="container">
    <div class='row'>
        <div  class='col-3 offset-3'>

    <form method = "POST"  action = "{{route('bands.albumsinsert')}}" enctype="multipart/form-data">

          @csrf
        <div class="form-group">


        <input name="id" type="hidden" value="{{ $album->id }}">

          <label for="exampleInputEmail1">Nome do album</label>
          <input type="text" class="form-control" id="nameBanda"  value = "{{ $album->name}}" name="name" aria-describedby="emailHelp" placeholder="{{ $album->name }}">
          @error('name')
          <label>Nome do album invalido</label>
          @enderror

        </div>

        <div class="form-group">
            <label for="photo">Selecione o arquivo: Photo</label>
            <input type="file" id="file" name="image" accept="image/*" name =image><br><br>
            @error('image')
            <label>Endereço de imagem invalido</label>
            @enderror

        </div>

        <div class="form-group">
            <label for="release_date">Data de lançamento</label>
            <input type="date" id="file" name="release_date"><br><br>
            @error('release_date')
            <label>Erro na data </label>
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
