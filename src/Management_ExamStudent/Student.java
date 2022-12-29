package Management_ExamStudent;

public class Student {
    private int student_id;
    private String student_name;
    private String student_address;
    private int priority_point;

    public Student(int student_id, String student_name, String student_address, int priority_point) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_address = student_address;
        this.priority_point = priority_point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_address='" + student_address + '\'' +
                ", priority_point=" + priority_point +
                '}';
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public int getPriority_point() {
        return priority_point;
    }

    public void setPriority_point(int priority_point) {
        this.priority_point = priority_point;
    }
}
