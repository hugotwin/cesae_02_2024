package Tools;

import Domain.Product;
import Domain.Sale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVSalesReader {

    /**
     * Método que retorna um Array de Sales
     * @return Array de Sales preenchido com informações do ficheiro
     * @throws FileNotFoundException
     */
    public static ArrayList<Sale> readCsvFileToArray(String path) throws FileNotFoundException {

        System.out.println("Ler ficheiro");

        // Abrir o ficheiro
        File salesFile = new File(path);

        // Criar o Scanner para o ficheiro
        Scanner sc = new Scanner(salesFile);

        // Criar o ArrayList
        ArrayList<Sale> salesArray = new ArrayList<Sale>();

        // Ignorar a linha do cabeçalho
        sc.nextLine();

        // Ciclo para iterar o ficheiro
        while (sc.hasNextLine()) {

            // Captura a linha
            String line = sc.nextLine();

            // Divide a linha pelo caractere
            String[] splitLine = line.split(",");

            // Capturo as informações da linha
            String productType = splitLine[0];
            String product = splitLine[1];
            double quantitySale = Double.parseDouble(splitLine[2]);
            double unitPrice = Double.parseDouble(splitLine[3]);

            // Criar o novo objeto de Product
            Product newProduct = new Product(productType,product,unitPrice);

            // Crio novo objeto de Sale
            Sale newSale = new Sale(newProduct,quantitySale);

            // Adiciono a nova Sale ao Array
            salesArray.add(newSale);
        }

        return salesArray;
    }

    public static void writeToFile (Sale sale) {
        try {
            FileWriter fw = new FileWriter(new File("Files/minimercado.csv"), true);
            String line = String.format("%s,%s,%s,%s",
                    sale.getProduct().getProductType(),
                    sale.getProduct().getProduct(),
                    sale.getQuantitySale(),
                    sale.getProduct().getUnitPrice()
            );

            fw.write("\n"+line);
            fw.close();
        } catch (IOException e) {throw new RuntimeException(e);}


    }
}

