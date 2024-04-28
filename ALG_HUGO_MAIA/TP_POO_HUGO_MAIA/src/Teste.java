import Entidade.*;
import ItemHeroi.ArmaPrincipal;
import ItemHeroi.ConsumivelCombate;
import ItemHeroi.Pocao;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] listaHeroisPermitidosTodos = {"Cavaleiro", "Arqueiro", "Feiticeiro"};


        ArmaPrincipal metrelhadora = new ArmaPrincipal("ak47", 100,listaHeroisPermitidosTodos, 100, 200);
        ArmaPrincipal pistola_semi_automatica = new ArmaPrincipal("glock", 50,listaHeroisPermitidosTodos, 50, 100);

        ArmaPrincipal espada = new ArmaPrincipal("Espada",100,"Cavaleiro", 100,200);
        ArmaPrincipal arco = new ArmaPrincipal("Arco",100,"Arqueiro", 100,200);
        ArmaPrincipal bastao = new ArmaPrincipal("Bastão",100,"Feiticeiro", 100,200);


        ArmaPrincipal arma_plasma = new ArmaPrincipal("plasma", 200,listaHeroisPermitidosTodos, 200, 400);
        ConsumivelCombate granada = new ConsumivelCombate("granada", 100,listaHeroisPermitidosTodos, 300);
        ConsumivelCombate setas = new ConsumivelCombate("granada", 100,listaHeroisPermitidosTodos, 300);
        ConsumivelCombate granada_plasma = new ConsumivelCombate("granada_plasma", 100,listaHeroisPermitidosTodos, 300);
        ArmaPrincipal desintigrador = new ArmaPrincipal("Desintegrador", 200,listaHeroisPermitidosTodos, 200, 400);

        Pocao poca_vida = new Pocao("pocao_vida", 25,listaHeroisPermitidosTodos, 25, 0);
        Pocao poca_forca = new Pocao("pocao_forca", 25,listaHeroisPermitidosTodos, 0, 75);
        Pocao poca_all = new Pocao("pocao_all", 40,listaHeroisPermitidosTodos, 25, 25);

        Pocao poca_Mega_vida = new Pocao("pocao_Mega_vida", 100,listaHeroisPermitidosTodos, 100, 100);
        Vendedor vendedor = new Vendedor();
        vendedor.addItemHeroi(metrelhadora);
        vendedor.addItemHeroi(pistola_semi_automatica);
        vendedor.addItemHeroi(espada);
        vendedor.addItemHeroi(arma_plasma);
        vendedor.addItemHeroi(granada);
        vendedor.addItemHeroi(setas);
        vendedor.addItemHeroi(granada_plasma);
        vendedor.addItemHeroi(desintigrador);
        vendedor.addItemHeroi(poca_vida);
        vendedor.addItemHeroi(poca_forca);
        vendedor.addItemHeroi(poca_all);
        vendedor.addItemHeroi(poca_Mega_vida);



        System.out.println("Vamos comecar o jogo ");

        System.out.println("Faca a escolha do seu heroi");

        CavaleiroTeste cavaleiro =new CavaleiroTeste(15000000,"Cavaleiro", 300, 1,3000,espada );
        NPC zombie = new NPC(10000,"Zombie", 1000, 100);
        Feiticeiro feiticeiro = new Feiticeiro(1500000000,"Feiticeiro", 1000, 1,3000,bastao);

        vendedor.imprimirloja();



        vendedor.vender(cavaleiro);




        //cavaleiro.getInventarioConsumiveis_();
        //cavaleiro.usarPocao();
        //System.out.println(cavaleiro.getArmaPrincipal());

        System.out.println(cavaleiro.atacar(zombie));

        cavaleiro.status();














    }

}
