 import java.util.*;
public class fee_userinput {
     public static void main(String [] args){
       double fee;
       double discount_percent;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the fee");
       fee = sc.nextDouble();
       System.out.println("Enter the discount percent");
       discount_percent = sc.nextDouble();
       double discount_amount= (fee * discount_percent)/100;
       double final_fee = fee-discount_amount;
       System.out.println("discount_amount is "+discount_amount+ " final_fee after discount is "+final_fee);


    }
    
}
