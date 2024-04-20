package supplyChainSystem;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int warehouseID;
    private String name;
    private String address;
    private int capacity;
    private List<Product> products;

    public Warehouse(int warehouseID, String name, String address, int capacity) {
        this.warehouseID = warehouseID;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean checkAvailability(Product product) {
        return products.contains(product);
    }
}