package Exercicio1;

public class Aviao {


   private String numero_serie;
   private String modelo;
   private int ano_fabrico;
   private double peso_kg;
   private double comprimento_fuselagem; // metros
   private double envergadura_asas; //metros
   private double altura_cauda; // metros,
   private int numero_motores;
   private double autonomia; // km

   private double velocidade_maxima; //km/h
   private double preco; //  euros

   public Aviao(String numero_serie, String modelo, int ano_fabrico, double peso_kg, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, int numero_motores, double autonomia, double velocidade_maxima, double preco) {
      this.numero_serie = numero_serie;
      this.modelo = modelo;
      this.ano_fabrico = ano_fabrico;
      this.peso_kg = peso_kg;
      this.comprimento_fuselagem = comprimento_fuselagem;
      this.envergadura_asas = envergadura_asas;
      this.altura_cauda = altura_cauda;
      this.numero_motores = numero_motores;
      this.autonomia = autonomia;
      this.velocidade_maxima = velocidade_maxima;
      this.preco = preco;
   }


   public String getNumero_serie() {
      return numero_serie;
   }

   public String getModelo() {
      return modelo;
   }

   public int getAno_fabrico() {
      return ano_fabrico;
   }

   public double getPeso_kg() {
      return peso_kg;
   }

   public double getComprimento_fuselagem() {
      return comprimento_fuselagem;
   }

   public double getEnvergadura_asas() {
      return envergadura_asas;
   }

   public double getAltura_cauda() {
      return altura_cauda;
   }

   public int getNumero_motores() {
      return numero_motores;
   }

   public double getAutonomia() {
      return autonomia;
   }

   public double getVelocidade_maxima() {
      return velocidade_maxima;
   }

   public double getPreco() {
      return preco;
   }


   public void setPreco(double preco) {
      this.preco = preco;
   }


   public  void exibirDetalhes()
   {
      System.out.println(this.modelo);
      System.out.println(this.altura_cauda);
   }
}
