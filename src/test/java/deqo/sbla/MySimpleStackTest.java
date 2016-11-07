package deqo.sbla;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    @Test
    public void testIsEmpty() throws Exception {
        SimpleStack test = new MySimpleStack();
        assertEquals(test.isEmpty(),false);
    }

    @Test
    public void testGetSize() throws Exception {
        SimpleStack test = new MySimpleStack();
        assertEquals(test.getSize(),0);
    }

    @Test
    public void testPush() throws Exception {
        SimpleStack test = new MySimpleStack();
        assertEquals("blabla","blabla");
    }

    @Test
    public void testPeek() throws Exception {
        SimpleStack test = new MySimpleStack();
        assertEquals(test.peek(),null);
    }

    @Test
    public void testPop() throws Exception {
        SimpleStack test = new MySimpleStack();
        assertEquals(test.pop(),null);
    }
}