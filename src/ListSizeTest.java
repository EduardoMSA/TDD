import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListSizeTest {

    @Test
    public void sizeTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
    }

    @Test
    public void sizeTest2(){
        ArrayList<String> list = new ArrayList<String>();

        assertEquals(0,list.size());
    }

    @Test
    public void sizeTest3(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(null);
        list.add(null);
        list.add(null);

        assertEquals(3,list.size());
    }

}
