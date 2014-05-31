/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paramodeller;

import junit.framework.TestCase;

/**
 *
 * @author harlan.howe
 */
public class DoubleVector3Test extends TestCase {
    
    public DoubleVector3Test(String testName) {
        super(testName);
    }

    /**
     * Test of generateZero method, of class DoubleVector3.
     */
    public void testGenerateZero() {
        System.out.println("generateZero");
        DoubleVector3 expResult = new DoubleVector3(0,0,0);
        DoubleVector3 result = DoubleVector3.generateZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getX method, of class DoubleVector3.
     */
    public void testGetX() {
        System.out.println("getX");
        DoubleVector3 instance = new DoubleVector3(15,2,9);
        assertEquals(instance.getX(), 15, 0.0);
        assertEquals(DoubleVector3.generateZero().getX(),0,0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setX method, of class DoubleVector3.
     */
    public void testSetX() {
        System.out.println("setX");
        
        DoubleVector3 instance = new DoubleVector3(12,13,5);
        instance.setX(4);
        assertTrue(instance.getX()==4);
        assertFalse(instance.getX()==12);
        assertEquals(instance, new DoubleVector3(4,13,5));
    }

    /**
     * Test of getY method, of class DoubleVector3.
     */
    public void testGetY() {
        System.out.println("getY");
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setY method, of class DoubleVector3.
     */
    public void testSetY() {
        System.out.println("setY");
        
    }

    /**
     * Test of getZ method, of class DoubleVector3.
     */
    public void testGetZ() {
        System.out.println("getZ");
        
    }

    /**
     * Test of setZ method, of class DoubleVector3.
     */
    public void testSetZ() {
        System.out.println("setZ");
       
    }

//    /**
//     * Test of hashCode method, of class DoubleVector3.
//     */
//    public void testHashCode() {
//        System.out.println("hashCode");
//        DoubleVector3 instance = null;
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of equals method, of class DoubleVector3.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        DoubleVector3 instance = new DoubleVector3(1,2,3);
        DoubleVector3 instance2 = new DoubleVector3(2,4,6);
        DoubleVector3 instance3 = new DoubleVector3(1,2,3);
        assertFalse(instance.equals(obj));
        assertFalse(instance.equals(instance2));
        assertTrue(instance.equals(instance3));
        assertFalse(instance == instance3);
       
    }

//    /**
//     * Test of toString method, of class DoubleVector3.
//     */
//    public void testToString() {
//        System.out.println("toString");
//        DoubleVector3 instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of dotProduct method, of class DoubleVector3.
     */
    public void testDotProduct() {
        System.out.println("dotProduct");
        DoubleVector3 other = new DoubleVector3(3,4,5);
        DoubleVector3 instance = new DoubleVector3(-2,5,7);
        DoubleVector3 instance2 = new DoubleVector3(0,5,-1);
        double expResult = 49;
        double result = instance.dotProduct(other);
        assertEquals(expResult, result, 0.0);
        assertEquals(instance.dotProduct(instance2),18,0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of crossProduct method, of class DoubleVector3.
     */
    public void testCrossProduct() {
        System.out.println("crossProduct");
        DoubleVector3 other = new DoubleVector3(4,9,2);
        DoubleVector3 instance = new DoubleVector3(3,-3,1);
        DoubleVector3 expResult = new DoubleVector3(-15,-2,39);
        DoubleVector3 alternate = new DoubleVector3(-12,12,-4);
        assertEquals(instance.crossProduct(other),expResult);
        assertEquals(instance.crossProduct(alternate),DoubleVector3.generateZero());
    }

    /**
     * Test of times method, of class DoubleVector3.
     */
    public void testTimes() {
        System.out.println("times");
        double n = 0.0;
        DoubleVector3 instance = new DoubleVector3(1,2,3);
        DoubleVector3 times2 = new DoubleVector3(2,4,6);
        DoubleVector3 timesNegHalf = new DoubleVector3(-0.5,-1.0,-1.5);
        DoubleVector3 bad = new DoubleVector3( 3,2,1);
        assertTrue(instance.times(2).equals(times2));
        assertTrue(instance.times(-0.5).equals(timesNegHalf));
        assertFalse(instance.times(3).equals(bad));
        assertTrue(instance.times(1.0).equals(instance));
        assertTrue(instance.times(0.0).equals(DoubleVector3.generateZero()));
    }

    /**
     * Test of plus method, of class DoubleVector3.
     */
//    public void testPlus() {
//        System.out.println("plus");
//        DoubleVector3 other = null;
//        DoubleVector3 instance = null;
//        DoubleVector3 expResult = null;
//        DoubleVector3 result = instance.plus(other);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of minus method, of class DoubleVector3.
     */
//    public void testMinus() {
//        System.out.println("minus");
//        DoubleVector3 other = null;
//        DoubleVector3 instance = null;
//        DoubleVector3 expResult = null;
//        DoubleVector3 result = instance.minus(other);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
