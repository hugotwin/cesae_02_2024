package Entidade;

import ItemHeroi.ArmaPrincipal;
import ItemHeroi.ConsumivelCombate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cavaleiro extends Heroi {

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
    public Cavaleiro(int VALOR_INICIAL_VIDA, String nome, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) { //!falta definir a ama principal ArmaPrincipal armaPrincipal
        super(VALOR_INICIAL_VIDA, nome, forca, nivel, ouro, armaPrincipal);

    }

    @Override
    public boolean atacar(NPC npc) {
        boolean retorno, run = true;
        while (run) {

            System.out.println("-----------ATAQUE" + npc.getNome() + "-------------------");
            this.setVidaAtual_hp(this.getVidaAtual_hp() - (int) (npc.getForca() * 0.8));
            System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
            System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
            System.out.println("---------------------------------------------------------");


            if (this.getVidaAtual_hp() <= 0) {
                System.out.println("O cavaleiro perdeu");

                return false;
            } else {
                Scanner input = new Scanner(System.in);
                System.out.println("Indique o ataque deseja efectuar" +
                        "\n 1 - Ataque Normal" +
                        "\n 2 -  Ataque Especial" +
                        "\n 3 -   Ataque com item especial");
                int opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("--------------ATAQUE NORMAL DO HEROI -------------");
                        npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - getArmaPrincipal().getAtaque());
                        System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                        System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                        System.out.println("---------------------------------------------------------");
                        if (npc.getVidaAtual_hp() <= 0) {
                            this.setNivel(this.getNivel()+1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp()+10);
                            this.setForca(this.getForca()+1);
                            this.setOuro(this.getOuro()+npc.getOuro());
                            System.out.println("O cavaleiro GANHOU");

                            return true;
                        }
                        break;
                    case 2:
                        System.out.println("--------------ATAQUE ESPECIAL DO HEROI-------------");
                        npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - getArmaPrincipal().getAtaqueEspecial());
                        System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                        System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                        System.out.println("---------------------------------------------------------");
                        if (npc.getVidaAtual_hp() <= 0) {
                            this.setNivel(this.getNivel()+1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp()+10);
                            this.setForca(this.getForca()+1);
                            this.setOuro(this.getOuro()+npc.getOuro());
                            System.out.println("O cavaleiro GANHOU");
                            return true;

                        }
                        break;
                    case 3:

                        System.out.println("Escolha um dos items ");
                        this.getInventarioConsumiveis_();
                        System.out.print(" Com qual item deseseja atacar , indique o numero-> ");
                        int item = input.nextInt();

                        System.out.println("--------------ATAQUE ESPECIAL DO HEROI-------------");

                        npc.setVidaAtual_hp(npc.getVidaAtual_hp() - this.getForca() - ((ConsumivelCombate) this.getInventarioConsumiveis().get(item)).getAtaqueInstantaneo());
                        System.out.println("Vida do Heroi ->" + this.getVidaAtual_hp());
                        System.out.println(("Vida do Inimigo ->" + npc.getVidaAtual_hp()));
                        System.out.println("---------------------------------------------------------");

                        this.removeInventarioConsumiveis(this.getInventarioConsumiveis().get(item));
                        if (npc.getVidaAtual_hp() < 0) {
                            this.setNivel(this.getNivel()+1);
                            this.setVidaAtual_hp(this.getVidaAtual_hp()+10);
                            this.setForca(this.getForca()+1);
                            this.setOuro(this.getOuro()+npc.getOuro());
                            System.out.println("O cavaleiro GANHOU");
                            return true;
                        }
                        break;
                    default :
                        System.out.println("Escolha uma opcao valida");

                }
            }

        }
        return false;
    }


}

