package Management_Department;

public class Employee extends Department{
    private String job;

    public Employee(String full_name, int age, String gender, String address, String job) {
        super(full_name, age, gender, address);
        this.job = job;
    }

    public String toString() {
        return "Department{" +
                "full_name='" + super.getFull_name() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
