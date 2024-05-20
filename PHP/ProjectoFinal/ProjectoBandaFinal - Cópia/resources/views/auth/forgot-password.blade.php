@extends('layouts.fe')


@section('content')
<div class='container'>
    <form method="POST" action="{{ route('password.email') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
       @error('email')
     <div><label class="alert">Email inválido: {{ $message }}</label></div>
    @enderror

        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

    @if (session('status'))
    <div class="alert alert-info">
        {{ session('status') }}
    @endif
    </div>
</div>


@endsection
