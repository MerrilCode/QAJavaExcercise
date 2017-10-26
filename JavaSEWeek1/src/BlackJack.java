public class BlackJack {


    public static int closestTo21(int inputIntOne, int inputIntTwo) {

        if (inputIntOne < 22 && inputIntTwo < 22) {
            if (inputIntOne > inputIntTwo) {
                return inputIntOne;
            } else {
                return inputIntTwo;
            }
        } else {
            if(inputIntOne < 22){
                return inputIntOne;
            } else if(inputIntTwo < 22){
                return inputIntOne;
            } else {
                return 0;
            }
        }
    }



}

