
@extends('layouts.fe')

@section('content')

<div class = 'container '>
<div class='row offset-3'>
<div class='col col-lg-5'>
<h5>Login</h5>
<form method="POST" action="{{ route('login') }}">
    @csrf
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    @error('email')
    <label class="alert">Email inválido: {{ $message }}</label>
    @enderror

    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input  name="password" type="password" class="form-control" id="exampleInputPassword1">
    </div>
    @error('password')
    <label class="alert">{{ $message }}</label>
    @enderror
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
    <a href="{{route('password.request')}}">recuperacao pass</a>

</form>
</div>
</div>

@if (session('status'))
    <div class="alert alert-info">
        {{ session('status') }}
    </div>
@endif

</div>




@endsection
