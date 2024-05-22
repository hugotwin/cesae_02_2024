<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Http\Controllers\Controller;

class TipoUtilizadorController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }



    public function dados(){

       /* $dados=DB::table('tipo_utilizadors')
        ->join('users', 'tipo_utilizadors.idTipoUtilizador', '=', 'users.idTipoUtilizador')
        ->where('tipo_utilizadors.tipoUtilizador', 'formando')
        ->select('tipo_utilizadors.tipoUtilizador', 'users.name')
        ->get(); // indica todos fornmandos que existem*/


        /*$dados= DB::table('tipo_utilizadors')
    ->join('users', 'tipo_utilizadors.idTipoUtilizador', '=', 'users.idTipoUtilizador')
    ->leftJoin('utilizador_turmas', 'utilizador_turmas.idUser', '=', 'users.id')
    ->join('turmas', 'turmas.idTurma', '=', 'utilizador_turmas.idTurma')
    ->where('tipo_utilizadors.tipoUtilizador', 'formando')
    ->select('tipo_utilizadors.tipoUtilizador', 'users.name', 'turmas.nome')
    ->get(); //mostra todos formados e as turmas*/

    /*$dados = DB::table('turmas')
    ->join('localizacaos', 'localizacaos.idLocalizacao', '=', 'turmas.idLocalizacao')
    ->join('cursos', 'turmas.idCurso', '=', 'cursos.idCurso')
    ->select('turmas.nome as turma', 'cursos.nameCurso as curso', 'localizacaos.localizacao')
    ->get();// mostra to as turmas o nome localizacao e nome do curso*/

    /*$dados = DB::table('tipo_utilizadors')
    ->join('users', 'tipo_utilizadors.idTipoUtilizador', '=', 'users.idTipoUtilizador')
    ->leftJoin('formador_modulos', 'formador_modulos.idUser', '=', 'users.id')
    ->join('modulos', 'modulos.idModulo', '=', 'formador_modulos.idModulo')
    ->where('tipo_utilizadors.tipoUtilizador', 'formador')
    ->select('tipo_utilizadors.tipoUtilizador', 'users.name', 'modulos.nameModulo')
    ->get();*/// formador e modulo juntos

    /*$result = DB::table('tipo_utilizadors')
    ->join('users', 'tipo_utilizadors.idTipoUtilizador', '=', 'users.idTipoUtilizador')
    ->leftJoin('formador_modulos', 'formador_modulos.idUser', '=', 'users.id')
    ->leftJoin('modulos', 'modulos.idModulo', '=', 'formador_modulos.idModulo')
    ->leftJoin('curso_modulos', 'curso_modulos.idModulo', '=', 'modulos.idModulo')
    ->leftJoin('cursos', 'curso_modulos.idCurso', '=', 'cursos.idCurso')
    ->leftJoin('turmas', 'turmas.idCurso', '=', 'cursos.idCurso')
    ->where('tipo_utilizadors.tipoUtilizador', 'formador')
    ->select('tipo_utilizadors.tipoUtilizador', 'users.name', 'modulos.nameModulo', 'cursos.nameCurso', 'turmas.nome as turmaNome')
    ->get();// indica os formadores todos e os cursos e turmas a que estão associados */






        dd($dados);


        return view('dados', compact('dados'));

    }


}
