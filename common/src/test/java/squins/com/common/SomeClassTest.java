package squins.com.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeClassTest {

    @Test
    public void shouldSumOnePlusOne() {
        assertEquals(2, new SomeClass().sum(1, 1));
    }

    @Test
    public void testEchoR() throws Exception {
        new SomeClass().referenceDrawableFromR();

    }
}