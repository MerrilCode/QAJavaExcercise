public class Car extends Vehicle {

    public boolean convertible;
    public String carType;
    public int numOfDoors;

    public Car(boolean convertible, String carType,int maxSpeed, int numOfTyres, String typeOfVehicle, String model){
        super(maxSpeed,numOfTyres,typeOfVehicle,model);
        this.convertible = convertible;
        this.carType = carType;
    }


    public boolean getIsConvertible(){

        return convertible;
    }

    public String getCarType() {

        return carType;
    }

    public void setNumOfDoors(int doors){
        this.numOfDoors = doors;
    }
}
