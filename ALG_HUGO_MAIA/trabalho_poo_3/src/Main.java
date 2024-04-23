import Entidade.Cavaleiro;
import Entidade.Heroi;
import Entidade.NPC;
import ItemHeroi.ArmaPrincipal;
import ItemHeroi.Consumivel;
import ItemHeroi.ConsumivelCombate;
import ItemHeroi.Pocao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArmaPrincipal metrelhadora = new ArmaPrincipal("ak47", 100, 100, 200);
        ArmaPrincipal pistola_semi_automatica = new ArmaPrincipal("glock", 50, 50, 100);

        ArmaPrincipal faca = new ArmaPrincipal("faca", 50, 50, 100);
        ArmaPrincipal arma_plasma = new ArmaPrincipal("plasma", 200, 200, 400);
        ConsumivelCombate granada = new ConsumivelCombate("granada", 100, 300);
        ConsumivelCombate setas = new ConsumivelCombate("faca", 30, 50);
        ConsumivelCombate granada_plasma = new ConsumivelCombate("granada_plasma", 200, 600);

        ConsumivelCombate desintregador = new ConsumivelCombate("desintrregador", 500, 100);
        Pocao poca_vida = new Pocao("pocao_vida", 25, 25, 0);
        Pocao poca_forca = new Pocao("pocao_forca", 25, 0, 75);
        Pocao poca_all = new Pocao("pocao_all", 40, 25, 25);

        Pocao poca_Mega_vida = new Pocao("pocao_Mega_vida", 100, 100, 100);
        Vendedor vendedor = new Vendedor();
        vendedor.addItemHeroi(metrelhadora);
        vendedor.addItemHeroi(pistola_semi_automatica);
        vendedor.addItemHeroi(faca);
        vendedor.addItemHeroi(arma_plasma);
        vendedor.addItemHeroi(granada);
        vendedor.addItemHeroi(setas);
        vendedor.addItemHeroi(granada_plasma);
        vendedor.addItemHeroi(desintregador);
        vendedor.addItemHeroi(poca_vida);
        vendedor.addItemHeroi(poca_forca);
        vendedor.addItemHeroi(poca_all);
        vendedor.addItemHeroi(poca_Mega_vida);

        //vendedor.imprimirloja();

        System.out.println("Vamos comecar o jogo ");

        System.out.println("Faca a escolha do seu heroi");

        Cavaleiro cavaleiro =new Cavaleiro(1500,"valor", 300, 1,3000,faca );
        NPC zombie = new NPC(1000,"Zombie", 40, 100);

        vendedor.imprimirloja();



        vendedor.vender(cavaleiro);
        vendedor.vender(cavaleiro);



        //cavaleiro.getInventarioConsumiveis_();
        //cavaleiro.usarPocao();
        //System.out.println(cavaleiro.getArmaPrincipal());

        System.out.println(cavaleiro.atacar(zombie));
        cavaleiro.getInventarioConsumiveis_();
        System.out.println(cavaleiro.getVidaAtual_hp());
        System.out.println(cavaleiro.getForca());
        System.out.println(cavaleiro.getNivel());













    }


}