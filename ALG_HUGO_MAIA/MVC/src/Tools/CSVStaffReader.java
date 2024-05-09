package Tools;

import Domain.Staff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVStaffReader {

    public static ArrayList<Staff> readCsvFileToArray(){
        Scanner sc;
        try {
            sc = new Scanner(new File("Files/login_grandesNegocios.csv"));
        } catch (FileNotFoundException e) {throw new RuntimeException(e);}


        ArrayList<Staff> staffArray = new ArrayList<>();

        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] splitLine = line.split(",");

            String type = splitLine[0],
                userName = splitLine[1],
                password = splitLine[2];

            if (type.equals("FUNC")) {
                staffArray.add(new Staff(userName, password, password));
            }
        }

        return staffArray;
    }

}
