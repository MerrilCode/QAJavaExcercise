import org.junit.Test;

import static org.junit.Assert.*;


public class UniqueSumTest {

    @Test
    public void ifTest(){
        UniqueSum ifTest = new UniqueSum();
        assertEquals(0,ifTest.uniqueSumMethod(1,1,3));
        assertEquals(6,ifTest.uniqueSumMethod(1,2,3));
        assertEquals(0,ifTest.uniqueSumMethod(1,1,1));
    }



}