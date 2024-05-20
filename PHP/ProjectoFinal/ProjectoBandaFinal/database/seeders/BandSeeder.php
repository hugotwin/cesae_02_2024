<?php

namespace Database\Seeders;

use App\Models\Band;
use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class BandSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {

        Band::factory()->count(5)->create();

    }
}
