package com.exoskeleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test HelloWorld.
 * @author https://github.com/alexdforeman
 *
 */
public class HelloWorldTest {

    /**
     * Test HelloWorld.
     */
    @Test
    public final void testHelloWorld() {
        assertEquals("Hello World!", HelloWorld.getGreeting());
    }
}
