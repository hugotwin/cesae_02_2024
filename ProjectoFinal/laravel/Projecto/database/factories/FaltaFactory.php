<?php

namespace Database\Factories;

use App\Models\User;
use App\Models\Modulo;
use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Falta>
 */
class FaltaFactory extends Factory
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
            'idModulo' => Modulo::inRandomOrder()->first()->idModulo,
            'dataFalta' => $this->faker->date(),
            'horasFalta' => $this->faker->numberBetween(1, 8),
            'created_at' => now(),
            'updated_at' => now(),
        ];
    }
}
