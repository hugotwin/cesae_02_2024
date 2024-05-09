package Model;

import Domain.Staff;
import Tools.CSVStaffReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StaffRepository {
    private static StaffRepository instance;
    private ArrayList<Staff> team = CSVStaffReader.readCsvFileToArray();

    private StaffRepository() {}

    public static StaffRepository getInstance() {
        if (instance==null) {
            instance = new StaffRepository();
        }
        return instance;
    }

    public ArrayList<Staff> getTeam() {
        return team;
    }
}
