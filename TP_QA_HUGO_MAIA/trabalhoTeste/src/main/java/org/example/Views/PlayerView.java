package org.example.Views;

import org.example.Controllers.PlayerController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlayerView {

    private static PlayerController playerController;

    public PlayerView() throws FileNotFoundException {
        this.playerController = new PlayerController();
    }

    public void playerMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n***** PLAYER *****\n");
            System.out.println("1. See Player's List");
            System.out.println("2. See Competitions Where The Game Was Won.");
            System.out.println("3. See The Competition with More Scored Goals.");
            System.out.println("0. Exit");
            System.out.print("\nSelect an Option: ");
            option = input.nextInt();

            System.out.println();

            switch (option) {
                case 1: // See players list
                    PlayerController pc = new PlayerController();

                    pc.getPlayersList();

                    break;

                case 2: // See Competitions Where The Game Was Won.
                    PlayerController pe = new PlayerController();

                    pe.getCompetitions();


                    break;

                case 3: // Consultar Produto Mais Caro/Barato
                    break;

                case 0: // Sair
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (option != 0);
    }
}
