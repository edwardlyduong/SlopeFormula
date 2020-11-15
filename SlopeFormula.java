import java.io.*;
import java.util.Scanner;

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

    Scanner input = new Scanner(System.in);

    String conformation;
    double x1;
    double y1;
    double x2;
    double y2;

    do{

    System.out.println("Enter your x1");
    x1 = input.nextDouble();
    
    System.out.println("Enter your y1");
    y1 = input.nextDouble();

    System.out.println("Enter your x2");
    x2 = input.nextDouble();

    System.out.println("Enter your y2");
    y2 = input.nextDouble();

    System.out.println("Are these your two coordinates" + "(" + x1 + " , " + y1 + ")" + " " + "(" + x2 + " , " + y2 + ")");
    System.out.println("Say 'yes' if they are right say 'no' if they aren't.");
    conformation = input.next();
    }
    
    while(conformation.equals("no"));
    

    System.out.println("Slope is " + slope(x1, y1, x2, y2));
    System.out.println("Slope intercept formula is " + "y = " + slope(x1, y1, x2, y2) + "x " + "+ " + yintercept(x1, y1, x2, y2));
    }
}
