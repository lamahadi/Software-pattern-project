package supplyChainSystem;

public class Product {
    private int productID;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private Package pack; // Reference to the package associated with the product

    public Product(int productID, String name, String description, double price, int quantity, Package pack) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.pack = pack;
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
        // Calculate total price by adding product price to package price
        return price + pack.getPrice();
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

    public Package getPackage() {
        return pack;
    }

    public void setPackage(Package pack) {
        this.pack = pack;
    }
}
