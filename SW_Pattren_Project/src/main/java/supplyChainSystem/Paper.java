package supplyChainSystem;


public class Paper extends PackageDecorator {

    private String paperType;

    public Paper(Package pack, String paperType) {
        super(pack);
        this.paperType = paperType;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return "Paper Type: " + paperType;
    }
}
