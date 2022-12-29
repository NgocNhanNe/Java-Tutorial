package Management_ExamStudent;

public class Block_B extends Student{

    private int math;
    private int chemistry;
    private int biological;

    public Block_B(int student_id, String student_name, String student_address, int priority_point, int math, int chemistry, int biological) {
        super(student_id, student_name, student_address, priority_point);
        this.math = math;
        this.chemistry = chemistry;
        this.biological = biological;
    }

    @Override
    public String toString() {
        return "Block_B{" +
                "student_id=" + super.getStudent_id() +
                ", student_name='" + super.getStudent_name() + '\'' +
                ", student_address='" + super.getStudent_address() + '\'' +
                ", priority_point=" + super.getPriority_point() +
                ", math=" + math +
                ", chemistry=" + chemistry +
                ", biological=" + biological +
                '}';
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiological() {
        return biological;
    }

    public void setBiological(int biological) {
        this.biological = biological;
    }
}
