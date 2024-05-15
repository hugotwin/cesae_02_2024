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
        Schema::create('cursoModulo', function (Blueprint $table) {

            $table->unsignedBigInteger('idCurso');
            $table->unsignedBigInteger('idModulo');
            $table->boolean('activeStatus')->default(true);
            $table->primary(['idCurso', 'idModulo']);
            $table->foreign('idCurso')->references('idCurso')->on('curso')->onDelete('cascade');
            $table->foreign('idModulo')->references('idModulo')->on('modulo')->onDelete('cascade');

        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('cursoModulo');
    }
};
