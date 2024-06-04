package org.example.Model;

import org.example.Domain.Competition;
import org.example.Tools.CompetitionsCSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompetitionsRepository {
    private static CompetitionsRepository instance;
    private ArrayList<Competition> competitionsArray;

    private CompetitionsRepository() throws FileNotFoundException {

        this.competitionsArray = CompetitionsCSVReader.readCsvFileToArray("Files/competicoes.csv");
    }

    public static org.example.Model.CompetitionsRepository getInstance() throws FileNotFoundException {
        if(instance == null){
            instance = new org.example.Model.CompetitionsRepository();
        }
        return instance;
    }

    public  ArrayList<Competition> getCompetitionsArray() {
        return this.competitionsArray;
    }
}

