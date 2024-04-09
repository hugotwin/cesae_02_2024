public class Rectangulo {

    private double largura;
    private double altura;



   public Rectangulo(double largura, double altura)
   {
       this.largura = largura;
       this.altura = altura;

   }

   public double area()
   {
       double area = this.largura*this.altura;
       return area;

   }

   public double perimetro()
   {
       double perimetro = 2*this.largura+2*this.altura;
       return perimetro;
   }



}
