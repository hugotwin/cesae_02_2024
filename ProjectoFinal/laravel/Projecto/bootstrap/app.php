<?php

use Illuminate\Foundation\Application;
use Illuminate\Foundation\Configuration\Exceptions;
use Illuminate\Foundation\Configuration\Middleware;
use Illuminate\Support\Facades\Route;


return Application::configure(basePath: dirname(__DIR__))
->withRouting(
    commands: __DIR__.'/../routes/console.php',
    using: function () {
        Route::middleware('api')
            ->prefix('api')
            ->group(base_path('routes/api.php'));

        Route::middleware('web')
            ->group(base_path('routes/web.php'));

            Route::middleware('web')
            ->group(base_path('routes/admin.php'));


    },
)
->withMiddleware(function (Middleware $middleware) {
    // Defina middlewares globais aqui
})
->withExceptions(function (Exceptions $exceptions) {
    // Defina manipulação de exceções aqui
})
->create();
