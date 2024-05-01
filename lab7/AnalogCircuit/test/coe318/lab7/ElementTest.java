/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author babye
 */
public class ElementTest {
    
    public ElementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNode1 method, of class Element.
     */
    @Test
    public void testGetNode1() {
        System.out.println("getNode1-----");
        Element instance = new Element("r 2 1 8.0");
        String expResult = "2";
        String result = instance.getNode1();
        assertEquals(expResult, result);
        System.out.println("r 2 1 8.0");
        System.out.println(result);
    }

    /**
     * Test of getNode2 method, of class Element.
     */
    @Test
    public void testGetNode2() {
        System.out.println("getNode2-----");
        Element instance = new Element("v 1 3 4.0");
        String expResult = "3";
        String result = instance.getNode2();
        assertEquals(expResult, result);
        System.out.println("v 1 3 4.0");
        System.out.println(result);
    }

    /**
     * Test of getValue method, of class Element.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue-----");
        Element instance = new Element("r 2 3 5.0");
        double expResult = 5.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0);
        System.out.println("r 2 3 5.0");
        System.out.println(result);
    }

    /**
     * Test of getIsVolt method, of class Element.
     */
    @Test
    public void testGetIsVolt() {
        System.out.println("getIsVolt-----");
        Element instance = new Element("r 2 1 10.0");
        boolean expResult = false;
        boolean result = instance.getIsVolt();
        assertEquals(expResult, result);
        System.out.println("r 2 1 10.0");
        System.out.println(result);
    }

    /**
     * Test of getId method, of class Element.
     */
    @Test
    public void testGetId() {
        System.out.println("getId-----");
        Element instance = new Element("v 0 1 6.0");
        int expResult = 2;
        int result = instance.getId();
        assertEquals(expResult, result);
        System.out.println("v 0 1 6.0");
        System.out.println(result);
    }
    
}
