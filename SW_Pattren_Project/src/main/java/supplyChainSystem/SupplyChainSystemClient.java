package supplyChainSystem;

import java.util.Date;
import java.util.Scanner;

public class SupplyChainSystemClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t* Welcome to the Supply Chain Management System! *");
        System.out.println("\t**************************************************\n");


        while (true) {
            System.out.println("\nWhich design pattern would you like to try?");
            System.out.println("**************************************************\n");


            System.out.println("1. State Design Pattern (Order)");
            System.out.println("2. Factory Method Pattern (Shipment)");
            System.out.println("3. Decorator Design Pattern (Product)");
            System.out.println("4. Composite Design Pattern (Supplier)");
            System.out.println("5. Singleton and Observer Design Pattern (Warehouse)");
            System.out.println("6.  Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    testStateDesignPattern();
                    break;
                case 2:
                    testFactoryMethodPattern();
                    break;
                case 3:
                    testDecoratorDesignPattern();
                    break;
                case 4:
                    testCompositeDesignPattern();
                    break;
                case 5:
                    testObserverDesignPattern();
                    break;
                case 6:
                    System.out.println("Exiting Supply Chain System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    private static void testStateDesignPattern() {
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t***************State Design Pattern*************");
        System.out.println("\t**************************************************\n");

        Customer customer = new Customer(001122, "Layan", "Makkah", "0544850381", "layan@outlook.com");
        Order order = new Order(1, customer, "Makkah");

        System.out.println("\t***************Order Status*************");

        System.out.println("Initial Order Status: " + order.getStatus());

        order.processOrder();
        System.out.println("Order Processed. Current Status: " + order.getStatus());
        order.processOrder();
        System.out.println("Attempt to process again: " + order.getStatus());

        order.shipOrder();
        System.out.println("Order Shipped. Current Status: " + order.getStatus());
        order.processOrder();
        System.out.println("Attempt to process after shipping: " + order.getStatus());

        order.deliverOrder();
        System.out.println("Order Delivered. Current Status: " + order.getStatus());
        order.processOrder();
        System.out.println("Attempt to process after delivery: " + order.getStatus());

        order.shipOrder();
        System.out.println("Attempt to ship after delivery: " + order.getStatus());

        System.out.println("\t***************Customer Information*************");
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Contact Number: " + customer.getContactNumber());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("\t***************Order Information*************");
        System.out.println("\nOrder ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());

    }

    private static void testFactoryMethodPattern() {
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t***************Factory Design Pattern*************");
        System.out.println("\t**************************************************\n");


        int shipmentID = 123;
        String destination = "Jeddah";
        Date shipmentDate = new Date();
        Date arrivalDate = new Date();

        // Create an order with a customer
        Order order = new Order(1, new Customer(001122, "Layan", "Makkah", "0544850381", "layan@outlook.com"), destination);

        // Create a shipment factory
        ShipmentFactory shipmentFactory = new ShipmentFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the shipment type:");
        System.out.println("1. Air");
        System.out.println("2. Sea");
        System.out.println("3. Land");
        int choice = scanner.nextInt();

        Shipment shipment = null;

        switch (choice) {
            case 1:
                shipment = shipmentFactory.createShipment("Air", shipmentID, order, destination, shipmentDate, arrivalDate);
                break;
            case 2:
                shipment = shipmentFactory.createShipment("Sea", shipmentID, order, destination, shipmentDate, arrivalDate);
                break;
            case 3:
                shipment = shipmentFactory.createShipment("Land", shipmentID, order, destination, shipmentDate, arrivalDate);
                break;
            default:
                System.out.println("Invalid type!! Try again.");
                break;
        }

        System.out.println("\t***************Shipment Information*************");
        if (shipment != null) {
            System.out.println("Shipment created successfully");
            System.out.println("Shipment ID: " + shipment.getShipmentID());
            System.out.println("Order: " + shipment.getOrder().getOrderId());
            System.out.println("Destination: " + shipment.getDestination());
            System.out.println("Shipment Date: " + shipment.getShipmentDate());
            System.out.println("Arrival Date: " + shipment.getArrivalDate());
        }
    }

    private static void testDecoratorDesignPattern() {
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t**************Decorator Design Pattern*************");
        System.out.println("\t**************************************************\n");

        // Create a basic package
        Package basicPackage = new BasicPackage("Basic Package", 0, "Basic packaging");
        Package wrappedBox = new Wrap(new Box(basicPackage, "Medium", "Cardboard"), "Colorful paper");

        Product product = new Product(1, "Smartphone", "128 black smartphone", 500, 1, wrappedBox);

        System.out.println("\t***************Product Information*************");
        // Display product price, package price, and total price
        System.out.println("Product: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Product Price: $" + product.getPrice());
        System.out.println("Package Price: $" + product.getPackage().getPrice());
        System.out.println("Total Price: $" + (product.getPrice() + product.getPackage().getPrice()));

    }

    private static void testCompositeDesignPattern() {
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t**************Composite Design Pattern*************");
        System.out.println("\t**************************************************\n");

        // Create suppliers
        Supplier supplier1 = new Supplier(1, "Supplier 1", "Address 1", "123456789", "supplier1@example.com");
        Supplier supplier2 = new Supplier(2, "Supplier 2", "Address 2", "987654321", "supplier2@example.com");

        SupplierManager manager = new SupplierManager();

        // Add suppliers to the manager
        manager.addSupplier(supplier1);
        manager.addSupplier(supplier2);

        // Display supplier manager details
        System.out.println("\t***************Supplier Information*************");
        manager.displayDetails();

        // Remove a supplier
        manager.removeSupplier(supplier2);

        // Display details after removal
        manager.displayDetails();
    }

    private static void testObserverDesignPattern() {
        System.out.println("\n\n\t**************************************************");
        System.out.println("\t**************Observer Design Pattern*************");
        System.out.println("\t**************************************************\n");

        Warehouse warehouse = Warehouse.getInstance(1, "Warehouse A", "123 Main St", 1000);
        StockObserver stockObserver = new StockObserver(warehouse);
        CapacityObserver capacityObserver = new CapacityObserver(warehouse);

        warehouse.updateStock(130);
        warehouse.updateCapacity(502);

        System.out.println("\t***************Warehouse Information*************");
        System.out.println("Warehouse ID: " + warehouse.getWarehouseID());
        System.out.println("Warehouse Name: " + warehouse.getName());
        System.out.println("Warehouse Address: " + warehouse.getAddress());
        System.out.println("Warehouse Capacity: " + warehouse.getCapacity());
        System.out.println("Warehouse Stock: " + warehouse.getStock());

        warehouse.updateStock(150);
        warehouse.updateCapacity(600);

        warehouse.removeObserver(capacityObserver);

        warehouse.updateStock(180);
        warehouse.updateCapacity(700);
    }
}
