<?php

namespace Database\Seeders;

use App\Models\Turma;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class TurmaTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Turma::factory()->count(10)->create();
    }
}
