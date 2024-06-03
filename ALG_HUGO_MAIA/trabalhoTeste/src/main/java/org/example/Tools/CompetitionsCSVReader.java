package org.example.Tools;

import org.example.Domain.Competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompetitionsCSVReader {

    public static ArrayList<Competition> readCsvFileToArray(String path) throws FileNotFoundException {
        File competitionFiles = new File(path);

        Scanner sc = new Scanner(competitionFiles);

        ArrayList<Competition> competitionArray = new ArrayList<>();

        sc.nextLine();

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] splitLine = line.split(";");


            String date = splitLine[0];
            String competition = splitLine[1];
            String adversary = splitLine[2];
            int ourGoals = Integer.parseInt(splitLine[3]);
            int theirGoals = Integer.parseInt(splitLine[4]);

            // Criar novo objeto de Competições
            Competition oneCompetition = new Competition(date,competition,adversary,ourGoals,theirGoals);

            competitionArray.add(oneCompetition);
        }

        return competitionArray;
    }
}
