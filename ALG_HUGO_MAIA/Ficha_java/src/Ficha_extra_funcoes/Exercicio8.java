package Ficha_extra_funcoes;


import java.util.Scanner;

public class Exercicio8 {


    public static String vogal()

    {
        String palavra;
        String[] array = {"a","e","i","o","u"};
        Scanner input = new Scanner(System.in);
        System.out.println("indique a palavra");
        palavra=input.nextLine().toLowerCase();

        for (String n : array )
        {
            if (n.equals(palavra))
            {
                return "vogal";
            }

        }
        return "não é vogal";



    }
    public static void main(String[] args) {


        System.out.println(vogal());

    }
}
