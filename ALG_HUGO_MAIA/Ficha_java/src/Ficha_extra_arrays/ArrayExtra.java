package Ficha_extra_arrays;

public class ArrayExtra {

    public static void main(String[] args) {
        int [] array = {1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1};

        int valor = array.length, count =0, controlador=0, contador_2=0;


        for ( int i =0 ; i<array.length; i++){


            for( int n = 0; n<array.length; n++ )
            {
                if(array[i]==array[n] )
                {count--;}
                if (controlador==n && count<-1)
                        {    //valor = valor+count;
                            //System.out.println(valor);
                            contador_2++;
                        }
            }
            controlador++;
            count=0;
        }

        count = -(contador_2)+ array.length;


        System.out.println(count);
        //System.out.println("---*"+(valor+ array.length));

        int [] array2 = new int[count];





    }




}