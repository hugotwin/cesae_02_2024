package Tools;

import Domain.Jogador;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    public static ArrayList<Jogador> readJogadoresFile(String path) throws FileNotFoundException {
        ArrayList<Jogador> jogadorArray = new ArrayList<Jogador>();
        File jogadoresFile = new File(path);
        Scanner scannerFile = new Scanner(jogadoresFile);
        scannerFile.nextLine();
        while (scannerFile.hasNextLine()){
            String[] jogadorLine = scannerFile.nextLine().split(";");
            Jogador newJogador = new Jogador(Integer.parseInt(jogadorLine[0]), jogadorLine[1], Integer.parseInt(jogadorLine[2]), jogadorLine[3], Integer.parseInt(jogadorLine[4]), Integer.parseInt(jogadorLine[5]), Double.parseDouble(jogadorLine[6]));
            jogadorArray.add(newJogador);
        }
        return jogadorArray;
    }
}
