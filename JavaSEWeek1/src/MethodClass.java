import java.util.ArrayList;

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
     BlackJack b = new BlackJack();
        System.out.println(b.closestTo21(23, 22));

        IsTooHot hot = new IsTooHot();
        UniqueSum uniqueSum = new UniqueSum();
        System.out.println(uniqueSum.uniqueSumMethod(2,2,2));
        System.out.println(hot.isTooHotMethod(110,true));

        Person pOne = new Person(27,"Merril", "Trainee");
        Person pTwo = new Person (23,"Sachin","Trainee");
        Person pThree = new Person(22,"Martyn", "Trainee");

        ArrayList<Person> personObjects = new ArrayList<Person>();
        personObjects.add(pOne);
        personObjects.add(pTwo);
        personObjects.add(pThree);

        for(Person i: personObjects){
            System.out.println(i.getName());

        }

        System.out.println(pOne.searchPersonObject(personObjects,"Merril"));





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

