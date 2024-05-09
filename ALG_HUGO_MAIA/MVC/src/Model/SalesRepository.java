package Model;

import Domain.Sale;
import Tools.CSVSalesReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {
    private static SalesRepository instance;
    private ArrayList<Sale> salesArray;

    private SalesRepository() throws FileNotFoundException {
        this.salesArray = CSVSalesReader.readCsvFileToArray("Files/minimercado.csv");// aqui le o ficheiro e cria o array Objecto Produto e preço
    }

    public static SalesRepository getInstance() throws FileNotFoundException {
        if(instance==null){
            instance= new SalesRepository();
        }

        return instance;
    }

    public ArrayList<Sale> getSalesArray() {
        return salesArray;
    }
}
