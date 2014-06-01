/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paramodeller;

import java.util.ArrayList;

/**
 *
 * @author harlan.howe
 */
public class ParaModeller {

    private ArrayList<DoubleVector3> myPoints;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParaModeller app = new ParaModeller();
    }
    
    public ParaModeller()
    {
        myPoints = new ArrayList<DoubleVector3>();
        myPoints.add(DoubleVector3.generateZero());
        for (int i=0; i<40; i++)
        {
            double angle = Math.PI*i/20;
            myPoints.add(new DoubleVector3(12*Math.cos(angle),12*Math.sin(angle),0));
        }
        double phase = Math.PI*0.5/20;
        for (int i=0; i<40; i++)
        {
            double angle = Math.PI*i/20;
            myPoints.add(new DoubleVector3(12*Math.cos(angle+phase),12*Math.sin(angle+phase),10));
        }
        DoubleVector3 topPoint = DoubleVector3.generateZero();
        topPoint.setZ(10);
        myPoints.add(topPoint);
        
        int i=0;
        for (DoubleVector3 p:myPoints)
        {
            System.out.println(i+"\t"+p);
            i++;
        
        }
    }
}
