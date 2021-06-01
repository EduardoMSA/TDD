import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ListSearchTest {

    @Test
    public void searchTest1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
        assertEquals(0,list.indexOf("Jalisco"));
    }

    @Test
    public void searchTest2(){
        ArrayList<String> list = new ArrayList<String>();

        assertEquals(0,list.size());
        assertEquals(-1,list.indexOf("Jalisco"));

    }

    @Test
    public void searchTest3(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jalisco");
        list.add("Michoacán");
        list.add("Colima");

        assertEquals(3,list.size());
        assertEquals(-1,list.indexOf(1));

    }

}
