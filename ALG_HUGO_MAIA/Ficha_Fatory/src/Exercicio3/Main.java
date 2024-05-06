package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nindique o autor : ");
        String autor = input.nextLine();
        System.out.print("\nindique o nome : ");
        String nome = input.nextLine();
        System.out.print("\nindique o tipo de ficheiro : ");
        String tipoFicheiro = input.nextLine();

        Document texto = DocumentFactory.createDocument(autor, nome,tipoFicheiro);

        texto.open();



    }


}
