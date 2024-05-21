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
        Schema::create('faltas', function (Blueprint $table) {
            $table->id('idFalta');
            $table->unsignedBigInteger('idUser');
            $table->unsignedBigInteger('idModulo');
            $table->date('dataFalta')->nullable();
            $table->integer('horasFalta')->nullable();
            $table->timestamps();


            // Definindo as chaves estrangeiras
            $table->foreign('idUser')->references('id')->on('users')->onDelete('cascade');
            $table->foreign('idModulo')->references('idModulo')->on('modulos')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('faltas');
    }
};
