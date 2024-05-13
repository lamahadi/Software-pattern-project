package supplyChainSystem;

public interface OrderStatus {

    void deliverOrder(Order order);
    void shipOrder(Order order);
    void processOrder(Order order);

}
