import java.io.*;

public class SlopeFormula {

    static double slope(double x1, double y1, double x2, double y2)
    {
        return (y2 - y1) / (x2 - x1);
    }
    public static void main (String [] args){
    double x1 = 67;
    double y1 = 27.3;
    double x2 = 426; 
    double y2 = 92;
    System.out.println("Slope is " + slope(x1, y1, x2, y2));





    }
        









}
