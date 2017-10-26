public class Paint {


    private double pricePerLitre;
    private int litre;
    private int coverage;
    private double price;
    private String brandName;

    public Paint(String brandName,double price, int coverage, int litre) {
        this.brandName = brandName;
        this.price = price;
        this.coverage = coverage;
        this.litre = litre;

    }

    public MultiReturn totalPriceAndWaste(int roomSize){
        double numOfLitresUsed = roomSize/coverage;
        double numberOfTinUsed = numOfLitresUsed/litre;
        double totalPrice = Math.ceil(numberOfTinUsed)*price;

        double waste =  (Math.ceil(numberOfTinUsed)*litre) - numOfLitresUsed;
        return new MultiReturn(totalPrice,waste);
    }


    public double getPrice() {
        return price;
    }


    public int getCoverage() {
        return coverage;
    }

    public int getLitre() {
        return litre;
    }

    public String getBrandName() {
        return brandName;
    }
}
