public class Student {
    String name;
    int rollNumber;
    int marks;
    public Student(String name, int roll, int marks) {
        this.name = name;
        this.rollNumber = roll;
        this.marks = marks;
    }
    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
    public void displayReport() {
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + getGrade());
    }
    public static void main(String[] args) {
        Student s = new Student("Jatin", 101, 85);
        s.displayReport();
    }
}
