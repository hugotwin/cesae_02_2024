<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('curso_modulos', function (Blueprint $table) {

            $table->unsignedBigInteger('idCurso');
            $table->unsignedBigInteger('idModulo');
            $table->boolean('activeStatus')->default(true);
            $table->primary(['idCurso', 'idModulo']);
            $table->foreign('idCurso')->references('idCurso')->on('cursos')->onDelete('cascade');
            $table->foreign('idModulo')->references('idModulo')->on('modulos')->onDelete('cascade');
            $table->timestamps();
            $table->unique(['idCurso', 'idModulo']);


        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('cursoModulos');
    }
};
