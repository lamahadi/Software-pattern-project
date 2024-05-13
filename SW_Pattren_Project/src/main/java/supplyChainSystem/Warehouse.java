package supplyChainSystem;

public class Warehouse {
    private int globalWarehouseID;
    private String name;
    private String address;
    private int capacity;
    private Product product;
    private static Warehouse instance;

    private Warehouse() {
    }
    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public int getglobalWarehouseID() {
        return globalWarehouseID;
    }

    public void setglobalWarehouseID(int warehouseID) {
        this.globalWarehouseID = warehouseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Product getProduct() {
        return product;
    }

    public void addProduct(Product product) {
        this.product = product;
    }

    public void removeProduct() {
        this.product = null;
    }

    public boolean checkAvailability() {
        return (product != null);
    }
}