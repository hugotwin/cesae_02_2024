
@extends('Layouts.fe')

@section('content')





<div class="container mt-5">
    <h1 class="mb-4">The  best albums from {{$albums[0]['bandName'] }}</h1>
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
        @foreach($albums as $album)
            <tr>
                <td>{{ $album['name'] }}</td>
                <td><img src="{{ $album['image'] }}" alt="{{ $album['name'] }}" style="max-width: 100px;"></td>
                <td>{{ $album['release_date'] }}</td> <!-- deve ser o numero de albuns" -->
                <td>
                    <a href="{{route('bands.albums',[$album['id']])}}" class="btn btn-primary">Ver Álbuns</a>
                </td>
                <td>
                    @auth
                    @if(Auth::user()->user_type==2)
                      <a href="{{route('bands.albumsDelete',[$album['id']])}}" class="btn btn-warning">Apagar album</a>
                    @endif
                    @endauth

                </td>
                @auth
                <td> <a href="" class="btn btn-info-sm" >Update album</a> </td>
                @endauth
        </tr>

        @endforeach
        </tbody>
    </table>
</div>


@auth
@if(Auth::user()->user_type==2)
<div class ="container">
    <div class='row'>
        <div  class='col-3 offset-3'>


    <form method = "post"  action = "{{route('bands.albumsinsert')}}">
        @csrf

        <input type="hidden" name="band_id" value = {{$albums[0]['band_id'] }}>
        <div class="form-group">
          <label for="exampleInputEmail1">Nome do album</label>
          <input type="text" class="form-control" id="name"  name="name" aria-describedby="emailHelp" placeholder="Nome do album">
          @error('name')
          <label>Nome do album invalido</label>
          @enderror


        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Imagem -URL-</label>
            <input type="url" class="form-control" id="name" name ="image" aria-describedby="emailHelp" placeholder="imagem 'url'">
            @error('image')
            <label>Nome do album invalido</label>
            @enderror

        </div>


        <div class="form-group">
            <label for="exampleInputEmail1">Imagem -URL-</label>
            <input type="date" class="form-control" id="name" name ="release_date" aria-describedby="emailHelp" placeholder="Release date'">
            @error('release_date')
            <label>Data inválida</label>
            @enderror

        </div>







        <div class='text-center m-2'><button type="submit" class="btn btn-primary">Adicionar</button></div>
    </form>

    @if(session('message'))
    <div class="alert alert-success" role="alert">
        {{ session('message') }}
    </div>
    @endif

</div>
@endif
@endauth
</div>
</div>







@endsection

