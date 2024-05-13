package supplyChainSystem;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static Warehouse instance; // Singleton instance
    private int warehouseID;
    private String name;
    private String address;
    private int capacity;
    private int stock;
    private List<Product> products;
    private List<WarehouseObserver> observers; // List of observers

    // Private constructor to prevent instantiation from outside
    private Warehouse(int warehouseID, String name, String address, int capacity) {
        this.warehouseID = warehouseID;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.stock = 0;
        this.products = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Static method to get the Singleton instance
    public static Warehouse getInstance(int warehouseID, String name, String address, int capacity) {
        if (instance == null) {
            instance = new Warehouse(warehouseID, name, address, capacity);
        }
        return instance;
    }

    // Method to register observers
    public void addObserver(WarehouseObserver observer) {
        observers.add(observer);
    }

    // Method to remove observers
    public void removeObserver(WarehouseObserver observer) {
        observers.remove(observer);
    }

    // Notify observers of changes
    private void notifyObservers() {
        for (WarehouseObserver observer : observers) {
            observer.update();
        }
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

    public void updateStock(int newStock) {
        this.stock = newStock;
        notifyObservers();
    }

    public int getStock() {
        return stock;
    }

    public void updateCapacity(int newCapacity) {
        this.capacity = newCapacity;
        notifyObservers();
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
