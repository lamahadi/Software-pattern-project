package supplyChainSystem;


public class ShipmentStatus implements OrderStatus {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cannot process order. Order is already shipped.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped successfully.");
        order.setStatus(new DeliveryStatus());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver order. Order is already shipped.");
    }

    @Override
    public String toString() {
        return "Shipped";
    }
}