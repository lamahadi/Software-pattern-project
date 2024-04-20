public class Singleton {
    public static void main(String[] args) {
        // create instance of Warehouse
    	globalWarehouse warehouse1 = globalWarehouse.getInstance();

        warehouse1.setglobalWarehouseID(2002);
        warehouse1.setName("Jeddah Warehouse");
        warehouse1.setAddress("Jeddah");
        warehouse1.setCapacity(10000);

        // create another instance of Warehouse
        globalWarehouse warehouse2 = globalWarehouse.getInstance();

        // Check if the two instances are the same
        if (warehouse1.equals(warehouse2)) {
            System.out.println("There is only one instance of the Warehouse class");
        } else {
            System.out.println("There is more than one instance");
        }
    }
}