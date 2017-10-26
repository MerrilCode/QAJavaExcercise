import java.util.ArrayList;

public class Wizard {

    public static void main(String[] args){
        Paint paintCheap = new Paint("Cheap",19.99,10,20);
        Paint paintAverage = new Paint("Average",17.99,11,15);
        Paint paintDulux = new Paint("Dulux",25,20,10);
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(paintCheap);
        paintList.add(paintAverage);
        paintList.add(paintDulux);

        Wizard wizard = new Wizard();

        ReturnThreeMixed returnThree = wizard.cheapestPaint(paintList, 500);
        System.out.println("The cheapest deal found for the room size entered is "+ "Price: "+ returnThree.getFirst()+ " Waste: "
                + returnThree.getSecond() + " Brand: " + returnThree.getThird());


        }

        public ReturnThreeMixed cheapestPaint(ArrayList<Paint> paints, int roomSize){
        double minPrice =  999999999;
        double minWaste=999999999;
        String bestDealPaint="";
        for(Paint p: paints ){
            MultiReturn multiReturn = p.totalPriceAndWaste(roomSize);
            if((multiReturn.getFirst()<minPrice) && (multiReturn.getSecond()<minWaste)){
                minPrice = multiReturn.getFirst();
                minWaste = multiReturn.getSecond();
                bestDealPaint= p.getBrandName();
            }

        } return new ReturnThreeMixed(minPrice,minWaste,bestDealPaint);

        }








}
