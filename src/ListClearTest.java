import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListClearTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void clearTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");
        assertEquals(3,list.size());

        list.clear();
        assertEquals(0,list.size());
        fail(list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void clearTest2(){
        ArrayList<String> list = new ArrayList<String>();
        assertEquals(0,list.size());

        list.clear();
        assertEquals(0,list.size());
        fail(list.get(0));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void clearTest3(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);
        list.add(null);
        list.add(null);

        assertEquals(3,list.size());

        list.clear();
        assertEquals(0,list.size());
        list.get(0);
        fail("IoB Expected");

    }
}
