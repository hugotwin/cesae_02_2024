<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="{{route("bands.index")}}">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            @auth
            <li><a class="dropdown-item"  href={{route('add.user')}}>Criar utilizador</a></li>
            @endauth
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href={{route('users.all')}}>Ver Utilizadores</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>

@if (Route::has('login'))
  @auth
      <div><p>{{Auth::user()->name}} 🖐️</p></div>
        <nav class="-mx-3 flex flex-1 justify-end">

            <a class="btn btn-outline-info mx-2" href={{route('add.user')}}>Criar utilizador</a>
                <a
                    href="{{ route('auth.dashboard') }}"
                    class="btn btn-outline-success mx-2"
                    >
                    Dashboard
                </a>
            @else
                <a class='text-end'
                    href="{{ route('login') }}"
                    class="btn btn-outline-success mx-2"
                >
                    Log in
                </a>

                @if (Route::has('register'))
                    <a
                        href="{{ route('register') }}"
                        class="rounded-md px-3 py-2 text-black ring-1 ring-transparent transition hover:text-black/70 focus:outline-none focus-visible:ring-[#FF2D20] dark:text-white dark:hover:text-white/80 dark:focus-visible:ring-white"
                    >
                        Register
                    </a>
                @endif
            @endauth
        </nav>
    @endif
        @auth
        <form class="d-flex" method ="POST" action ="{{route('logout')}}">
        @csrf
        <button class="btn btn-outline-info" type="submit">LogOut</button>
        </form>
        @endauth

    </div>

  </div>
</nav>
