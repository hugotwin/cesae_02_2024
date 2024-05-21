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
        Schema::create('utilizador_turmas', function (Blueprint $table) {
            $table->id('idUtilizadorTurma');
            $table->unsignedBigInteger('idUser');
            $table->unsignedBigInteger('idTurma');
            $table->timestamps();


            // Definindo as chaves estrangeiras
            $table->foreign('idUser')->references('id')->on('users')->onDelete('cascade');
            $table->foreign('idTurma')->references('idTurma')->on('turmas')->onDelete('cascade');
            $table->unique(['idUser', 'idTurma']);

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('utilizador_turmas');
    }
};
