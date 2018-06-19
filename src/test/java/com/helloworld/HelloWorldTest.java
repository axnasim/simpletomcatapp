package com.helloworld;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for HelloWorld App.
 * */

public class HelloWorldTest
{
    @Test
    public void testUpperCase() 
    {
        String upperCase = UpperCase.upperCase("Hello World!");
        try {
        	assertEquals("HELLO WORLD!", upperCase);;
        } catch (AssertionError e) {
            fail("\"message\" is not \"HELLO WORLD!\"");
        }
    }    
}

