public class Course<T extends CourseType> {
    String name;
    T type;
    public Course(String name, T type) {
        this.name = name;
        this.type = type;
    }
}