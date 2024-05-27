<html lang="en"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <div class="container-fluid mt-2">
            <nav class="navbar navbar-expand-lg">
              <div class="container-fluid d-flex justify-content-center align-items-center">
                <div class="d-flex flex-column align-items-center ">
                    <img class="w-75 mb-0" src="img/logocesae.png">
                    <span class="text-cesaeblue fs-6 fw-semibold mt-0 ">Portal Formando</span>
                </div>
              </div>
            </nav>
          </div>
    </header>
    <main>
        <section class="vh-100 gradient-custom p-3">
                <div class="container-fluid py-5 h-100 backgroundLogin rounded-3">
                    <div class="container-fluid col-12 col-md-9 col-lg-8 my-auto row mx-auto d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-9 col-lg-8 col-xl-7">
                            <div class="card text-dark rounded-4 p-5">
                                <form method="POST" class="d-flex flex-column" action="{{ route('login') }}">
                                    <div class="card-body p-5 text-center">
                                        <div class="mb-md-5 mt-md-4 pb-5">
                                            <h1 class="fw-bold mb-2 ">Login</h1>
                                            <p class="mb-5">Enter your email and password to login</p>
                                            <div data-mdb-input-init="" class="form-outline form-white mb-4 text-start">
                                                <label class="form-label" for="email">Email</label>
                                                <input type="email" id="inputEmail" class="form-control form-control-lg fs-6 border-0 border-bottom rounded-0" placeholder="Type your Email" name="email">
                                            </div>
                                            <div data-mdb-input-init="" class="form-outline form-white mb-4 text-start">
                                                <label class="form-label text-start" for="password">Password</label>
                                                <input type="password" id="inputPassword" class="form-control form-control-lg fs-6 border-0 border-bottom rounded-0" placeholder="Type your password" name="password">
                                            </div>

                                            <button data-mdb-button-init="" data-mdb-ripple-init="" class="btn btn-lg w-100 px-5 backgroundButton text-uppercase fw-bold text-white mt-4" type="submit">Login</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
    </main>
    <footer>
        <footer class="text-center text-lg-start">
            <div class="container p-4">
              <div class="row align-content-center d-flex flex-row align-items-center justify-content-between">
                <div class="col-6 d-flex justify-content-start">
                  <img src="img/logoCease.png" class="col-6 col-md-3" alt="">
                </div>
                <div class="col-6 d-flex justify-content-end">
                    <div class="">
                        <ul id="iconsFooter" class="d-flex flex-row gap-3 my-auto">
                            <li><a href=""><i class="bi bi-facebook text-cesaepurple"></i></a></li>
                            <li><a href=""><i class="bi bi-linkedin text-cesaeblue"></i></a></li>
                            <li><a href=""><i class="bi bi-youtube text-cesaepink"></i></a></li>
                            <li><a href=""><i class="bi bi-instagram text-cesaepurple"></i></a></li>
                        </ul>
                    </div>
                </div>
              </div>
            </div>
          </footer>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body></html>
