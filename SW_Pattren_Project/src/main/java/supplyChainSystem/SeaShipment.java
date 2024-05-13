package supplyChainSystem;

import java.util.Date;

public class SeaShipment implements Shipment {
    private int shipmentID;
    private Order order;
    private String destination;
    private Date shipmentDate;
    private Date arrivalDate;

    public SeaShipment(int shipmentID, Order order, String destination, Date shipmentDate, Date arrivalDate) {
        this.shipmentID = shipmentID;
        this.order = order;
        this.destination = destination;
        this.shipmentDate = shipmentDate;
        this.arrivalDate = arrivalDate;
    }

    @Override
    public int getShipmentID() {
        return shipmentID;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public Date getShipmentDate() {
        return shipmentDate;
    }

    @Override
    public Date getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public void updateDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void updateShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    @Override
    public void updateArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

}