package vscode;
import java.util.Scanner;

public class Circle {
    public static double Circumference(double r){
        double ccf = 2 * Math.PI * r;
        return ccf;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of radius r: ");
        double r = s.nextDouble();
        System.out.println("the circumference of the circle is:"+Circumference(r));
        s.close();
    }
}
