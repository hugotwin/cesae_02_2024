package org.example.Views;

import org.example.Controllers.CoachController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoachView {
    private static CoachController CoachController;

    public CoachView() throws FileNotFoundException {
        this.CoachController = new CoachController();
    }

    public void coachMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        CoachController coachController = new CoachController();

        int opcao,year;
        System.out.println("""
                ------------ Coach menu ------------
                1.Search competition by year
                2.Search defense and attack ranking
                3.Best defense
                4.Best attack
                """);
        opcao = input.nextInt();

        switch (opcao){
            case 1 ->{
                System.out.println("Insert one year: ");
                year = input.nextInt();
                coachController.competitionsByYear(year);
            }

        }

    }
}
