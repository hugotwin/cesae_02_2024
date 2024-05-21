<?php

namespace Database\Seeders;

use Illuminate\Support\Carbon;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;

class TipoUtilizadorTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {

        DB::table('tipo_utilizadors')->insert([
            [
                'tipoUtilizador' => 'admin',
                'created_at' => Carbon::now(),
                'updated_at' => Carbon::now(),
            ],
            [
                'tipoUtilizador' => 'formando',
                'created_at' => Carbon::now(),
                'updated_at' => Carbon::now(),
            ],
            [
                'tipoUtilizador' => 'formador',
                'created_at' => Carbon::now(),
                'updated_at' => Carbon::now(),
            ],
            // Adicione mais tipos conforme necessário
        ]);
    }


}
