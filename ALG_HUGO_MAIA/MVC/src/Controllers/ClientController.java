package Controllers;

import Domain.Product;
import Domain.Sale;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {

    public ClientController() {
    }

    /**
     *
     * @param productTypeToFind
     * @return
     * @throws FileNotFoundException
     */
    public ArrayList<Product> getProductOfCategory(String productTypeToFind) throws FileNotFoundException {

        System.out.println("Controller iniciado");
        ArrayList<Sale> salesArray = SalesRepository.getInstance().getSalesArray();// cria aqui o sales array
        ArrayList<Product> filteredProducts = new ArrayList<Product>();// para criara a lista filtrada

        for(Sale actualSale : salesArray){// compara o tipo de produto e diciona  alista
            if(actualSale.getProduct().getProductType().equals(productTypeToFind)){
                filteredProducts.add(actualSale.getProduct());
            }
        }

        return filteredProducts;

    }

}
