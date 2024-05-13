package supplyChainSystem;
public class CapacityObserver extends WarehouseObserver {
    
    public CapacityObserver(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.warehouse.addObserver(this);
    }
    public void update() {
        System.out.println("Capacity is" + warehouse.getCapacity());
    }
}