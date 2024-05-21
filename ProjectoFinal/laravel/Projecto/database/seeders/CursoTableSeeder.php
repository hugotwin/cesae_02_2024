<?php

namespace Database\Seeders;

use App\Models\Curso;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class CursoTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Curso::factory()->count(10)->create();
    }
}
