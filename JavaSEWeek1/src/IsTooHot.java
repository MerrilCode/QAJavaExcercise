public class IsTooHot {

    public boolean isTooHotMethod(int argumentTemperature, boolean argumentIsSummer){
        if((argumentTemperature >= 60) && (argumentTemperature <= 90) && (argumentIsSummer == false)){
            return true;

        } else if( (argumentTemperature >= 60) && (argumentTemperature <= 100) && argumentIsSummer == true){
            return true;
        } else{
            return false;
        }
    }
}
