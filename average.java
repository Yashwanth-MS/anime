import java.util.Scanner;

public class average {
    public static void CalculateAverage(int a,int b,int c) {
        int avg=(a+b+c)/3;
        System.out.println("the average of given three nos is:"+avg);
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of three nos:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        CalculateAverage(a,b,c);
        s.close();

    }
}
