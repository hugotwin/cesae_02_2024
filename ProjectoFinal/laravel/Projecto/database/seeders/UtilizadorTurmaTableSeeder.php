<?php

namespace Database\Seeders;

use App\Models\UtilizadorTurma;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class UtilizadorTurmaTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        UtilizadorTurma::factory()->count(10)->create();
    }
}
