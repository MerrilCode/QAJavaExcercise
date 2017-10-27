import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RoomTest {

    Room r = new Room();

    @Test

    public void whichDoorTest(){
        assertEquals(1, r.whichDoor(1));
        assertEquals(2, r.whichDoor(2));
        assertEquals(3, r.whichDoor(3));

    }

}