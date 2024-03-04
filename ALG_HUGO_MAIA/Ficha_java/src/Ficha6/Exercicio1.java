package Ficha6;

public class Exercicio1 {

    static void fazerBarulho(String nome) {
        String ruido = "";

        if (nome.equals("cao")) {
            ruido = "auau";
        } else if (nome.equals("gato")) {
            ruido = "miau";
        } else {
            ruido = "Desconhecido";
        }

        System.out.println(ruido);
    }



    public static void main(String[] args) {





        fazerBarulho("cao");


    }
}
