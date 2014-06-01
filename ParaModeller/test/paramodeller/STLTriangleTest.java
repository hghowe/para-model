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
public class STLTriangleTest extends TestCase {
    
    public STLTriangleTest(String testName) {
        super(testName);
    }
    public void testConstructor()
    {   System.out.println("STL Triangle constructor");
        DoubleVector3 p1 = new DoubleVector3(1.0,0,0);
        DoubleVector3 p2 = new DoubleVector3(1.0,1.0,0);
        DoubleVector3 p3= new DoubleVector3(0,0,0);
        DoubleVector3 expected = new DoubleVector3(0,0,1);
        assertEquals(new STLTriangle(p1,p2,p3).getNormal(),expected);
    }

    
    
}
