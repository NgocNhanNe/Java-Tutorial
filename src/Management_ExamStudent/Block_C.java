package Management_ExamStudent;

public class Block_C extends Student{
    private int philology;
    private int historical;
    private int geographical;

    public Block_C(int student_id, String student_name, String student_address, int priority_point, int philology, int historical, int geographical) {
        super(student_id, student_name, student_address, priority_point);
        this.philology = philology;
        this.historical = historical;
        this.geographical = geographical;
    }

    @Override
    public String toString() {
        return "Block_C{" +
                "student_id=" + super.getStudent_id() +
                ", student_name='" + super.getStudent_name() + '\'' +
                ", student_address='" + super.getStudent_address() + '\'' +
                ", priority_point=" + super.getPriority_point() +
                ", philology=" + philology +
                ", historical=" + historical +
                ", geographical=" + geographical +
                '}';
    }

    public int getPhilology() {
        return philology;
    }

    public void setPhilology(int philology) {
        this.philology = philology;
    }

    public int getHistorical() {
        return historical;
    }

    public void setHistorical(int historical) {
        this.historical = historical;
    }

    public int getGeographical() {
        return geographical;
    }

    public void setGeographical(int geographical) {
        this.geographical = geographical;
    }
}
