package supplyChainSystem;

import java.util.Date;

public class Shipment {
    private int shipmentID;
    private Order order;
    private String destination;
    private Date shipmentDate;
    private Date arrivalDate;

    public Shipment(int shipmentID, Order order, String destination, Date shipmentDate, Date arrivalDate) {
        this.shipmentID = shipmentID;
        this.order = order;
        this.destination = destination;
        this.shipmentDate = shipmentDate;
        this.arrivalDate = arrivalDate;
    }

    public int getShipmentID() {
        return shipmentID;
    }

    public Order getOrder() {
        return order;
    }

    public String getDestination() {
        return destination;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void updateDestination(String newDestination) {
        this.destination = newDestination;
    }

    public void updateShipmentDate(Date newShipmentDate) {
        this.shipmentDate = newShipmentDate;
    }

    public void updateArrivalDate(Date newArrivalDate) {
        this.arrivalDate = newArrivalDate;
    }
}