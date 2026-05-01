package vscode;
import java.util.Scanner;
public class Vote {
    public static void VotingElligible(int age){
        if(age >= 18){
            System.out.println("you are elligible for voting");
        }
        else{
            System.out.println("you are not elligible for voting ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the age to check elligibility: ");
        int age = s.nextInt();
        VotingElligible(age);
        s.close();
    }  
}
