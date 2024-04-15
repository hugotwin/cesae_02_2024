package Exercicio3;

public class Array_magico {
    /**
     * Function that return the values equals to index
     * @param valor arrays of integers
     * @return string with the values
     */
    public static String magicValue(int[] valor) {

        String numbers = "";

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] == i) {
                numbers += "" + valor[i] + ";";

            }

        }
        if (numbers.equals("") || numbers==null)

        {
            return "there is no magic numbers";
        }

        return "The magic values are : " + numbers;


    }

    public static void main(String[] args) {

        int[] valores = {35, 1, 2, 3, 8, 6, 10};

        System.out.println(magicValue(valores));


    }


}
