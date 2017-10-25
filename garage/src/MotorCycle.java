public class MotorCycle extends Vehicle {
    private String manufacturer;
    private int yearOfMake;
    private int engineCC;



    public MotorCycle(String manufacturer, int yearOfMake, int engineCC, int maxSpeed, int numOfTyres, String typeOfVehicle, String model){
        super(maxSpeed,numOfTyres, typeOfVehicle,model);
        this.manufacturer = manufacturer;
        this.yearOfMake = yearOfMake;
        this.engineCC = engineCC;
    }


    public String getManufacturer() {

        return manufacturer;
    }
    public int getYearOfMake(){

        return yearOfMake;
    }

    public int getEngineCC() {

        return engineCC;
    }
}
