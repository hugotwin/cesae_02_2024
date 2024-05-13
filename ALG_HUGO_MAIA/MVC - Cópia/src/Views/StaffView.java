package Views;

import Controllers.StaffController;
import Domain.Product;
import Domain.Sale;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StaffView {
    private final StaffController staffController = new StaffController();
    public StaffView() {}

    public void staffMenu () throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.print("""
                    Staff Menu:
                    1 - Add sale
                    2 - Search stock
                    0 - Exit
                    """);
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1-> {
                    System.out.print("Product type: ");
                    String productType = input.nextLine();

                    System.out.print("Product: ");
                    String product = input.nextLine();

                    System.out.print("Quantity sold: ");
                    double quantitySold = input.nextDouble();

                    System.out.print("Unit price: ");
                    double unitPrice = input.nextDouble();

                    Product newProduct = new Product(productType, product, unitPrice);
                    staffController.addSale(newProduct, quantitySold);
                }


                case 2-> {
                    System.out.println("Indique o produto");
                    String produto = input.nextLine();

                    System.out.println("O produto tem o seguinte stock : " +   staffController.stockProduto(produto));






                }

                case 0 -> {}

                default-> System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);
    }
}
