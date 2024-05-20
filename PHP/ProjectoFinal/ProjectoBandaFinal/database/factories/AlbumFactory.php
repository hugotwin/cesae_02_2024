<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Album>
 */
class AlbumFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        return [
            'name' => $this->faker->name(),
            'image' => $this->faker->unique()->imageUrl(640, 480, 'bands', true),
            'band_id' => $this->faker->numberBetween(1, 5),
            'release_date' => $this->faker->date(), // Generates a URL to a placeholder image
        ];
    }
}
