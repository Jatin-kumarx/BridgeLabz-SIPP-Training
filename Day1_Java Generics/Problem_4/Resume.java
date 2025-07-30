public class Resume<T extends JobRole> {
    String candidate;
    T role;
    public Resume(String candidate, T role) {
        this.candidate = candidate;
        this.role = role;
    }
}