import Entidade.*;
import ItemHeroi.ArmaPrincipal;
import ItemHeroi.ConsumivelCombate;
import ItemHeroi.Pocao;
import Outros.Cores;
import Outros.LerFicheiros;
import Salas.Caminho;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe que cria a Personagem e Ambiente de Jogo
 */
public class JogoVersion {


    /**
     * Construtor da classe JogoVersion
     */
    public JogoVersion() {
    }


    /**
     * Funcao que cria uma funcao mdiante as classes cavaleiro
     * @return HEROI
     */
    public Heroi criarPersonagem() {

        System.out.println(Cores.BG_GREEN);
        Scanner input = new Scanner(System.in);
        boolean run = true;
        Heroi heroi = null;

        int opcao_dificuldade = 0, opcao_heroi = 0;
        while (run) {
            try {
                System.out.println("****************************************************************************************");
                System.out.println("Qual heroi deseja escolher :" + "\n1 - Cavaleiro" + "\n2 - Feiticeiro" + "\n3 -  Arqueiro");
                System.out.print("Opcao ->");

                opcao_heroi = Integer.parseInt(input.nextLine());

                System.out.println("****************************************************************************************\n");
                if (opcao_heroi < 0 || opcao_heroi > 3) {
                    System.out.println("Faça uma escolha correta");

                } else {
                    run = false;
                }
            } catch (Exception e) {
                System.out.println("Faca uma escolha valida");


            }

        }
        run = true;
        while (run) {
            try {
                System.out.println("****************************************************************************************");
                System.out.println("Qual o grau de dificuldade ? :" + "\n1 - Facil" + "\n2 - Dificil");
                System.out.print("Opcao ->");
                //input.next();
                opcao_dificuldade = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");

                if (opcao_dificuldade < 0 || opcao_dificuldade > 3) {
                    System.out.println("Faça uma escolha correta");

                } else {
                    run = false;

                }
            } catch (Exception e) {
                System.out.println("Faca uma escolha valida");


            }


        }

        // define os  pontos mediante a opcao
        int pontosCriacao = (opcao_dificuldade == 1) ? 300 : 220;// Vitor ja tinha algum conhecimento e fiz assim se a escolha for 1 escolhe 0 300 se nao o 220
        int ouro = (opcao_dificuldade == 1) ? 25 : 20;
        int pontosVida = 0;
        int pontosForca = 0;

        // Distribui os pontos de criação entre vida e força
        System.out.println("****************************************************************************************");
        System.out.println("Distribua os pontos de criação entre vida e força (cada ponto de vida vale 1 e cada ponto de força vale 5):");
        System.out.println("Você tem " + pontosCriacao + " pontos para distribuir.");
        System.out.println("****************************************************************************************\n");

        boolean running = true;
        while (running) {
            try {
                System.out.println("****************************************************************************************");
                System.out.print("Pontos de vida: ");
                pontosVida = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");

                System.out.println("****************************************************************************************");
                System.out.print("Pontos de força: ");
                pontosForca = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");


                if ((pontosVida + 5 * pontosForca) == pontosCriacao) {
                    running = false;
                    System.out.println(pontosVida + 5 * pontosForca);

                } else {
                    try {

                        System.out.println(pontosVida + 5 * pontosForca);
                        System.out.println("****************************************************************************************");
                        System.out.println("A distribuição está incorreta. Tente novamente.");
                        // System.out.print("Pontos de vida: ");
                        // pontosVida = Integer.parseInt(input.nextLine());
                        //System.out.println("Pontos de força: ");
                        //  pontosForca = Integer.parseInt(input.nextLine());
                        System.out.println("****************************************************************************************\n");

                    } catch (Exception error) {
                        System.out.println(" Insira correctamente os valores ");
                    }
                }


            } catch (Exception e) {
                System.out.println(" Insira correctamente os valores ");

            }
        }

        if (opcao_heroi == 1) {

            ArmaPrincipal espada = new ArmaPrincipal("Espada", 20, "Cavaleiro", 50, 100);

            Cavaleiro cavaleiro = new Cavaleiro(pontosVida, "Cavaleiro", pontosForca, 1, ouro, espada);

            heroi = cavaleiro;

        } else if (opcao_heroi == 2) {

            ArmaPrincipal bastao = new ArmaPrincipal("Bastão", 20, "Feiticeiro", 50, 100);

            Feiticeiro feiticeiro = new Feiticeiro(pontosVida, "Feiticeiro", pontosForca, 1, ouro, bastao);
            heroi = feiticeiro;

        } else if (opcao_heroi == 3) {

            ArmaPrincipal arco = new ArmaPrincipal("Arco", 20, "Arqueiro", 50, 100);

            Arqueiro arqueiro = new Arqueiro(pontosVida, "Arqueiro", pontosForca, 1, ouro, arco);

            heroi = arqueiro;
        }


        return heroi;
    }

    /**
     * Funcaoq que cria o labirinto que faz a interacao entre o heroi , os diversos caminhos, inimigos e itensEspeciais
     * @param heroi
     * @return um boolean
     */
    public boolean labirintoMortal(Heroi heroi) {

        String[] listaHeroisPermitidosTodos = {"Cavaleiro", "Arqueiro", "Feiticeiro"};
        Pocao poca_vida = new Pocao("Pocao Vida", 5, listaHeroisPermitidosTodos, 25, 0);
        Pocao poca_forca = new Pocao("Pocao Forca", 10, listaHeroisPermitidosTodos, 0, 5);
        ConsumivelCombate seta_explosivas = new ConsumivelCombate("Seta explosiva", 5, "Arqueiro", 50);
        ConsumivelCombate bombas_eplosiva = new ConsumivelCombate("Bomba explosiva", 5, listaHeroisPermitidosTodos, 50);
        ConsumivelCombate feitico_mortal = new ConsumivelCombate("Feitiço Mortal", 5, "Feiticeiro", 50);
        ConsumivelCombate lanca_explosiva = new ConsumivelCombate("Lança Explosiva", 5, "Cavaleiro", 50);
        Pocao poca_vida_forca = new Pocao("Poção de vida e forca", 7, listaHeroisPermitidosTodos, 25, 2);
        ArmaPrincipal arma_plasma = new ArmaPrincipal("plasma", 15, listaHeroisPermitidosTodos, 100, 200);
        ConsumivelCombate granada_plasma = new ConsumivelCombate("granada_plasma", 10, listaHeroisPermitidosTodos, 100);
        Pocao poca_Mega_vida = new Pocao("pocao_Mega_vida", 10, listaHeroisPermitidosTodos, 100, 0);
        ArmaPrincipal desintigrador = new ArmaPrincipal("Desintegrador", 20, listaHeroisPermitidosTodos, 200, 400);
        ConsumivelCombate granada = new ConsumivelCombate("granada", 5, listaHeroisPermitidosTodos, 50);
        ConsumivelCombate mataTudo = new ConsumivelCombate("Mata Tudo", 5, listaHeroisPermitidosTodos, 50);
        Pocao poca_Mega_forca = new Pocao("pocao_Mega_Força", 15, listaHeroisPermitidosTodos, 0, 25);
        Pocao poca_Mega_Mega_vida = new Pocao("pocao_Mega_Mega", 100, listaHeroisPermitidosTodos, 200, 25);
        Pocao poca_extra = new Pocao("Pocão extra forca e vida", 150, listaHeroisPermitidosTodos, 200, 100);


        Vendedor vendedor = new Vendedor();
        vendedor.addItemHeroi(poca_vida);
        vendedor.addItemHeroi(poca_forca);
        vendedor.addItemHeroi(seta_explosivas);
        vendedor.addItemHeroi(bombas_eplosiva);
        vendedor.addItemHeroi(feitico_mortal);
        vendedor.addItemHeroi(lanca_explosiva);
        vendedor.addItemHeroi(poca_vida_forca);
        vendedor.addItemHeroi(arma_plasma);
        vendedor.addItemHeroi(granada_plasma);
        vendedor.addItemHeroi(poca_Mega_vida);
        vendedor.addItemHeroi(desintigrador);
        vendedor.addItemHeroi(granada);
        vendedor.addItemHeroi(mataTudo);
        vendedor.addItemHeroi(poca_Mega_forca);
        vendedor.addItemHeroi(poca_Mega_Mega_vida);
        vendedor.addItemHeroi(poca_extra);

        NPC zombie = new NPC(150, "Zombie", 25, 20);
        NPC espectroSombrio = new NPC(150, "Espectro Sombrio", 40, 20);
        NPC trollPedra = new NPC(90, "Troll de Pedra", 45, 20);
        NPC goblinCarniceiro = new NPC(80, "Goblin Carniceiro", 30, 20);
        NPC loboNegro = new NPC(75, "Lobo Negro", 25, 20);

        ArrayList<Entidade> listaInimigos = new ArrayList<Entidade>();
        listaInimigos.add(zombie);
        listaInimigos.add(espectroSombrio);
        listaInimigos.add(trollPedra);
        listaInimigos.add(goblinCarniceiro);
        listaInimigos.add(loboNegro);


        // Incio do jogo


        boolean resultado = false;
        Random rand = new Random();



        LerFicheiros ler = new LerFicheiros();
        try {

            System.out.println(Cores.BG_RED);
            System.out.println("*****************************************************************************************");
            ler.ler("src/Outros/labirintoMortal.txt");
        }catch (Exception e )
        {

        }

        System.out.println("----------------------------Bem Vindo ao labirinto Mortal--------------------------------");
        System.out.println("*********************************************************************************************************************************");
        System.out.println("No coração de Arcadia fica o Labirinto Mortal, uma estrutura antiga envolta em mistério e perigo. " +
                "\nDiz-se que dentro dele estão tesouros inimagináveis, mas ninguém que entrou jamais retornou. " +
                "\nComo nosso herói, você decide enfrentar este desafio, motivado pela promessa de riquezas e poder além da compreensão. " +
                "\nCom coragem e determinação, você entra no labirinto, pronto para enfrentar seus desafios mortais " +
                "\ne descobrir o que aguarda em seu interior.");
        System.out.println("********************************************************************************************************************************\n");




        System.out.println(Cores.BG_GREEN);
        boolean run = true;
        Scanner input = new Scanner(System.in);

        while (run) {
            System.out.println(Cores.BG_GREEN);

            try {
                System.out.println("****************************************************************************************");

                System.out.println("Indique a sua opcao :" +
                        "\n1 - Entrar na loja " +
                        "\n2 - Continuar para jogo" +
                        "\n3 - Ver Status" +
                        "\n4- Ver o Inventario");
                System.out.print("Opção->");
                int opcao = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");

                switch (opcao) {
                    case 1:

                        vendedor.vender(heroi);
                        break;

                    case 2:
                        run = false;
                        System.out.println("----------Seguindo para jogo---------------");
                        break;


                    case 3:
                        heroi.status();
                        break;

                    case 4:

                        heroi.getInventarioConsumiveis_();
                        break;

                    default:

                        System.out.println(" Faça uma Opcao valida ");

                }
            } catch (Exception e) {
                System.out.println(" Faca uma escolha valida");

            }

        }

        System.out.println(Cores.BG_RED);
        System.out.println("-------------------------CHEGOU A SUA ESCOLHA MORTAL --------------------------------------");
        System.out.println("*******************************************************************************************\n");


        run = true;
        while (run) {


            int escolha=0;
            try {

                System.out.println("****************************************************************************************");
                System.out.println("Escolha um caminho para seguir:" +
                        "\n1. Caminho da Perdição" +
                        "\n2. Rota do Desespero" +
                        "\n3. Passagem das Sombras");
                System.out.print("Indique o número do caminho : ");
                escolha = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");

            } catch (Exception e) {
                System.out.println(" Erro na escolha da ocpçao");

            }
                System.out.println(Cores.BG_GREEN);
                switch (escolha) {

                    case 1:

                        Caminho caminho = new Caminho("Caminho da Perdicao", "Deserto", "Abismo", "Oceano", 2, heroi, listaInimigos);
                        resultado = caminho.accao();

                        if (!resultado) {
                            return false;
                        }
                        System.out.println(Cores.BG_CYAN);
                        System.out.println("****************************************************************************************");
                        System.out.println("-------------------Parabéns! Você sobreviveu a a "+caminho.getNomeCaminho()+"!------------------");
                        System.out.println("****************************************************************************************\n");

                        run = false;
                        break;
                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    case 2:

                        Caminho caminho_dois = new Caminho("Rota do Desespero.", "Antro da Angústia", "Tumba do Terror", "Horror Ancestral", 4, heroi, listaInimigos);
                        resultado = caminho_dois.accao();
                        if (!resultado) {
                            return false;
                        }
                        System.out.println(Cores.BG_CYAN);
                        System.out.println("****************************************************************************************");
                        System.out.println("-------------------Parabéns! Você sobreviveu a a "+caminho_dois.getNomeCaminho()+"!------------------");
                        System.out.println("****************************************************************************************\n");
                        // Vale das Sombras  Sala 2 - Antro da Angústia  Sala 1 - Tumba do Terror.


                        run = false;
                        break;

                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    case 3:


                        Caminho caminho_tres = new Caminho("Passagem das Sombras.", "Labirinto de horrores", "Cimeterios dos mortos vivos", "Horror Ancestral", 3, heroi, listaInimigos);
                        resultado = caminho_tres.accao();
                        if (!resultado) {
                            return false;
                        }
                        System.out.println(Cores.BG_CYAN);
                        System.out.println("****************************************************************************************");
                        System.out.println("-------------------Parabéns! Você sobreviveu a a "+caminho_tres.getNomeCaminho()+"!------------------");
                        System.out.println("****************************************************************************************\n");

                        run = false;
                        break;

                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    //-----------------------------------------------------------------------------------------------------------------------------------------------
                    default:


                        System.out.println("****************************************************************************************");
                        System.out.println("Opção inválida. Por favor, escolha um número de 1 a 3.");
                        System.out.println("****************************************************************************************\n");
                }


        }

        return resultado;
    }


}
