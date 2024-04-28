package Entidade;

import ItemHeroi.ArmaPrincipal;
import ItemHeroi.ConsumivelCombate;
import Outros.Cores;

import java.util.Scanner;

public class CavaleiroTeste extends Heroi {


    private final double FACTOR_ATAQUE = 1;
    /**
     * Construtor da clase cavaleiro que tem como super class heroi
     *
     * @param VALOR_INICIAL_VIDA
     * @param nome
     * @param forca
     * @param nivel
     * @param ouro
     * @param armaPrincipal
     */
    public CavaleiroTeste(int VALOR_INICIAL_VIDA, String nome, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) { //!falta definir a ama principal ArmaPrincipal armaPrincipal
        super(VALOR_INICIAL_VIDA, nome, forca, nivel, ouro, armaPrincipal);

    }

    /**
     * Funcao de ataque que recebe de parametro um npc e retorna um boolean
     * @param npc
     * @return
     */
    @Override
    public boolean atacar(NPC npc) {

        //ataque
        boolean opcao_correta = true, run = true;
        boolean ataque_esqpecial = true;
        int count=0;


        while (run) {
            System.out.println(Cores.BG_GREEN);
            String iniciar_ataque="";


            if (opcao_correta) {// ataque do inimigo
                System.out.println(Cores.BG_RED);
                System.out.println("-----------ATAQUE " + npc.getNome() + "-------------------");
                this.setVidaAtual_hp(this.getVidaAtual_hp() - (int) (npc.getForca() * FACTOR_ATAQUE));
                System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                System.out.println("---------------------------------------------------------");

            }

            if (this.getVidaAtual_hp() <= 0) {// verifica a vida atual mediante o ataque do NPC
                System.out.println(Cores.BG_PURPLE);
                System.out.println("****************************************************************************************");
                System.out.println("O " + this.getNome() + " PERDEU " + Cores.derrota + Cores.derrota + Cores.derrota);
                System.out.println("****************************************************************************************");
                return false;

            } else {

                System.out.println(Cores.BG_GREEN);
                String mensagem;
                if (ataque_esqpecial) {
                    mensagem = "Indique o ataque deseja efectuar" +
                            "\n 1 - Ataque Normal" +
                            "\n 2 -  Ataque Especial" +
                            "\n 3 -   Ataque com item especial";
                } else {
                    mensagem = "Indique o ataque deseja efectuar" +
                            "\n 1 - Ataque Normal" +
                            "\n 2 -  Ataque Especial (JÁ FOI USADO)" +
                            "\n 3 -   Ataque com item especial";

                }

                Scanner input = new Scanner(System.in);// imprime mensagem medinte foi usado ou nao o ataque especial
                System.out.println("****************************************************************************************");
                System.out.println(mensagem);
                System.out.print("->");
                int opcao = input.nextInt();
                System.out.println("****************************************************************************************");

                switch (opcao) {
                    case 1:// ataque normal do heroi

                        System.out.println(Cores.BG_BLUE);
                        System.out.println("--------------ATAQUE NORMAL DO HEROI -------------");
                        npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - getArmaPrincipal().getAtaque());
                        System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                        System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                        System.out.println("---------------------------------------------------------");

                        opcao_correta = true;

                        if (npc.getVidaAtual_hp() <= 0) {// verifica vida do inimigo
                            this.setNivel(this.getNivel() + 1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp() + 10);
                            this.setForca(this.getForca() + 1);
                            this.setOuro(this.getOuro() + npc.getOuro());
                            System.out.println(Cores.BG_CYAN);
                            System.out.println("****************************************************************************************");
                            System.out.println("O " + this.getNome() + " GANHOU " + Cores.vitoria + Cores.vitoria + Cores.vitoria + Cores.vitoria);
                            System.out.println("****************************************************************************************");
                            return true;

                        }
                        break;
                    case 2:

                        if (!ataque_esqpecial) {
                            opcao_correta = false;}

                        if (ataque_esqpecial && count<=0) {
                            System.out.println(Cores.BG_BLUE);
                            System.out.println("--------------ATAQUE ESPECIAL DO HEROI-------------");
                            npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - getArmaPrincipal().getAtaqueEspecial());
                            System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                            System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                            System.out.println("---------------------------------------------------------");
                            ataque_esqpecial = false;
                            opcao_correta = true;
                            count++;

                        }

                        if (npc.getVidaAtual_hp() <= 0) {//verifica vida do inimigo
                            this.setNivel(this.getNivel() + 1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp() + 10);
                            this.setForca(this.getForca() + 1);
                            this.setOuro(this.getOuro() + npc.getOuro());
                            System.out.println(Cores.BG_CYAN);
                            System.out.println("****************************************************************************************");
                            System.out.println("O " + this.getNome() + " GANHOU " + Cores.vitoria + Cores.vitoria + Cores.vitoria + Cores.vitoria);
                            System.out.println("****************************************************************************************");
                            return true;
                        }
                        break;

                    case 3:
                        System.out.println(Cores.BG_GREEN);
                        if(this.countConsumivelCombate()==0){// verifica se tem items de combate

                            System.out.println("-------------------------------------------------------");
                            System.out.println("--------------Sem itens de combate---------------------");
                            System.out.println("-------------------------------------------------------");
                            opcao_correta=false;

                        }else{
                        boolean runAtual = true;

                        int item = 0;
                        while (runAtual) {// fica a rodar ate feita uma escolha correta de item

                            System.out.println("----------------Escolha um dos items------------------ ");
                            this.getConsumivelCombate();
                            System.out.print(" Com qual item deseseja atacar , indique o número-> ");
                            item = input.nextInt();


                            System.out.println(Cores.BG_RED);
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Deseja efectuar o ataque ?" +
                                    "\n 1 - Sim ou Não - S/N");
                            System.out.print("-->");
                            input.nextLine();
                            iniciar_ataque = input.nextLine().toUpperCase();

                            System.out.println("----------------------------------------------------------");

                            if (item >= 0 && item <= this.getInventarioConsumiveis().size() && this.countConsumivelCombate()>0 )
                            {
                                runAtual = false;
                            }
                        }
                        if (iniciar_ataque.equals("S")){// confirma o ataque


                        System.out.println(Cores.BG_BLUE);
                        System.out.println("--------------ATAQUE COM ITEM DO HEROI-------------");

                        npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - ((ConsumivelCombate) this.getInventarioConsumiveis().get(item)).getAtaqueInstantaneo());
                        System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                        System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                        System.out.println("---------------------------------------------------------");
                        opcao_correta = true;
                        this.removeInventarioConsumiveis(this.getInventarioConsumiveis().get(item));
                        if (npc.getVidaAtual_hp() < 0) {
                            this.setNivel(this.getNivel() + 1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp() + 10);
                            this.setForca(this.getForca() + 1);
                            this.setOuro(this.getOuro() + npc.getOuro());
                            System.out.println(Cores.BG_CYAN);
                            System.out.println("****************************************************************************************");
                            System.out.println("O " + this.getNome() + " GANHOU " + Cores.vitoria + Cores.vitoria + Cores.vitoria + Cores.vitoria);
                            System.out.println("****************************************************************************************");
                            return true;
                        }}}
                        System.out.println(Cores.RESET);
                        break;
                    default:
                        System.out.println(Cores.BG_YELLOW);
                        System.out.println("****************************************************************************************");
                        System.out.println("Escolha uma opção valida");
                        System.out.println("****************************************************************************************");
                        opcao_correta = false;


                }
            }

        }
        System.out.println(Cores.RESET);
        return false;
    }


}

