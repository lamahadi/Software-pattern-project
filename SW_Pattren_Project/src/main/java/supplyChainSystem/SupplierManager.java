package supplyChainSystem;

import java.util.ArrayList;
import java.util.List;

public class SupplierManager implements Employee {
    private List<Supplier> suppliers;

    public SupplierManager() {
        this.suppliers = new ArrayList<>();
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public void removeSupplier(Supplier supplier) {
        suppliers.remove(supplier);
    }

    @Override
    public void displayDetails() {
        System.out.println("Supplier Manager Details:");
        for (Supplier supplier : suppliers) {
            System.out.println("Supplier Name: " + supplier.getName());
            System.out.println("Supplier ID: " + supplier.getSupplierID());
            System.out.println("Address: " + supplier.getAddress());
            System.out.println("Contact Number: " + supplier.getContactNumber());
            System.out.println("Email: " + supplier.getEmail());
        }
    }
}
