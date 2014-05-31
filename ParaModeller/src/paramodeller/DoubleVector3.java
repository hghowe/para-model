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
public class DoubleVector3 {
    private double x;
    private double y;
    private double z;

    public DoubleVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static DoubleVector3 generateZero()
    {
        return new DoubleVector3(0,0,0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DoubleVector3 other = (DoubleVector3) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.z != other.z) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ')';
    }
    
    public double dotProduct(DoubleVector3 other)
    {
        return this.x*other.x+this.y*other.y+this.z*other.z;
    }
    
    public DoubleVector3 crossProduct(DoubleVector3 other)
    {
        return new DoubleVector3(this.y*other.z-this.z*other.y, 
                                 this.z*other.x-this.x*other.z,
                                 this.x*other.y-this.y*other.x);
    }
    
    public DoubleVector3 times(double n)
    {
        return new DoubleVector3(n*this.x,n*this.y,n*this.z);
    }
    
    public DoubleVector3 plus(DoubleVector3 other)
    {
        return new DoubleVector3(this.x+other.x,this.y+other.y,this.z+other.z);
    }
    
    public DoubleVector3 minus(DoubleVector3 other)
    {
        return new DoubleVector3(this.x-other.x,this.y-other.y,this.z-other.z);
    }
    
    public double normSquared()
    {
        return this.x*this.x + this.y*this.y + this.z*this.z;
    }
    
    public double norm()
    {
        return Math.sqrt(this.normSquared());
    }
}
    
