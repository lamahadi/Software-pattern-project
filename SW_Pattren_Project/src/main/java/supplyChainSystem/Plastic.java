package supplyChainSystem;


public class Plastic extends PackageDecorator {

    private String plasticType;

    public Plastic(Package pack, String plasticType) {
        super(pack);
        this.plasticType = plasticType;
    }

    public String getPlasticType() {
        return plasticType;
    }

    public void setPlasticType(String plasticType) {
        this.plasticType = plasticType;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return "Plastic Type: " + plasticType;
    }
}
