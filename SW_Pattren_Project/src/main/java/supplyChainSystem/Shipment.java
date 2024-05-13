package supplyChainSystem;

import java.util.Date;

//Shipment interface
public interface Shipment {

    public int getShipmentID();
    public Order getOrder();
    public String getDestination();
    public Date getShipmentDate();
    public Date getArrivalDate();
    public void updateDestination(String newDestination);
    public void updateShipmentDate(Date newShipmentDate);
    public void updateArrivalDate(Date newArrivalDate);
    
}