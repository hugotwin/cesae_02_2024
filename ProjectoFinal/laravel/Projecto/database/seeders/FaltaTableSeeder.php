<?php

namespace Database\Seeders;

use App\Models\Falta;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class FaltaTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Falta::factory()->count(10)->create();
    }
}
