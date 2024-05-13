package supplyChainSystem;

public class StockObserver extends WarehouseObserver {

    public StockObserver(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.warehouse.addObserver(this);
    }
    public void update() {
        System.out.println("Stock is" + warehouse.getStock());
    }
}