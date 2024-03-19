package Ficha_extra_arrays;

public class Exercicio9 {



        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Array original:");
            imprimirArray(array);

            ordenarArray(array);

            System.out.println("\nArray ordenado:");
            imprimirArray(array);
        }

        // Função para imprimir o array
        public static void imprimirArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Função para ordenar o array (algoritmo Bubble Sort)
        public static void ordenarArray(int[] array) {
            int n = array.length;
            for (int i = 0; i < n-1; i++) {

                for (int j = 0; j < n-i-1; j++) {

                    if (array[j] > array[j+1]) {
                        // troca array[j] e array[j+1]
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }


    }

