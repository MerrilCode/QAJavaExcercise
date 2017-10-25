import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

        Garage garageObj = new Garage();


        garageObj.addVehicle(new MotorCycle("Honda",1990, 200, 100,2, "Bike", "TVS"));
        garageObj.addVehicle(new Car(true, "Sport", 140, 4, "Car","Q7"));
        garageObj.removeVehicleById("TVS");
        garageObj.addModelPrice("TVS",100);
        garageObj.addTypePrice("Bike",200);
        garageObj.addModelPrice("Q7",500);
        garageObj.addTypePrice("Car", 400);
        System.out.println(garageObj.fixVehicle("Q7"));




        ArrayList<Vehicle> garage = garageObj.getGarage();
        garageObj.emptyGarage(garage);

        for (Vehicle v : garage) {
            System.out.println(v.getModel());
        }

        //garageObj.removeVehicle("B","Bike", m);
       // garageObj.removeVehicle("B","Bike",m);


    }
}


