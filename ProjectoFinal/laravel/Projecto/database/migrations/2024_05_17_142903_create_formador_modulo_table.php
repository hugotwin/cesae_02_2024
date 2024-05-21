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
        Schema::create('formador_modulos', function (Blueprint $table) {
            $table->id('idFormadorModulo');
            $table->unsignedBigInteger('idUser');
            $table->unsignedBigInteger('idTurma');
            $table->unsignedBigInteger('idModulo');
            $table->boolean('activeStatus')->default(true);
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
        Schema::dropIfExists('formador_modulos');
    }
};
