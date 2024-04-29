import Entidade.*;
import Outros.Cores;
import Outros.LerFicheiros;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Funcao de main do jogo
 */
public class Main {


    public static void main(String[] args) {

        int ouro = 0;
        int forca = 0;

        // iniciar o jogo
        boolean run = true, iniciar_programa = true;
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        Heroi heroi = null;
        JogoVersion jogo = new JogoVersion();
        System.out.println(Cores.BG_CYAN);

        System.out.println("****************************************************************************************");
        System.out.println("*******************************  Bem-vindo  ********************************************");
        System.out.println("****************************************************************************************\n");

        boolean continuacao = false;



        while (run) {
            System.out.println(Cores.BG_CYAN);

            try {


                if (iniciar_programa) {

                    System.out.println("*************************************************************************************");
                    System.out.println("Escolha  um das opcoes comecar novo jogo." +
                            "\n1 - Iniciar jogo" +
                            "\n2 - Sair do jogo");
                    System.out.print("Opção ->");
                    opcao = Integer.parseInt(input.nextLine());
                    System.out.println("*************************************************************************************\n");
                    iniciar_programa = false;

                } else
                {

                    System.out.println(continuacao);
                    if(!continuacao){

                    System.out.println("****************************************************************************************");
                    System.out.println("Escolha  um das opcoes comecar novo jogo." +
                            "\n1 - Iniciar jogo com nova Personagem" +
                            "\n2 - Sair do jogo" +
                            "\n3 - Iniciar jogo com a mesma Personagem ");
                    System.out.print("Opção ->");
                    opcao = Integer.parseInt(input.nextLine());
                    System.out.println("****************************************************************************************\n");}}

                    if (continuacao) {
                        System.out.println(Cores.BG_PURPLE);
                        System.out.println("****************************************************************************************");
                        System.out.println("Escolha  um das opcoes comecar novo jogo." +
                                "\n1 - Iniciar un  novo jogo com nova Personagem" +
                                "\n2 - Sair do jogo" +
                                "\n3 - Continuar a explorar o labirinto");
                        System.out.print("Opção ->");
                        opcao = Integer.parseInt(input.nextLine());
                        System.out.println("****************************************************************************************\n");
                        if (opcao == 3) {
                            opcao = 4;
                        }



                }
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (opcao) {
                case 1:


                    jogo = new JogoVersion();
                    heroi = jogo.criarPersonagem();
                    //heroi.setVidaMax_maxHp(500);// cheat para fazer o percurso completo
                    //heroi.setVidaAtual_hp(500);// cheat para fazer o percurso completo
                    forca = heroi.getForca();
                    ouro = heroi.getOuro();
                    continuacao=jogo.labirintoMortal(heroi);

                    break;

                case 2:

                    System.out.println(Cores.BG_RED);
                    LerFicheiros ler = new LerFicheiros();
                    try{
                    ler.ler("src/Outros/end.txt");}catch (FileNotFoundException e){}
                    run = false;
                    break;


                case 3:
                    if (!(heroi == null)) {
                        if (heroi.getVidaAtual_hp() < heroi.getVidaMax_maxHp()) {
                            heroi.setVidaAtual_hp(heroi.getVidaMax_maxHp());
                        }

                            heroi.setForca(forca);
                        if (heroi.getOuro() < ouro) {
                            heroi.setOuro(ouro);
                        }
                        //System.out.println(jogo.labirintoMortal(heroi));//// retorna um true or false
                       // jogo = new JogoVersion();
                        continuacao=jogo.labirintoMortal(heroi);
                        break;

                    } else {
                        System.out.println(" --------------------------Escolha uma das opções ------------------------");
                    }

                    break;

                case 4:

                    heroi.setVidaMax_maxHp(400);
                    heroi.setVidaAtual_hp(300);
                    System.out.println("****************************************************************************************");
                    System.out.println("Teve um upgrade :" +
                            "\n Força : "+heroi.getForca() +
                            "\n Vida : "+heroi.getVidaAtual_hp());

                    System.out.println("****************************************************************************************\n");
                    System.out.println();
                    continuacao=jogo.labirintoMortal(heroi);
                    break;
                default:

                    System.out.println(" --------------------------Escolha uma das opções ------------------------");


            }

        }


    }


}