package loja_jogos;


import java.io.FileNotFoundException;
import java.util.Scanner;

import static loja_jogos.login.leitura_sem_cabecalho;
import static loja_jogos.login.verificar_login;
import static loja_jogos.menuAdmin.menuAdmin_;
import static loja_jogos.menuCliente.menuCliente_;

public class lojaJogos {

    public static void main(String[] args) {
        try {
            boolean run = true;

            while (run) {
                Scanner input = new Scanner(System.in);

                System.out.println("Menu :");
                System.out.println("Entrar no menu Admin - 1");
                System.out.println("Entrar no menu Cliente - 2");
                System.out.println("Sair - 3");
                System.out.print("\nEscolha a opçao : ");
                String opcao = input.nextLine().trim();

                switch (opcao) {

                    // escolher no menu admi  ou clientes
                    case "1":

                        // ecolheu opcao menu
                        String caminho_admins = "src\\loja_jogos\\GameStart\\GameStart_Admins.csv";

                        if (verificar_login(leitura_sem_cabecalho(caminho_admins), 0, 1)) {
                           menuAdmin_();
                            System.out.println("\n" +
                                    "-------------------------------------------------------------------------------------------------------"+"\n");

                        } else {
                            System.out.println("\nUser ou passwords erradas");
                        }
                        break;
                    case "2":

                        menuCliente_();

                        break;
                    case "3":

                        String [] array = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Copyright.txt");
                        for(String n : array ){
                            System.out.println(n);
                        }
                        run=false;
                        break;

                    default:

                }
            }

        }catch(FileNotFoundException e){
            System.out.println("Erro ficheiro");}
    }


}
