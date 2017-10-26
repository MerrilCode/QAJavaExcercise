public class UniqueSum {

    private int sum;

        public int uniqueSumMethod(int argumentOne, int argumentTwo, int argumentThree){

            if((argumentOne == argumentTwo) || (argumentTwo == argumentThree) || (argumentOne == argumentThree)){
                return 0;
            } else{
                return argumentOne+argumentTwo+argumentThree;
            }

        }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}


