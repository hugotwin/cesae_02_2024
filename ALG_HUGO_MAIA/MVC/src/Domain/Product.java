package Domain;

public class Product {
    private String productType;
    private String product;
    private double unitPrice;
    private double stock;

    public Product(String productType, String product, double unitPrice) {
        this.productType = productType;
        this.product = product;
        this.unitPrice = unitPrice;
        this.stock = 1000;
    }

    public String getProductType() {
        return productType;
    }
    public String getProduct() {
        return product;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getStock() {return stock;}

    public void setProductType(String productType) {this.productType = productType;}
    public void setProduct(String product) {this.product = product;}
    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}
    public void setStock(double stock) {this.stock = stock;}

    @Override
    public String toString() {
        return "Product Type: "+this.productType + "\t| Product: "+product+"\t| Unit Price: "+unitPrice;
    }
}
