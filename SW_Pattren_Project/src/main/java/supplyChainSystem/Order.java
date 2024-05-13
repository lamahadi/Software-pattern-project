package supplyChainSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private Date orderDate;
    private String deliveryAddress;
    private OrderStatus status;

    public Order(int orderId, Customer customer, String deliveryAddress) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
        this.orderDate = new Date();
        this.deliveryAddress = deliveryAddress;
        this.status = new ProcessStatus();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getStatus() {
       return status.toString();
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void processOrder() {
        status.processOrder(this);
    }

    public void shipOrder() {
        status.shipOrder(this);
    }

    public void deliverOrder() {
        status.deliverOrder(this);
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalAmount += product.getPrice() * quantity;
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalAmount -= product.getPrice();
    }

    public void updateDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
