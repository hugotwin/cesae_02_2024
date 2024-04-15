package Exercicio3;


import java.util.Scanner;

public class teste {
    /**
     * Function that invertes an string
     * @param str receive an string
     * @return an string
     */
    public static String reverse(String str) {

        char[] entry = str.toCharArray();
        char[] out = new char[entry.length];
        int count = 0;


        for (int n = entry.length - 1; n >= 0; n--) {

            out[count] = entry[n];
            count++;
        }
        entry = out;
        String word = new String(out);
        return word;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("indique a palavra");
        String entry = input.nextLine();
        System.out.println("Original string: " + entry);
        System.out.println("Reversed string: " + reverse(entry));
    }


}

