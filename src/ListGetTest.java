import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListGetTest {

    @Test
    public void getTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
        assertEquals("Jalisco",list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getTest2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
        fail(list.get(3));

    }

    @Test
    public void getTest3(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);
        list.add(null);
        list.add(null);

        assertEquals(3,list.size());
        assertEquals(null,list.get(0));

    }
}
