
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

                <td>
                    @foreach ($bands_albuns as  $albuns )

                    @if ($albuns->id == $band['id'] )
                                {{ $albuns ['total'] }}
                    @endif


                    @endforeach


                </td> <!-- deve ser o numero de albuns" -->
                <td>
                    <a href="{{route('bands.albums',[$band['id']])}}" class="btn btn-primary">Ver Álbuns</a>
                </td>
                <td>
                    <a href="{{route('bands.delete',[$band['id']])}}" class="btn btn-warning">Apagar banda</a>
                </td>
            </tr>
        @endforeach
        </tbody>
    </table>
</div>



<div class ="container">
    <div class='row'>
        <div  class='col-3 offset-3'>


    <form method = "get"  action = "{{route('bands.newband')}}">
        <div class="form-group">
          <label for="exampleInputEmail1">Nome da banda</label>
          <input type="text" class="form-control" id="nameBanda"  name="name" aria-describedby="emailHelp" placeholder="Nome da banda">
          @error('name')
          <label>Nome de banda invalido</label>
          @enderror


        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Imagem -URL-</label>
            <input type="url" class="form-control" id="name" name ="image" aria-describedby="emailHelp" placeholder="imagem 'url'">
            @error('image')
            <label>Nome de banda invalido</label>
            @enderror

        </div>
        <div class='text-center m-2'><button type="submit" class="btn btn-primary">Submit</button></div>
    </form>

    @if(session('message'))
    <div class="alert alert-success" role="alert">
        {{ session('message') }}
    </div>
    @endif

</div>
</div>
</div>

@endsection


