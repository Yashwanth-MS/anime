import java.util.Scanner;
public class sumofodd {
    public static void SumOfAllOddNos(int n){
        int Sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                Sum = Sum + i;
            }
            else {
                continue;
            }
        }
        System.out.println("the sum of all odd no from 1 to"+n+"is:"+Sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = s.nextInt();
        SumOfAllOddNos(n);
        s.close();
    }
}
