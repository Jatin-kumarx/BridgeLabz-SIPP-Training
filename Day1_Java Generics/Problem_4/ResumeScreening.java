import java.util.List;

public class ResumeScreening {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) System.out.println("Processing for: " + role.getRole());
    }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r = new Resume<>("Alice", new SoftwareEngineer());
        System.out.println("Resume: " + r.candidate + " - " + r.role.getRole());
    }
}