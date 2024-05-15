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
        Schema::create('moduloFormando', function (Blueprint $table) {
            $table->id('idModuloFormando');
            $table->unsignedBigInteger('idUser');
            $table->unsignedBigInteger('idTurma');
            $table->unsignedbigInteger('idModulo');
            $table->decimal('nota', 5, 2)->nullable();

            // Definindo as chaves estrangeiras
            $table->foreign('idUser')->references('id')->on('users')->onDelete('cascade');
            $table->foreign('idTurma')->references('idTurma')->on('turma')->onDelete('cascade');
            $table->foreign('idModulo')->references('idModulo')->on('modulo')->onDelete('cascade');

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('moduloFormando');
    }
};
