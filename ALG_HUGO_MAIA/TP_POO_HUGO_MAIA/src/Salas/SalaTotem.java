package Salas;

import Entidade.*;
import Outros.Cores;

import java.util.Random;
import java.util.Scanner;

/**
 * classe que cria um Totem para iteragir com o heroi
 */
public class SalaTotem {



    public SalaTotem() {


    }

    /**
     * Funcao que  iteragem o totem com o heroi
     * @param heroi
     * @return boolean
     */
    public boolean totemAmaldicoado(Heroi heroi){



    Random rand = new Random();
    int valor = rand.nextInt(0,2);

        System.out.println(Cores.BG_YELLOW);
        System.out.println("****************************************************************************************");
        System.out.println("Estás cheio de sorte encontraste um totem , que pde te fazer rico ou "+Cores.caveira+"!!!");
        System.out.println("           Jogue a sua sorte  ganhe 20 em ouro e 50 em vida ou tenha morte instânia," +
                            "\n                 Pode jogar as vezes que quiser boa sorte!");
        System.out.println("****************************************************************************************\n");


    boolean  run=true;
    while (run) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(Cores.BG_GREEN);
            System.out.println("****************************************************************************************");
            System.out.println("Indique a sua escolha : " +
                    "\n1 - Jogar o Totem Almadiçoado" +
                    "\n2 - Sair");
            System.out.print("Opção ->");
            int opcao = Integer.parseInt(input.nextLine());
            System.out.println("****************************************************************************************\n");

            if (opcao==1){
            if (valor == 0) {

                heroi.setVidaAtual_hp(0);
                System.out.println(Cores.BG_PURPLE);
                System.out.println("****************************************************************************************");
                System.out.println("O " + heroi.getNome() + " PERDEU " + Cores.derrota + Cores.derrota + Cores.caveira);
                System.out.println("****************************************************************************************\n");

                System.out.println(Cores.BG_PURPLE);
                System.out.println("****************************************************************************************");
                System.out.println("O " + heroi.getNome() + " PERDEU " + Cores.derrota + Cores.derrota + Cores.derrota);
                System.out.println("****************************************************************************************\n");
                return false;

            }
            if (valor == 1) {

                heroi.setVidaAtual_hp(0);
                System.out.println(Cores.BG_GREEN);
                System.out.println("****************************************************************************************");
                System.out.println("O " + heroi.getNome() + " Ganhou 20 em ouro  e 50 em Vida" + Cores.estrela + Cores.estrela + Cores.estrela);
                System.out.println("****************************************************************************************\n");
                heroi.aumentoVidaAtual_hp(50);
                heroi.setOuro(heroi.getOuro()+20);



            }}else{

                run = false;
            }


        }catch (Exception e){
            System.out.println("****************************************************************************************");
            System.out.println("                             Escolha uma opcao valida ");
            System.out.println("****************************************************************************************\n");
        }

    }

        return true;
    }



}
