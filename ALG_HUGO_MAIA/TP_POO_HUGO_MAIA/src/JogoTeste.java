import Entidade.*;
import ItemHeroi.ArmaPrincipal;
import ItemHeroi.ConsumivelCombate;
import ItemHeroi.Pocao;
import Outros.Cores;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe não foi usada , foi como um passo intermedio para classe final JogoVersion
 */
public class JogoTeste {

    public JogoTeste() {
    }

    /**
     * Funcao para criar uma personagem com base nas classes de personagem criadas
     * @return um  objecto da classe Heroi
     */
    public Heroi criarPersonagem() {

        System.out.println(Cores.BG_GREEN);
        Scanner input = new Scanner(System.in);
        boolean run = true;
        Heroi heroi = null;

        int opcao_dificuldade = 0, opcao_heroi = 0;
        while (run) {
            System.out.println("Qual heroi deseja escolher :" + "\n1 - Cavaleiro" + "\n2 - Feiticeiro" + "\n3 -  Arqueiro");
            System.out.print("Opcao ->");
            opcao_heroi = input.nextInt();
            if (opcao_heroi < 0 || opcao_heroi > 3) {
                System.out.println("Faça uma escolha correta");

            } else {
                run = false;
            }
        }
        run = true;
        while (run) {
            System.out.println("***************************************");
            System.out.println("Qual o grau de dificuldade ? :" + "\n1 - Facil" + "\n2 - Dificil");
            System.out.print("Opcao ->");
            opcao_dificuldade = input.nextInt();

            if (opcao_dificuldade < 0 || opcao_dificuldade > 3) {
                System.out.println("Faça uma escolha correta");

            } else {
                run = false;
            }

        }

        // Define os pontos de criação de personagem e ouro com base na dificuldade
        int pontosCriacao = (opcao_dificuldade == 1) ? 300 : 220;// Vitor ja tinha algum conhecimento e fiz assim se a escolha for 1 escolhe 0 300 se nao o 220
        int ouro = (opcao_dificuldade == 1) ? 20 : 15;

        // Distribui os pontos de criação entre vida e força
        System.out.println("Distribua os pontos de criação entre vida e força (cada ponto de vida vale 1 e cada ponto de força vale 5):");
        System.out.println("Você tem " + pontosCriacao + " pontos para distribuir.");

        System.out.println("Pontos de vida: ");
        int pontosVida = input.nextInt();

        System.out.println("Pontos de força: ");
        int pontosForca = input.nextInt();

        // Verifica se a distribuição está correta

        while (pontosVida + 5 * pontosForca != pontosCriacao) {

            System.out.println("A distribuição está incorreta. Tente novamente.");
            System.out.println("Pontos de vida: ");
            pontosVida = input.nextInt();

            System.out.println("Pontos de força: ");
            pontosForca = input.nextInt();
        }

        if (opcao_heroi == 1) {

            ArmaPrincipal espada = new ArmaPrincipal("Espada", 20, "Cavaleiro", 50, 100);

            CavaleiroTeste cavaleiro = new CavaleiroTeste(pontosVida, "Cavaleiro", pontosForca, 1, ouro, espada);

            heroi = cavaleiro;

        } else if (opcao_heroi == 2) {

            ArmaPrincipal bastao = new ArmaPrincipal("Bastão", 20, "Feiticeiro", 50, 100);

            Feiticeiro feiticeiro = new Feiticeiro(pontosVida, "Feiticeiro", pontosForca, 1, ouro, bastao);
            heroi = feiticeiro;

        } else if (opcao_heroi == 3) {

            ArmaPrincipal arco = new ArmaPrincipal("Arco", 20, "Arqueiro", 50, 100);

            Arqueiro arqueiro = new Arqueiro(pontosVida, "Feiticeiro", pontosForca, 1, ouro, arco);

            heroi = arqueiro;
        }


        return heroi;
    }

    /**
     * Funcao que cria um labrito onde ira haver interacao entr o heroi e os inimigos
     * @param heroi
     * @return
     */
    public boolean labirintoMortal(Heroi heroi) {

        String[] listaHeroisPermitidosTodos = {"Cavaleiro", "Arqueiro", "Feiticeiro"};
        Pocao poca_vida = new Pocao("Pocao Vida", 5, listaHeroisPermitidosTodos, 25, 0);
        Pocao poca_forca = new Pocao("Pocao Forca", 5, listaHeroisPermitidosTodos, 0, 2);
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
        Pocao poca_Mega_forca = new Pocao("pocao_Mega_vida", 10, listaHeroisPermitidosTodos, 0, 5);


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

        NPC zombie = new NPC(150, "Zombie", 25, 20);
        NPC espectroSombrio = new NPC(100, "Espectro Sombrio", 40, 20);
        NPC trollPedra = new NPC(90, "Troll de Pedra", 45, 20);
        NPC goblinCarniceiro = new NPC(80, "Goblin Carniceiro", 30, 20);
        NPC loboNegro = new NPC(80, "Lobo Negro", 25, 20);

        ArrayList<Entidade> listaInimigos = new ArrayList<Entidade>();
        listaInimigos.add(zombie);
        listaInimigos.add(espectroSombrio);
        listaInimigos.add(trollPedra);
        listaInimigos.add(goblinCarniceiro);
        listaInimigos.add(loboNegro);


        // Incio do jogo


        boolean resultado = false;
        Random rand = new Random();
        System.out.println(Cores.BG_RED);
        System.out.println("Bem Vindo ao labirinto Mortal");
        System.out.println("No coração de Arcadia fica o Labirinto Mortal, uma estrutura antiga envolta em mistério e perigo. " + "\nDiz-se que dentro dele estão tesouros inimagináveis, mas ninguém que entrou jamais retornou. " + "\nComo nosso herói, você decide enfrentar este desafio, motivado pela promessa de riquezas e poder além da compreensão. " + "\nCom coragem e determinação, você entra no labirinto, pronto para enfrentar seus desafios mortais e descobrir o que aguarda em seu interior.");

        System.out.println(Cores.BG_GREEN);
        boolean run = true;
        Scanner input = new Scanner(System.in);

        while (run) {

            try {

                System.out.println("Indique a sua opcao :" + "\n 1 - Entrar na loja " + "\n 2 - Continuar para jogo");
                System.out.println("Opção->");
                int opcao = input.nextInt();

                switch (opcao) {
                    case 1:

                        vendedor.vender(heroi);
                        break;

                    case 2:
                        run = false;
                        System.out.println("Seguindo para jogo");
                        break;

                    default:

                        System.out.println("Faça uma Opcao valida ");

                }
            } catch (Exception e) {
                System.out.println("Faca uma escolha valida");
                System.out.println(e);
            }

        }

        System.out.println(Cores.BG_RED);
        System.out.println("---------------------CHEGOU A SUA ESCOLHA MORTAL ------------------------");


        run = true;
        while (run) {

            System.out.println("Escolha um caminho para seguir:" +
                    "\n1. Caminho da Perdição" + "\n2. Rota do Desespero" +
                    "\n3. Passagem das Sombras");
            System.out.println("Indique o número do caminho : ");
            int escolha = input.nextInt();
            System.out.println(Cores.BG_GREEN);
            switch (escolha) {

                case 1:
                    System.out.println("-----------------Você escolheu o Caminho da Perdição.-------------");

                    System.out.println("---------------Você entrou na Sala 1 - Câmara da Escuridão.-----------");

                    resultado = heroi.atacar(zombie);
                    if(!resultado){return false;}


                    //------------------------------------------------------------------
                    boolean running = true;
                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");
                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }
                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("---------Você avançou para a Sala 2 - Antro dos Pesadelos.---------------");
                    resultado = heroi.atacar(espectroSombrio);
                    if (!resultado){return false;}


                    running = true;


                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");
                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }
                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("Você chegou à Sala 3 - Covil do Mal.");
                    resultado = heroi.atacar(zombie);
                    if (!resultado){return false;}


                    System.out.println("Parabéns! Você sobreviveu ao Caminho da Perdição!");


                    run = false;
                    break;
                //-----------------------------------------------------------------------------------------------------------------------------------------------
                //-----------------------------------------------------------------------------------------------------------------------------------------------
                case 2:


                    System.out.println("Você escolheu a Rota do Desespero.");


                    System.out.println("---------------Você entrou na Sala 1 - Tumba do Terror.-----------");

                    int numeroInimigos = rand.nextInt(5);

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }



                    //------------------------------------------------------------------
                    running = true;
                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");

                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }
                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("---------Você avançou para a Sala 2 - Antro da Angústia.---------------");

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }


                    running = true;


                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");
                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }
                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("Você chegou à Sala 3 - Vale das Sombras.");

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }


                    System.out.println("Parabéns! Você sobreviveu a Rota do Desespero!");


                    run = false;
                    break;

                //-----------------------------------------------------------------------------------------------------------------------------------------------
                //-----------------------------------------------------------------------------------------------------------------------------------------------
                case 3:

                    System.out.println("Você escolheu a Passagem das Sombras.");



                    System.out.println("---------------Você entrou na Sala 1 - Labirinto da Morte.-----------");

                   numeroInimigos = rand.nextInt(8);

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }


                    //------------------------------------------------------------------
                    running = true;
                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");

                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }

                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("---------Você avançou para a Sala 2 - Fortaleza do Medo.---------------");

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }


                    running = true;


                    while (running) {

                        System.out.println("O que você deseja fazer?");
                        System.out.println("1. Avançar para a próxima sala.");
                        System.out.println("2. Usar uma pocao.");
                        System.out.println("3. Ver o inventário.");
                        System.out.println("4. Ver o Status.");
                        escolha = input.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Você escolheu avançar para a próxima sala.");
                                running = false;
                                break;
                            case 2:
                                heroi.usarPocao();
                                break;
                            case 3:
                                if(heroi.getInventarioConsumiveis().size()==0){
                                    System.out.println("A lista de consumiveis esta vazia");
                                }else{heroi.getInventarioConsumiveis_(); }


                                break;
                            case 4:
                                heroi.status();
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                        }
                    }


                    System.out.println("Você chegou à Sala 3 - Cripta dos Horrores.");

                    for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

                        NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
                        resultado = heroi.atacar(inimigo);
                        if (!resultado){return false;}
                    }


                    System.out.println("Parabéns! Você sobreviveu a Passagem das Sombras.!");

                    run = false;
                    break;

                //-----------------------------------------------------------------------------------------------------------------------------------------------
                //-----------------------------------------------------------------------------------------------------------------------------------------------
                default:
                    System.out.println("Opção inválida. Por favor, escolha um número de 1 a 3.");
            }
        }

        return resultado;
    }


}
