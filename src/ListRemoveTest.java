import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListRemoveTest {

    @Test
    public void removeTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
        assertTrue(list.contains("Jalisco"));
        list.remove(0);
        assertFalse(list.contains("Jalisco"));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeTest2(){
        ArrayList<String> list = new ArrayList<String>();

        assertEquals(0,list.size());
        fail(list.remove(0));

    }

    @Test
    public void removeTest3(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);

        assertEquals(2,list.size());
        list.remove((Integer) 1);
        assertFalse(list.contains(1));
    }
}
