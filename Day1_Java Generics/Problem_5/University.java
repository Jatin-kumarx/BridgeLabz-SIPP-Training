import java.util.List;

public class University {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println(c.getType());
    }
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Math", new ExamCourse());
        System.out.println(math.name + " - " + math.type.getType());
    }
}