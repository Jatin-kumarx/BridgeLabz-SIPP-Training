import java.util.*;
public class NumberCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Number " +(i+1)+" :");
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("Positive and Even");
                }
                else{
                    System.out.println("Positive and odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("The Number is Zero");
            }        
        }
            if(arr[0]==arr[4]){
                System.out.println("both are equal");
            }
            else if(arr[0]>arr[4]){
                System.out.println("First Number is greater then last");
            }
            else{
                System.out.println("The Last Number is greater than first");
            }
            
        
    }
}
