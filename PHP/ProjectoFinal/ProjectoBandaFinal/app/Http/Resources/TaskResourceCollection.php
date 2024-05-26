<?php

namespace App\Http\Resources;

use Illuminate\Http\Request;
use App\Http\Resources\TaskResource;
use Illuminate\Http\Resources\Json\ResourceCollection;

class TaskResourceCollection extends ResourceCollection
{
    /**
     * Transform the resource collection into an array.
     *
     * @return array<int|string, mixed>
     */
    public function toArray(Request $request): array
    {
       // return parent::toArray($request);

       return [
        'data' => $this->collection->transform(function ($band) {
            return new TaskResource($band);
        }),];



    }
}
