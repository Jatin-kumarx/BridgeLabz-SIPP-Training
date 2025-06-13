public class Distributed_pens {
    public static void main(String [] args){
        int pens= 13;
        int students = 3;
        int pen_per_student = pens/students;
        int remaining_pens = pens%students;
        System.out.println("pens_per_student = "+pen_per_student  +  " remaining_pens= " +remaining_pens);
    }
    
}
