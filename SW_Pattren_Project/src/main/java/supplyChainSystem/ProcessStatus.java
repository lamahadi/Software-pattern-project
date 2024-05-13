package supplyChainSystem;


public class ProcessStatus implements OrderStatus {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order processed successfully.");
        order.setStatus(new ShipmentStatus());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship order. Order must be processed first.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver order. Order must be shipped first.");
    }

    @Override
    public String toString() {
        return "Processing";
    }
}