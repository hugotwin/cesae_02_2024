package Model;

import Domain.Competion;
import Tools.CSVreaderCompeticoes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompetionRepository {


    private static CompetionRepository competionRepository;
    private ArrayList<Competion> competionList;

    private CompetionRepository() throws FileNotFoundException {
        this.competionList = CSVreaderCompeticoes.readCsvFileToArray("C:\\Users\\hugot\\OneDrive\\Ambiente de Trabalho\\cesae_02_2024\\ALG_HUGO_MAIA\\MVC\\Files\\competicoes.csv");
    }

    public static CompetionRepository getInstance() throws FileNotFoundException {

        if(competionRepository==null){
            competionRepository=new CompetionRepository();
        }
        return competionRepository;
    }

    public ArrayList<Competion> getCompetionList() {
        return competionList;
    }
}
