package Management_ExamStudent;

public class Block_A extends Student{
    private int math;
    private int chemistry;
    private int physical;

    public Block_A(int student_id, String student_name, String student_address, int priority_point, int math, int chemistry, int physical) {
        super(student_id, student_name, student_address, priority_point);
        this.math = math;
        this.chemistry = chemistry;
        this.physical = physical;
    }

    @Override
    public String toString() {
        return "Block_A{" +
                "student_id=" + super.getStudent_id() +
                ", student_name='" + super.getStudent_name() + '\'' +
                ", student_address='" + super.getStudent_address() + '\'' +
                ", priority_point=" + super.getPriority_point() +
                ", math=" + math +
                ", chemistry=" + chemistry +
                ", physical=" + physical +
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

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }
}
