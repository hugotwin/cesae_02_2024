package org.example.Model;

import org.example.Domain.Utilizador;
import org.example.Tools.CSVPlayerReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminRepository {




    private AdminRepository() throws FileNotFoundException {
    }

    public static AdminRepository getInstance() {

        AdminRepository AdminRepository = null;
        return AdminRepository;
    }

    public String getListAdm() {
        return null;
    }
}
