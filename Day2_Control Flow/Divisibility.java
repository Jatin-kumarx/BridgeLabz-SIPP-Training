import java.util.*;
public class Divisibility{
    public static void main(String [] args){
        int k=5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        if(n%k==0){
           System.out.println("Number is divisible");
        }
        else{
            System.out.println("numer is not divisible");
        }
    }
}