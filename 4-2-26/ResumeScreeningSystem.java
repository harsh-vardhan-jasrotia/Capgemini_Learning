import java.util.*;
abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public abstract String getRole();
    public abstract boolean isQualified();
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }
    public String getRole() {
        return "Software Engineer";
    }
    public boolean isQualified() {
        return true; 
    }
}
class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }
    public String getRole() {
        return "Data Scientist";
    }
    public boolean isQualified() {
        return true;
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }

    public String getRole() {
        return "Product Manager";
    }

    public boolean isQualified() {
        return false;
    }
}
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
}
class ResumeScreeningAI {

    // Generic Method
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        T role = resume.getJobRole();
        System.out.println("Candidate: " + role.getCandidateName());
        System.out.println("Applied Role: " + role.getRole());
        System.out.println("Status: " + (role.isQualified() ? "Selected" : "Rejected"));
        System.out.println();
    }
    public static void screeningPipeline(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            System.out.println(
                role.getCandidateName() + " → " +
                role.getRole() + " → " +
                (role.isQualified() ? "Selected" : "Rejected")
            );
        }
    }
}
public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("Alice"));

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("Bob"));

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("Charlie"));

        ResumeScreeningAI.screenResume(r1);
        ResumeScreeningAI.screenResume(r2);
        ResumeScreeningAI.screenResume(r3);

        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("David"));
        applicants.add(new DataScientist("Eva"));
        applicants.add(new ProductManager("Frank"));

        System.out.println("=== AI Screening Pipeline ===");
        ResumeScreeningAI.screeningPipeline(applicants);
    }
}
