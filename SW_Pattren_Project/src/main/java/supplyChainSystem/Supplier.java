package supplyChainSystem;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private int supplierID;
    private String name;
    private String address;
    private String contactNumber;
    private String email;
    private List<Product> suppliedProducts;

    public Supplier(int supplierID, String name, String address, String contactNumber, String email) {
        this.supplierID = supplierID;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
        this.suppliedProducts = new ArrayList<>();
    }

    public int getSupplierID() {
        return supplierID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<Product> getSuppliedProducts() {
        return suppliedProducts;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public void updateContactNumber(String newContactNumber) {
        this.contactNumber = newContactNumber;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void addProduct(Product product) {
        suppliedProducts.add(product);
    }

    public void removeProduct(Product product) {
        suppliedProducts.remove(product);
    }
    
    public void addSupplier(Supplier supplier){}
    
    public void removeSupplier(Supplier supplier){}
    
    public void displayDetails(){}
    
}
