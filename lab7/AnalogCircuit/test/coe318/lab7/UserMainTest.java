/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import java.io.ByteArrayInputStream;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import java.io.InputStream;
import org.junit.*;

/**
 *
 * @author babye
 */
public class UserMainTest {
    UserMain tester;
    
    public UserMainTest() {
    }
    
    
    public static void setUpClass() {
    }
    
    
    
    public static void tearDownClass() {
    }
    
    
    public void setUp() {
        tester = new UserMain();
    }
    
   
    public void tearDown() {
        tester = null;
    }

    /**
     * Test of main method, of class UserMain.
     */
    @Test
    public void testMain() {
        String[] args = null;
        UserMain.main(args);
       
        String input = "r 2 3 5.0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

      //  assertEquals("", "");
}
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    

