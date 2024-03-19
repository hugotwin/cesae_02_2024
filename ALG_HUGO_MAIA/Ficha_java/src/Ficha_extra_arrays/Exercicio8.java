package Ficha_extra_arrays;

public class Exercicio8 {

    public static void main(String[] args) {


        int [] array1 = {1,2,3,4,5};

        int [] array2 = new int[array1.length+1];

        int pos=3, value=55, contador=0;


        for ( int n=0; n<(array1.length);n++)
        {



            if (n==pos && contador<1 )
            {
                array2[n]= value;
                System.out.println(array2[n]);
                contador++;
                n--;


            }else{

                array2[n]=array1[n];
                System.out.println(array2[n]);
            }




        }








    }

}
