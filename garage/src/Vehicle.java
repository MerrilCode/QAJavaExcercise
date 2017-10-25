public abstract  class Vehicle {
    private int maxSpeed;
    private int numOfTyres;
    private String typeOfVehicle;
    private String model;


    public Vehicle(int maxSpeed, int numOfTyres, String typeOfVehicle, String model){
        this.maxSpeed = maxSpeed;
        this.numOfTyres = numOfTyres;
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;

    }

    public int getNumOfTyres() {

        return numOfTyres;
    }

    public String getTypeOfVehicle() {

        return typeOfVehicle;
    }

    public String getModel() {

        return model;
    }




}

