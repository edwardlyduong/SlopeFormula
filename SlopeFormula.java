import java.io.*;

public class SlopeFormula {

    static double slope(double x1, double y1, double x2, double y2)
    {
        return (y2 - y1) / (x2 - x1);
    }
    static double yintercept(double x1, double y1, double x2, double y2)
    {
        return y1 - (slope(x1, y1, x2, y2) * x1);
    }
    public static void main (String [] args){
    double x1 = 1;
    double y1 = 1;
    double x2 = 4; 
    double y2 = 4;
    System.out.println("Slope is " + slope(x1, y1, x2, y2));
    System.out.println("Slope intercept formula is " + "y = " + slope(x1, y1, x2, y2) + "x " + "+ " + yintercept(x1, y1, x2, y2));
    }
}
