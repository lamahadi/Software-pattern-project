package supplyChainSystem;

import java.util.Date;

public class ShipmentFactory {
	
	public Shipment createShipment(String type, int shipmentID, Order order, String destination, Date shipmentDate, Date arrivalDate) {
		   
		   if(type.equalsIgnoreCase("Air")) {
			   return new AirShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
		   else if (type.equalsIgnoreCase("Sea")) {
			   return new SeaShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
           else if (type.equalsIgnoreCase("Land")) {
			   return new LandShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
           else {
               System.out.println("Invalid Shipment Type!!");

           }
        	   
		   return null;
	}
}