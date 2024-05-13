package Tools;

import Domain.Product;
import Domain.Staff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StaffCSVReader {

    public static ArrayList<Staff> readCsvFileToArray(String path) throws FileNotFoundException {


        // Abrir o ficheiro
        File salesFile = new File(path);

        // Criar o Scanner para o ficheiro
        Scanner sc = new Scanner(salesFile);

        // Criar o ArrayList
        ArrayList<Staff> staffArray = new ArrayList<>();

        // Ignorar a linha do cabeçalho
        sc.nextLine();

        // Ciclo para iterar o ficheiro
        while (sc.hasNextLine()) {

            // Captura a linha
            String line = sc.nextLine();

            // Divide a linha pelo caracter
            String[] splitLine = line.split(",");

            // Capturo as informações da linha
            String staffType = splitLine[0];
            String user = splitLine[1];
            String password = splitLine[2];

            // Criar o novo objeto de Product
            Staff newStaff = new Staff(staffType,user,password);

            // Adiciono a nova Sale ao Array
            staffArray.add(newStaff);
        }

        return staffArray;
    }

}
