import java.util.Scanner;
public class greater {
    public static int GreatestNo(int a,int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("the greatest no among a and b is: "+GreatestNo(a,b));
        s.close();
    }   
}
