package deqo.sbla;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetName() throws Exception {
        Item test = new Item();
        test.setName("TEST");
        assertEquals(test.getName(), "TEST");
    }

    @Test
    public void testSetName() throws Exception {
        Item test = new Item();
        test.setName("TEST");
        assertEquals(test.getName(),"TEST");
    }
}