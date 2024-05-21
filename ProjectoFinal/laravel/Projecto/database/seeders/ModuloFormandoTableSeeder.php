<?php

namespace Database\Seeders;

use App\Models\ModuloFormando;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class ModuloFormandoTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        ModuloFormando::factory()->count(10)->create();
    }
}
