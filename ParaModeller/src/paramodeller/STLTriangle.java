/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paramodeller;

/**
 *
 * @author harlan.howe
 */
public class STLTriangle {
    private final DoubleVector3[] verticies;
    private final DoubleVector3 normal;
    
    public STLTriangle(DoubleVector3 p1, DoubleVector3 p2, DoubleVector3 p3)
    {
        DoubleVector3[] temp = {p1,p2,p3};
        verticies = temp;
        normal = (p2.minus(p1)).crossProduct(p3.minus(p2)).toUnit();
    }
    @Override
    public String toString()
    {
       String output = "  facet normal     "+normal.getX()+"      "+normal.getY()+"      "+normal.getZ()+"\n";
       output+="     outer loop\n";
       for (DoubleVector3 dv: verticies)
           output+="      vertex      "+dv.getX()+"      "+dv.getY()+"      "+dv.getZ()+"\n";
       output+="     endloop\n  endfacet\n";
       return output;
        
    }      

    public DoubleVector3 getNormal() {
        return normal;
    }
          
}
