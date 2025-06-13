public class fee {
    public static void main(String [] args){
       int fee = 125000;
       int discount_percent= 10;
       int discount_amount= (fee * discount_percent) / 100;
       int final_fee = fee-discount_amount;
       System.out.println("discount_amount is "+discount_amount+ " final_fee after discount is "+final_fee);


    }
    
}
