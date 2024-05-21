<?php

namespace Database\Seeders;

use App\Models\CursoModulo;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class CursoModuloTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        CursoModulo::factory()->count(10)->create();
    }
}
