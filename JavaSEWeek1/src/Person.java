import java.util.ArrayList;

public class Person {

    private int age;
    private String name;
    private String jobTitle;

    public Person(int age, String name, String jobTitle){
        this.age = age;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getJobTitle(){
        return this.jobTitle;
    }

    public String toString(int age, String name, String jobTitle){
        return "Age: " + age + "Name: " + name + "Job Title: " + jobTitle;
    }

    public   String searchPersonObject(ArrayList<Person> people, String name){
        for (Person p: people){
            if(p.getName() == name){
                return name;
            }
        }
        return "Name not found";
    }


}

