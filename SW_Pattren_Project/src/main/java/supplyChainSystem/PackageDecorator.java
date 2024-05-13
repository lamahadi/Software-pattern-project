package supplyChainSystem;

public abstract class PackageDecorator implements Package {

    protected Package pack;

    public PackageDecorator(Package pack) {
        this.pack = pack;
    }

    @Override
    public String getName() {
        return pack.getName();
    }

    @Override
    public double getPrice() {
        return pack.getPrice();
    }

    @Override
    public String getDescription() {
        return pack.getDescription();
    }

}