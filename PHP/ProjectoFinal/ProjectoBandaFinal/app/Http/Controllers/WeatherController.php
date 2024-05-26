<?php

namespace App\Http\Controllers;

use Exception;
use Carbon\Carbon;
use GuzzleHttp\Client;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;


class WeatherController extends Controller
{
    public function getWeather()
    {
        $client = new Client();
        $url = 'https://api.open-meteo.com/v1/forecast?latitude=41.1496&longitude=-8.611&hourly=temperature_2m&forecast_days=1';



        try {
            $response = $client->get($url);
            $data = json_decode($response->getBody(), true);

            // Verifique se a estrutura de dados está correta
            if (!isset($data['hourly']['temperature_2m'], $data['hourly']['time'])) {
                throw new Exception('Unexpected response structure');
            }

            $temperatureData = $data['hourly']['temperature_2m'];
            $timeData = $data['hourly']['time'];

            //dd($temperatureData);


        } catch (Exception $e) {
            return response()->json(['error' => 'Unable to fetch data', 'message' => $e->getMessage()], 500);
        }

        //dd($temperatureData);

        $hora=Carbon::now()->format('H')+1;
        //dd($hora);

        return view('layouts.navbar', compact('temperatureData','hora'));


    }


}
