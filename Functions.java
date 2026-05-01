import java.util.Scanner;

public class Functions {
    public static int CalculateSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int result = CalculateSum(a, b);
        System.out.println("Sum = " + result);
        s.close();
    }
}
