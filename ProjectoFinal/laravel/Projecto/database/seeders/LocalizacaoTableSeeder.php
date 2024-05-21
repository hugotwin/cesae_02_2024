<?php

namespace Database\Seeders;

use App\Models\Localizacao;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class LocalizacaoTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Localizacao::factory()->count(10)->create();
    }
}
