package Exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{


    public Mota(String marca, String modelo, int ano_fabrico, int potencia, int cilindrada, double litros100Km, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, ano_fabrico, potencia, cilindrada, litros100Km, tipoCombustivel);
    }

    public void conteudo()
    {
        try {
        File file  = new File("src/Exercicio2/mota.txt");
        Scanner read = new Scanner(file);

        while(read.hasNext())
        {
            System.out.println(read.nextLine());

        }

        }catch(FileNotFoundException e){
            System.out.println(e);
        }



    }
}
