package org.example.Tools;

import org.example.Domain.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVPlayerReader {

    /**
     * Método que retorna um Array de Players
     *
     * @return Array de Players preenchido com informações do ficheiro
     * @throws FileNotFoundException
     */
    public static ArrayList<Player> readCsvFileToArray(String path) throws FileNotFoundException {

        // Abrir o ficheiro
        File playersFile = new File(path);


        // Criar o Scanner para o ficheiro
        Scanner sc = new Scanner(playersFile);

        // Criar o ArrayList
        ArrayList<Player> playersArray = new ArrayList<Player>();

        // Ignorar a linha do cabeçalho
        sc.nextLine();

        // Ciclo para iterar o ficheiro
        while (sc.hasNextLine()) {

            // Captura a linha
            String line = sc.nextLine();

            // Divide a linha pelo caracter
            String[] splitLine = line.split(";");

            // Capturo as informações da linha
            int number = Integer.parseInt(splitLine[0]);
            String name = splitLine[1];
            int age = Integer.parseInt(splitLine[2]);
            String nationality = splitLine[3];
            int defenceRanking = Integer.parseInt(splitLine[4]);
            int attackRanking = Integer.parseInt(splitLine[5]);
            int value = Integer.parseInt(splitLine[6]);

            // Criar o novo objeto de Player
            Player newplayer = new Player(number, name, age, nationality, defenceRanking, attackRanking, value);

            // Adiciono a nova Player ao Array
            playersArray.add(newplayer);
        }

        return playersArray;


    }


}
