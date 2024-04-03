package supplyChainSystem;

public class SupplyChainSystemClient {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer(001122, "Layan", "Makkah", "0544850381", "layan@outlook.com");

        // Create an order
        Order order = new Order(1, customer, "Makkah");

        // Create some products
        Product product1 = new Product(1, "Product 1", "Description 1", 9.99, 2);
        Product product2 = new Product(2, "Product 2", "Description 2", 19.99, 1);

        // Add products to the order
        order.addProduct(product1, 2);
        order.addProduct(product2, 1);

        // Display order details
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Total Amount: $" + order.getTotalAmount());
        System.out.println("Products:");

        for (Product product : order.getProducts()) {
            System.out.println("  - " + product.getName() + ": $" + product.getPrice());
        }

        // Create a supplier
        Supplier supplier = new Supplier(123456, "Supplier X", "Supplier Address", "123456789", "supplier@example.com");

        // Add products supplied by the supplier
        supplier.addProduct(product1);
        supplier.addProduct(product2);

        // Display supplier details
        System.out.println("\nSupplier ID: " + supplier.getSupplierID());
        System.out.println("Supplier Name: " + supplier.getName());
        System.out.println("Supplier Address: " + supplier.getAddress());
        System.out.println("Contact Number: " + supplier.getContactNumber());
        System.out.println("Email: " + supplier.getEmail());
        System.out.println("Supplied Products:");

        for (Product product : supplier.getSuppliedProducts()) {
            System.out.println("  - " + product.getName() + ": $" + product.getPrice());
        }
    }
}
