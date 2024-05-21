<?php

namespace Database\Factories;

use App\Models\User;
use App\Models\Turma;
use App\Models\Modulo;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\FormadorModulo>
 */
class FormadorModuloFactory extends Factory
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
            'idModulo' => Modulo::inRandomOrder()->first()->idModulo,
            'activeStatus' => $this->faker->boolean,
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
