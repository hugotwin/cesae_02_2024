<?php

namespace Database\Seeders;

use App\Models\User;
// use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Database\Seeders\CursoTableSeeder;
use Database\Seeders\TurmaTableSeeder;
use Database\Seeders\UsersTableSeeder;
use Database\Seeders\ModuloTableSeeder;
use Database\Seeders\CursoModuloTableSeeder;
use Database\Seeders\LocalizacaoTableSeeder;
use Database\Seeders\ModuloFormandoTableSeeder;
use Database\Seeders\TipoUtilizadorTableSeeder;
use Database\Seeders\UtilizadorTurmaTableSeeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     */
    public function run(): void
    {
        //User::factory(10)->create();

        $this->call(TipoUtilizadorTableSeeder::class);

        $this->call([UsersTableSeeder::class,]);

        $this->call([CursoTableSeeder::class,]);

        $this->call([LocalizacaoTableSeeder::class,]);

        $this->call([
            ModuloTableSeeder::class,
        ]);

        $this->call([
            TurmaTableSeeder::class,
            // Outros seeders se necessário
        ]);

        $this->call([
            UtilizadorTurmaTableSeeder::class,

        ]);

        $this->call([
            CursoModuloTableSeeder::class,
            // Outros seeders se necessário
        ]);


        $this->call([
            ModuloFormandoTableSeeder::class,
            // Outros seeders se necessário
        ]);

        $this->call([
            FormadorModuloTableSeeder::class,
            // Outros seeders se necessário
        ]);

        $this->call([
            FaltaTableSeeder::class,
            // Outros seeders se necessário
        ]);



    }
}
