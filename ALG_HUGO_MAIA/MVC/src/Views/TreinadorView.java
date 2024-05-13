package Views;

import Controllers.CompeticaoController;
import Controllers.JogadorController;
import Domain.Competion;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TreinadorView {

    public void menuTreinador() throws FileNotFoundException {

        CompeticaoController competicaoController = new CompeticaoController();
        JogadorController jogadorController = new JogadorController();
        int option = -1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\n");
            System.out.println("\t1. Consultar todos as competições" +
                    "\n\t2. Consultar todas as competições de um determinado Ano" +
                    "\n\t3. Consultar o ranking de defesa  e ataque da equipa" +
                    "\n\t4.O melhor defesa" +
                    "\n\t5.O melhor Atacante" +
                    "\n\t0. Sair");
            try{
                option = input.nextInt();
            }catch (InputMismatchException ex1){
                option = -1;
                input.next();
            }
            switch (option){
                case 1:
                   competicaoController.competicoesTodas();
                    break;
                case 2:

                    System.out.println("Indique o ano :");
                    input.nextLine();
                    String ano = input.nextLine();
                    competicaoController.competicoesAno(ano);


                    break;
                case 3:
                    jogadorController.rankingAtaqueDefesa();
                    break;
                case 4:
                    jogadorController.melhorDefesa();

                    break;
                case 5:
                    jogadorController.melhorAtaque();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n\tOpção Inválida!\n");
            }
        }while (option != 0);
    }




}
