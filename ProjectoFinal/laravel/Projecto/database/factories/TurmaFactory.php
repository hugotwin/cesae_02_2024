<?php

namespace Database\Factories;

use App\Models\Curso;
use App\Models\Localizacao;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Turma>
 */
class TurmaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'idCurso' => Curso::inRandomOrder()->first()->idCurso,
            'idLocalizacao' => Localizacao::inRandomOrder()->first()->idLocalizacao,
            'dataInicio' => $this->faker->date(),
            'dataFim' => $this->faker->date(),
            'nome' => $this->faker->unique()->word,
            'activeStatus' => $this->faker->boolean,
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
