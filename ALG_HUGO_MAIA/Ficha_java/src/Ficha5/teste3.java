package Ficha5;

public class teste3 {

    public static void main(String[] args) {

        int r =1;

        for (int n=5; n>0;n--) {

            for (int i = 1; i < n; i++) {

                System.out.print(" ");
            }


            for (int k=1; k<=r; k++){

                System.out.print("*");

            }
            r+=2;
            System.out.println("");
            }



        }
    }

