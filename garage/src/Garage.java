import javafx.util.Pair;

import java.security.PrivateKey;
import java.util.ArrayList;


public class Garage {

    private ArrayList<Vehicle> garage = new ArrayList<>();
    private ArrayList<Pair> modelPrice = new ArrayList<>();
    private ArrayList<Pair> typePrice = new ArrayList<>();


    public ArrayList<Pair> getTypePrice() {
        return typePrice;
    }

    public ArrayList<Pair> getModelPrice() {
        return modelPrice;
    }

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public void addModelPrice(String model, int price){
        modelPrice.add(new Pair<>(model,price));
    }
    public void  addTypePrice(String type, int price){
        typePrice.add(new Pair<> (type,price));
    }

    public void addVehicle(Vehicle add) {

        garage.add(add);
    }

    public void removeVehicleById(String model){
        for(int i =0; i< garage.size(); i++){
            if(garage.get(i).getModel() == model ){
                garage.remove(i);
            }
        }
    }

    public  void removeVehicleByType(String typeOfVehicle) {
        for (int i = 0; i < garage.size(); i++) {
            if (garage.get(i).getTypeOfVehicle() == typeOfVehicle) {
                garage.remove(i);
                break;
            }
        }
    }

    public int fixVehicle(String model){
        int sum = 0;
        for (int i = 0; i < garage.size(); i++) {
                if (garage.get(i).getModel() == model) {
                    for(int j =0; j<modelPrice.size(); j++){
                        if(modelPrice.get(j).getKey() == model ){
                            sum += (int) modelPrice.get(j).getValue();
                        }
                    }
                }
        } return sum;

    }



    public double billOfVehicle() {
        String typeOfVehicle;
        double sum = 0;
        for (Vehicle v : garage) {
            typeOfVehicle = v.getTypeOfVehicle();
            if (typeOfVehicle == "Bike") {
                sum += 4;
                return sum;
            } else if (typeOfVehicle == "Car") {
                sum += 10;
                return sum;
            }

        }
        return 0;
    }

    public void emptyGarage(ArrayList<Vehicle> garage){
        garage.clear();

    }



    }

