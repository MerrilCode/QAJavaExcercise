public class MethodClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String helloWorld = "Hello World!";
        System.out.println(helloWorld);

        stringMethod("Hello");

        System.out.println(returnStringMethod());

        int [] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};


        System.out.println(sumMethod(arrayOfInts[0],arrayOfInts[3],false));

     for (int i = 0; i  < 10; i++){
        System.out.println( sumMethod(i,6,true));

     }
     for(int i: arrayOfInts){
         System.out.println(i);
     }
     for( int i = 0; i< 10; i++){
         arrayOfInts[i]= i;
         System.out.println(arrayOfInts[i]);

     }
     for(int i: arrayOfInts){
         System.out.print(i*10 + ", ");
     }

    }
    public static void stringMethod(String s) {
        System.out.println(s);
    }
    public static String returnStringMethod(){
        String s = "Hello World";
        return s;

    }
    public static int sumMethod(int inputOne, int inputTwo, boolean inputBoolean) {
        if (inputOne == 0) {
            return inputTwo;
        } else if (inputTwo == 0) {
            return inputOne;
        } else if (inputBoolean == true) {
            int sum = inputOne + inputTwo;
            return sum;
        } else {
            int mult = inputOne * inputTwo;

            return mult;
        }


    }

}

