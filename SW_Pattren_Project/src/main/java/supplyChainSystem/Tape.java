package supplyChainSystem;

public class Tape extends PackageDecorator {

    private String tapeMaterial;

    public Tape(Package pack, String tapeMaterial) {
        super(pack);
        this.tapeMaterial = tapeMaterial;
    }

    public String getTapeMaterial() {
        return tapeMaterial;
    }

    public void setTapeMaterial(String tapeMaterial) {
        this.tapeMaterial = tapeMaterial;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return "Tape Material: " + tapeMaterial;
    }
}
