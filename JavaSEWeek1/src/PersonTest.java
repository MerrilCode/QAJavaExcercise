import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonTest{
    ArrayList<Person> people = new ArrayList<Person>();
    Person p1;
    Person p2;
    Person p3;

    @Before
    public void setUp()
    {
        p1 = new Person(25,"Randy","Driver");
        p2 = new Person(25,"Dandy","Driver");
        p3 = new Person(25,"Mandy","Driver");
        people.add(p1);
        people.add(p2);
        people.add(p3);

    }
    @Test
    public void personTest()
    {
        assertEquals("Randy", p1.getName());
        assertEquals(25, p2.getAge());
        assertEquals("Driver", p3.getJobTitle());
    }


    @Test

    public void searchPersonTest(){
        assertEquals("Randy",p1.searchPersonObject(people,"Randy"));
        assertEquals("Name not found", p1.searchPersonObject(people,"Merril"));

    }

}