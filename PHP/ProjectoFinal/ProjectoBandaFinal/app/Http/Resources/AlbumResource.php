<?php

namespace App\Http\Resources;

use Illuminate\Http\Request;
use Illuminate\Http\Resources\Json\JsonResource;

class AlbumResource extends JsonResource
{
    /**
     * Transform the resource into an array.
     *
     * @return array<string, mixed>
     */
    public function toArray(Request $request): array
    {
        return[
            'band_id'=>$this->band_id,
            'nome'=>$this->name,
            'image'=>$this->image,
            'relesea_date'=>$this->relesea_date,
        ];
    }
}
