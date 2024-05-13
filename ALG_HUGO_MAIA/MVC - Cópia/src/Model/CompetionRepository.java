package Model;

import Domain.Competion;
import Tools.CSVreaderCompeticoes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompetionRepository {


    private static CompetionRepository competionRepository;
    private ArrayList<Competion> competionList;

    private CompetionRepository(String caminho) throws FileNotFoundException {
        this.competionList = CSVreaderCompeticoes.readCsvFileToArray(caminho);
    }

    public static CompetionRepository getInstance(String caminho) throws FileNotFoundException {

        if(competionRepository==null){
            competionRepository=new CompetionRepository(caminho);
        }
        return competionRepository;
    }

    public ArrayList<Competion> getCompetionList() {
        return competionList;
    }
}
