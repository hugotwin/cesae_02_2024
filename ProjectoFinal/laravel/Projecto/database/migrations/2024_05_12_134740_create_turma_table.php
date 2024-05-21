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
        Schema::create('turmas', function (Blueprint $table) {
            $table->id('idTurma');
            $table->unsignedBigInteger('idCurso');
            $table->unsignedBigInteger('idLocalizacao');
            $table->date('dataInicio')->nullable();;
            $table->date('dataFim')->nullable();;
            $table->string('nome');
            $table->boolean('activeStatus')->default(true);
            $table->timestamps();


            $table->foreign('idCurso')->references('idCurso')->on('cursos')->onDelete('cascade');
            $table->foreign('idLocalizacao')->references('idLocalizacao')->on('localizacaos')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('turmas');
    }
};
