package supplyChainSystem;

public class Wrap extends PackageDecorator {

    private String wrapMaterial;

    public Wrap(Package pack, String wrapMaterial) {
        super(pack);
        this.wrapMaterial = wrapMaterial;
    }

    public String getWrapMaterial() {
        return wrapMaterial;
    }

    public void setWrapMaterial(String wrapMaterial) {
        this.wrapMaterial = wrapMaterial;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return "Wrap Material: " + wrapMaterial;
    }
}
