import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListCheckTest {

    @Test
    public void checkTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertTrue(list.contains("Jalisco"));
    }

    @Test
    public void checkTest2(){
        ArrayList<String> list = new ArrayList<String>();

        assertFalse(list.contains("Jalisco"));

    }

    @Test
    public void checkTest3(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);
        list.add(null);
        list.add(null);

        assertTrue(list.contains(null));
    }
}
