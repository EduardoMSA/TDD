import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListAddTest {

    @Test
    public void addTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");
        assertEquals(3,list.size());

        list.add("Nayarit");
        assertEquals(4,list.size());
        assertEquals("Nayarit",list.get(3));
    }

    @Test
    public void addTest2(){
        ArrayList<Object> list = new ArrayList<Object>();
        assertEquals(0,list.size());

        list.add(null);
        assertEquals(1,list.size());
        assertEquals(null,list.get(0));

    }

    @Test
    public void addTest3(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3,list.size());

        list.add(4);
        assertEquals(4,list.size());
        assertEquals(4,(int)list.get(3));
    }
}
