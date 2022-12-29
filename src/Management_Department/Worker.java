package Management_Department;

public class Worker extends Department {
    private int position;

    public Worker(String full_name, int age, String gender, String address, int position) {
        super(full_name, age, gender, address);
        this.position = position;
    }

    public String toString() {
        return "Department{" +
                "full_name='" + super.getFull_name() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
