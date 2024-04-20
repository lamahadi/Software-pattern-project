package supplyChainSystem;

import java.util.Date;

public interface Shipment {
    int getShipmentID();
    Order getOrder();
    String getDestination();
    Date getShipmentDate();
    Date getArrivalDate();
    void updateDestination(String destination);
    void updateShipmentDate(Date shipmentDate);
    void updateArrivalDate(Date arrivalDate);
    String getTransportType();
}