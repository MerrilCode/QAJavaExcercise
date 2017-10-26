import org.junit.Test;

import static org.junit.Assert.*;

public class IsTooHotTest {

    @Test
    public void isTooHotTest(){
        IsTooHot isTooHot = new IsTooHot();
        assertEquals(true,isTooHot.isTooHotMethod(60,false));
        assertEquals(true,isTooHot.isTooHotMethod(90,false));
        assertEquals(true,isTooHot.isTooHotMethod(70,false));
        assertEquals(true,isTooHot.isTooHotMethod(60,true));
        assertEquals(true,isTooHot.isTooHotMethod(90,true));
        assertEquals(true,isTooHot.isTooHotMethod(70,true));
        assertEquals(true,isTooHot.isTooHotMethod(100,true));
        assertEquals(false,isTooHot.isTooHotMethod(110,true));
    }


}