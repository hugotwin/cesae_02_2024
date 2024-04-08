public class circulo {
    private double raio;

    public  circulo(double raio)
    {
       this.raio= raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area()
    {
        double area = this.raio*this.raio*3.14;
        return area;
    }

    public double circun()
    {
        double circ = 2*this.raio*3.14;
        return circ;

    }



}
