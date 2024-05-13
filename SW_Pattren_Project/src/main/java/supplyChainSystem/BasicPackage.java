package supplyChainSystem;

public class BasicPackage implements Package {

    private String name;
    private double price;
    private String description;

    public BasicPackage(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price+10;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
