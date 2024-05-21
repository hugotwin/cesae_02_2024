<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Curso>
 */
class CursoFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'nameCurso' => $this->faker->unique()->word,
            'duracao' => $this->faker->numberBetween(1, 4), // Supondo que a duração seja de 1 a 8 semestres
            'activeStatus' => $this->faker->boolean,
           
        ];
    }
}
