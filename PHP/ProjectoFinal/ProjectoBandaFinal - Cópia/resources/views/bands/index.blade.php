
@extends('Layouts.fe')
@section('content')

<div class="container mt-5">



    <h1 class="mb-4">Bandas</h1>




@if(Auth::check())
@if(Auth::user()->user_type==2)
    <div><a href="{{ route('bands.insertBand') }}" class="btn btn-primary">Inserir bandas</a></div>
    @if(session('message'))
    <div class="alert alert-success m-1" role="alert">
        {{ session('message') }}
    </div>
@endif
@endif
@endif



<div class="container mb-2 text-end">


<form action="">
    <input class="ms-5"  placeholder="Procurar" type="text" name="search" id="name" value ="{{request()->query('search')}}" >
    <button class="btn btn-info" >Procurar</button>
</form>
</div>
    <table class="table text-center">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Foto</th>
            <th>Número de Álbuns</th>
            <th></th>
            @auth
            <th></th> <!-- Coluna para o botão "Ver Álbuns" -->
            <th></th>

            @endauth
        </tr>
        </thead>
        <tbody>
        @foreach($bands as $band)
            <tr>
                <td>{{ $band['name'] }}</td>



                <td><img src="{{$band->image? asset('storage/'.$band->image):asset('storage/OIP.jpg') }}" alt="{{ $band['name'] }}" style="max-width: 100px;"></td>
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
                @auth
                <a href="{{route('bands.update',[$band['id']])}}" class="btn btn-warning">Update</a>
                @endauth

                </td>
                <td>
                    @auth
                    @if(Auth::user()->user_type==2)
                    <a href="{{route('bands.delete',[$band['id']])}}" class="btn btn-danger">Apagar banda</a>
                    @endif
                    @endauth
                </td>






            </tr>
        @endforeach
        </tbody>
    </table>
</div>





</div>
</div>


@endsection


