<?php

namespace Database\Factories;

use App\Models\Curso;
use App\Models\Modulo;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\CursoModulo>
 */
class CursoModuloFactory extends Factory
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
            'idModulo' => Modulo::inRandomOrder()->first()->idModulo,
            'activeStatus' => $this->faker->boolean,
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
