package Ficha6;

public class Exercicio3 {

    public static boolean par(int valor) {
        if (valor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positivo(int valor) {
        if (valor >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primo(int valor) {
        if (valor != 1 && valor % 2 != 0 && valor % 3 != 0 || valor == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean perfeito(int valor) {
        int soma = 0, contador = 1;

        while (contador < valor) {
            if (valor % contador == 0) {
                soma += contador;
            }
            contador++;
        }
        return soma == valor;
    }

    public static boolean triangular(int valor) {
        int contador = 0;

        while (true) {

            for (int i = 0; i <= contador; i++) {
                valor--;
            }

            if (valor < 0) {
                return false;
            } else if (valor == 0) {
                return true;
            }
            contador++;

        }

    }




    public static void main(String[] args) {


        System.out.println(par(2));
        System.out.println(positivo(2));

        System.out.println(primo(59));
        System.out.println(perfeito(9));
        System.out.println(triangular(5));

    }
}
