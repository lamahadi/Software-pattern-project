package supplyChainSystem;


import java.util.Date;

public class shipmentFactory {
	
	public Shipment createShipment(String type, int shipmentID, Order order, String destination, Date shipmentDate, Date arrivalDate) {
		   
		   if(type.equalsIgnoreCase("Air")) {
			   return new airShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
		   else if (type.equalsIgnoreCase("Sea")) {
			   return new seaShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
           else if (type.equalsIgnoreCase("Land")) {
			   return new landShipment(shipmentID, order, destination, shipmentDate, arrivalDate);
		   }
           else {
               System.out.println("Invalid Shipment Type!!");

           }
        	   
		   return null;
	}
}
