package Controllers;

import Domain.Competion;
import Domain.Jogador;
import Model.CompetionRepository;
import Model.JogadoresRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompeticaoController {


    public CompeticaoController() {
    }



    public void competicoesAno(String ano) throws FileNotFoundException {

        ArrayList<Competion> competionList = CompetionRepository.getInstance().getCompetionList();

        for (Competion competion : competionList) {
            if (competion.getData().strip().split("-")[2].equals(ano)) {

                System.out.println(competion);
            }


        }

    }

    public void competicoesTodas() throws FileNotFoundException {

        ArrayList<Competion> competionList = CompetionRepository.getInstance().getCompetionList();

        for (Competion competion : competionList) {

            System.out.println(competion);

        }

    }










}
