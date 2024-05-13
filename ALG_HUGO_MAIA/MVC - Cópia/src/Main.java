import Views.ClientView;
import Views.StaffView;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        ClientView clientView = new ClientView();
//        clientView.menuCliente();

        new StaffView().staffMenu();
    }
}
