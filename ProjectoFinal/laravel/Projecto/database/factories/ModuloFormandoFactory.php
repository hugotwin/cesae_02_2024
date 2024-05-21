<?php

namespace Database\Factories;

use App\Models\Turma;
use App\Models\Modulo;
use App\Models\User;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\ModuloFormando>
 */
class ModuloFormandoFactory extends Factory
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
            'nota' => $this->faker->randomFloat(2, 0, 20),
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
