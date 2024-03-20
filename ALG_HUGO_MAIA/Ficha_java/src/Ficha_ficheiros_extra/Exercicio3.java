package Ficha_ficheiros_extra;

import java.util.Scanner;

import static Ficha_ficheiros_extra.Exercicio3_funcoes.*;

public class Exercicio3 {


    public static void main(String[] args) {

        try {


            if (verificar_acesso("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/loginHotel.txt")) {
                System.out.println("indique a opção : \n1 - Gerir Base de Dados" +
                        "\n2 - Consultar Clientes" +
                        "\n3 - Consultar Quartos Disponíveis " +
                        "\n4 - Consultar Reservas" +
                        "\n5 - Registar Nova Reserva" +
                        "\n6 - Dashboard de Análise" +
                        "\n7 - Galeria ");
                Scanner input = new Scanner(System.in);
                String opcao = input.nextLine().trim().toLowerCase();
                switch (opcao) {
                    case "1":

                        gerir_bases_dados();

                        break;
                    case "2":
                        System.out.println(consultarclientes());
                        break;

                    case "3":

                        break;
                    case "4":

                        break;

                    case "5":

                        break;

                    case "6":

                        break;

                    case "7":

                        break;

                    default:

                        break;


                }


            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
