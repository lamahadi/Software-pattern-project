package supplyChainSystem;


public class Box extends PackageDecorator {

    private String boxSize;
    private String boxMaterial;

    public Box(Package pack, String boxSize, String boxMaterial) {
        super(pack);
        this.boxSize = boxSize;
        this.boxMaterial = boxMaterial;
    }

    public String getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(String boxSize) {
        this.boxSize = boxSize;
    }

    public String getBoxMaterial() {
        return boxMaterial;
    }

    public void setBoxMaterial(String boxMaterial) {
        this.boxMaterial = boxMaterial;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return "Boxed in a " + boxSize + " " + boxMaterial + " box";
    }

}
