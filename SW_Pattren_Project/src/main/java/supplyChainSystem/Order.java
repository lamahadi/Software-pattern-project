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

    public Order(int orderId, Customer customer, String deliveryAddress) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
        this.orderDate = new Date();
        this.deliveryAddress = deliveryAddress;
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