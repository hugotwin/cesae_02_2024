package Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogadorView {
    public void menuJogador(){
        int option = -1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\n");
            System.out.println("\t1. Consultar todos os jogadores" +
                    "\n\t2. Consultar todas as competições que o Alverca ganhou" +
                    "\n\t3. Consultar a/as competições que o Alverca marcou mais golos" +
                    "\n\t0. Sair");
            try{
                option = input.nextInt();
            }catch (InputMismatchException ex1){
                option = -1;
                input.next();
            }
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n\tOpção Inválida!\n");
            }
        }while (option != 0);
    }
}
