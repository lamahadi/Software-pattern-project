package supplyChainSystem;

public class DeliveryStatus implements OrderStatus {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cannot process order. Order is already delivered.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship order. Order is already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered successfully.");
    }

    @Override
    public String toString() {
        return "Delivered";
    }
}
