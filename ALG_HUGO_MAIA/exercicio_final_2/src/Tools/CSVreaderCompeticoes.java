package Tools;

import Domain.Competion;
import Model.CompetionRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class CSVreaderCompeticoes {

    public static ArrayList<Competion> readCsvFileToArray(String path) throws FileNotFoundException {


        File salesFile = new File(path);

        // Criar o Scanner para o ficheiro
        Scanner sc = new Scanner(salesFile);

        // Criar o ArrayList
        ArrayList<Competion> competionList = new ArrayList<Competion>();

        // Ignorar a linha do cabeçalho
        sc.nextLine();

        // Ciclo para iterar o ficheiro
        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            // Divide a linha pelo caractere
            String[] splitLine = line.split(",");

            // Capturo as informações da linha
            String data = splitLine[0];
            String competicao = splitLine[1];
            String adversario = splitLine[2];
            int golosNossos = Integer.parseInt(splitLine[3]);
            int golosadversario = Integer.parseInt(splitLine[3]);

            Competion newCompetion = new Competion(data, competicao, adversario, golosNossos, golosadversario);

            // Adiciono a nova Sale ao Array
            competionList.add(newCompetion);


        }

        return competionList;
    }
}










