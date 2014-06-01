/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paramodeller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author harlan.howe
 */
public class ParaModeller {

    private ArrayList<DoubleVector3> myPoints;
    private ArrayList<STLTriangle> myTriangles;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParaModeller app = new ParaModeller();
    }
    
    public ParaModeller()
    {
        myPoints = new ArrayList<DoubleVector3>();
        myTriangles = new ArrayList<STLTriangle>();
        myPoints.add(DoubleVector3.generateZero()); // bottom center point
        // bottom ring of points
        for (int i=0; i<40; i++)
        {
            double angle = Math.PI*i/20;
            myPoints.add(new DoubleVector3(12*Math.cos(angle),12*Math.sin(angle),0));
        }
        // top ring of points
        double phase = Math.PI*0.5/20;
        for (int i=0; i<40; i++)
        {
            double angle = Math.PI*i/20;
            myPoints.add(new DoubleVector3(12*Math.cos(angle+phase),12*Math.sin(angle+phase),10));
        }
        
        DoubleVector3 topPoint = DoubleVector3.generateZero();// top center point
        topPoint.setZ(10);
        myPoints.add(topPoint);
        
        
        // Now assemble the triangles....
        // bottom surface
        for (int i=1;i<40;i++)
        {
            myTriangles.add(new STLTriangle(myPoints.get(0),myPoints.get(i+1),myPoints.get(i)));
        }
        myTriangles.add(new STLTriangle(myPoints.get(0),myPoints.get(1),myPoints.get(40)));
        // sides
        for (int i=1;i<40;i++)
        {
            myTriangles.add(new STLTriangle(myPoints.get(i),myPoints.get(i+1),myPoints.get(i+40)));
            myTriangles.add(new STLTriangle(myPoints.get(i+1),myPoints.get(i+41),myPoints.get(i+40)));
        }
        myTriangles.add(new STLTriangle(myPoints.get(40),myPoints.get(1),myPoints.get(80)));
        myTriangles.add(new STLTriangle(myPoints.get(1),myPoints.get(41),myPoints.get(80)));
        // top surface
        for (int i=41; i<80; i++)
            myTriangles.add(new STLTriangle(myPoints.get(81),myPoints.get(i),myPoints.get(i+1)));
        myTriangles.add(new STLTriangle(myPoints.get(81),myPoints.get(80),myPoints.get(41)));
        
//        int i=0;
//        for (DoubleVector3 p:myPoints)
//        {
//            System.out.println(i+"\t"+p);
//            i++;
//        
//        }
        // print to file
        try
        {
            PrintWriter fileout = new PrintWriter(new FileWriter("CylinderTest.stl")); 
            fileout.println("solid cylinder");
            for (STLTriangle stlt: myTriangles)
                fileout.print(stlt);
            fileout.println("endsolid");
            fileout.close();
        }catch (IOException ioe)
        {
            System.out.println("File not found.");
        }
        
    }
}
