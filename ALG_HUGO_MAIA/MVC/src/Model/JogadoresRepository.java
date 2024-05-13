package Model;

import Domain.Jogador;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JogadoresRepository {
    private ArrayList<Jogador> listJogadores;
    private static JogadoresRepository instance;

    private JogadoresRepository() throws FileNotFoundException {
        this.listJogadores = CSVReader.readJogadoresFile("files/jogadores.csv");
    }

    public static JogadoresRepository getInstance() throws FileNotFoundException {
        if (instance == null){
            instance = new JogadoresRepository();
        }
        return instance;
    }

    public ArrayList<Jogador> getListJogadores() {
        return listJogadores;
    }
}
