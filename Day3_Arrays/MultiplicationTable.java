import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Number = sc.nextInt();
        int [] arr = new int[4];
        for(int i=6;i<=9;i++){
            arr[i-6]=Number*i;
        }
        for(int i=6;i<=9;i++){
        System.out.println("The Multiplication Table of Number "+Number+" is for*"+i+" :" +arr[i-6]);
        }
    }
}