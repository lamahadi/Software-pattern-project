package supplyChainSystem;

import java.util.Date;
import java.util.Scanner;

public class shipmentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter shipment ID: ");
        int shipmentID = scanner.nextInt();

        System.out.print("Please enter customer ID: ");
        int customerID = scanner.nextInt();
        
        scanner.nextLine(); 

        System.out.print("Please enter customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Please enter destination: ");
        String destination = scanner.nextLine();
        
        System.out.print("Please enter order ID: ");
        int orderID = scanner.nextInt();

        Date shipmentDate = new Date();
        
        Date arrivalDate = new Date();

        // Create a customer
        Customer customer = new Customer(customerID, customerName);

        // Create an order
        Order order = new Order(orderID, customer, destination);

        // Create a shipment factory
        shipmentFactory shipmentFactory = new shipmentFactory();

        System.out.println("please select the shipment type");
        System.out.println("1- Air");
        System.out.println("2- Sea");
        System.out.println("3- Land");

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
                System.exit(0);
        }

        if (shipment != null) {
            System.out.println("Shipment created successfully");
            System.out.println("Shipment ID: " + shipment.getShipmentID());
            System.out.println("Order: " + shipment.getOrder().getOrderId());
            System.out.println("Destination: " + shipment.getDestination());
            System.out.println("Shipment Date: " + shipment.getShipmentDate());
            System.out.println("Arrival Date: " + shipment.getArrivalDate());
            System.out.println("Shipment Type: " + shipment.getTransportType());
        }
    }
}