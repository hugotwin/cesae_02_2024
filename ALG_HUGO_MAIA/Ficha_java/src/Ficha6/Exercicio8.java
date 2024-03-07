package Ficha6;

public class Exercicio8 {

    public static void somar_matrizes(int[][] matriz_1, int[][] matriz_2) {
        int soma1 = 0, soma2 = 0;
        for (int[] n : matriz_1) {
            for (int i : n) {
                soma1 += i;
            }
        }
        for (int[] n : matriz_2) {
            for (int i : n) {
                soma2 += i;
            }
        }

        for (int i = 0; i < matriz_1.length; i++) {
            for (int n = 0; n < matriz_1[i].length; n++) {
                matriz_1[i][n] = matriz_1[i][n] + matriz_2[i][n];

            }
        }

        for (int[] n : matriz_1) {
            for (int i : n) {
                System.out.print(i + "-");
            }
            System.out.println("");
        }

        System.out.println("soma da matriz 1 " + soma1 + "  soma da matriz_2 " + soma2);
    }

    public static void main(String[] args) {

        int[][] val_ = {{1, 2,3}, {1, 2,3}};
        int[][] val_2 = {{1, 2,3}, {1, 2,3}};

        somar_matrizes(val_, val_2);


    }
}
