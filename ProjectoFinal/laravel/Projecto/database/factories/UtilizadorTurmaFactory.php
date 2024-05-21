<?php

namespace Database\Factories;

use App\Models\User;
use App\Models\Turma;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\UtilizadorTurma>
 */
class UtilizadorTurmaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'idUser' => User::inRandomOrder()->first()->id,
            'idTurma' => Turma::inRandomOrder()->first()->idTurma,
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
