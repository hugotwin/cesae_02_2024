package Controllers;

import Domain.Product;
import Domain.Sale;
import Model.SalesRepository;
import Tools.CSVSalesReader;

import java.io.File;
import java.io.FileNotFoundException;

public class StaffController {
    public StaffController() {}

    public void addSale (Product product, double quantitySold) {
        Product productInArray = null;
        try {
            for (Sale sale : SalesRepository.getInstance().getSalesArray()) {
                if (product.equals(sale.getProduct())) {
                    productInArray = sale.getProduct();
                    productInArray.setStock(productInArray.getStock() - quantitySold);
                }
            }
            if (productInArray != null) {
                System.out.println(productInArray.getStock());    
            }
            
        } catch (FileNotFoundException e) {throw new RuntimeException(e);}

        Sale sale = new Sale(product, quantitySold);
        CSVSalesReader.writeToFile(sale);
    }



    public  double  stockProduto(String produto) throws FileNotFoundException {

        for(Sale produtoAtual : SalesRepository.getInstance().getSalesArray()){

            if(produtoAtual.getProduct().getProduct().equals(produto)){

                return produtoAtual.getProduct().getStock();
            }

        }

        return 0.0;

    }

}
