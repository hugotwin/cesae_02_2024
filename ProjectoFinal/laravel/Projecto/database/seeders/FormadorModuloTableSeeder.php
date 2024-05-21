<?php

namespace Database\Seeders;

use App\Models\FormadorModulo;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class FormadorModuloTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        FormadorModulo::factory()->count(10)->create();
    }
}
