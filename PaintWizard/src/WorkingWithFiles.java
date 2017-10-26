

import java.io.*;
import java.util.ArrayList;

public class WorkingWithFiles {

    public static void main(String[] args){
        ArrayList<WorkingWithFiles> lisOfPeople = new ArrayList<>();
        lisOfPeople.add(new WorkingWithFiles("John","Developer",25));
        lisOfPeople.add(new WorkingWithFiles("Mary","Fashion designer",30));
        lisOfPeople.add(new WorkingWithFiles("Rosy","Nurse",32));
        lisOfPeople.add(new WorkingWithFiles("Trevor","Personal trainer",28));
        lisOfPeople.add(new WorkingWithFiles("Kevin","Actor",21));

       BufferedWriter writer = null;
       try{

           File file = new File("outPut.txt");

           if (!file.exists()) {
               file.createNewFile();
           }
           else
           {
               file.delete();
               file.createNewFile();
           }

           writer = new BufferedWriter(new FileWriter(file));
           for(WorkingWithFiles w: lisOfPeople){
               writer.write("Name: " + " " + w.getName());
               writer.newLine();
               writer.write("Occupation: " + " " + w.getOccupation());
               writer.newLine();
               writer.write("Age: " + " " + w.getAge());
           }


       } catch (IOException e){
           e.printStackTrace();
       }  finally {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        /**BufferedWriter writer = null;
        try {


            writer = new BufferedWriter(new FileWriter("outPut.txt"));
            for(WorkingWithFiles w: lisOfPeople){
                try {
                    writer.write("Name: " + " " + w.getName());
                    writer.newLine();
                    writer.write("Occupation: " + " " + w.getOccupation());
                    writer.newLine();
                    writer.write("Age: " + " " + w.getAge());

                } catch (IOException e){
                    e.printStackTrace();
                }

            }
            try{
                writer.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e){
            System.out.println("Something wrong");
            System.exit(1);
        }
**/






    }

    private String name;
    private String occupation;
    private int age;

    public WorkingWithFiles(String name, String occupation,int age){
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }
}
