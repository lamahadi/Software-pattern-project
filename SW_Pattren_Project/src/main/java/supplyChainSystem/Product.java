package supplyChainSystem;

public class Product {
    private int productID;
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(int productID, String name, String description, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }
}