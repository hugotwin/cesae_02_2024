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
        Schema::create('modulo_formandos', function (Blueprint $table) {
            $table->id('idModuloFormando');
            $table->unsignedBigInteger('idUser');
            $table->unsignedBigInteger('idTurma');
            $table->unsignedbigInteger('idModulo');
            $table->decimal('nota', 5, 2)->nullable();
            $table->timestamps();


            // Definindo as chaves estrangeiras
            $table->foreign('idUser')->references('id')->on('users')->onDelete('cascade');
            $table->foreign('idTurma')->references('idTurma')->on('turmas')->onDelete('cascade');
            $table->foreign('idModulo')->references('idModulo')->on('modulos')->onDelete('cascade');

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('modulo_formando');
    }
};
