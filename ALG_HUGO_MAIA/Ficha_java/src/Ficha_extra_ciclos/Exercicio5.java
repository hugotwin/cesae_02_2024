package Ficha_extra_ciclos;

public class Exercicio5 {
    public static void main(String[] args) {

        int n=0 , r=0;

        for ( int i =0; i<5; i++){
            for ( int j =0; j<5; j++){

                System.out.print("*");
            }

            System.out.println("");
        }


        for ( int i = 0; i<6; i++){

            while(n<i){

                System.out.print("*");
                n++;

            }
            n=0;



            System.out.println("");
        }

        n=0;


        System.out.println("-----------");

       //-------------------------------------

        r=0;
        n=(5-1)/2;






          for ( int u=0; u<2; u++) {

              for (int j = 2; j > 0; j--) {




                      for (int i = 0; i < n; i++) {

                          System.out.print(" ");

                      }


                  System.out.print("*");

              }
              n++;

              System.out.println("");
          }











    }






    }


