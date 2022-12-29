package Management_Hotel;

public class Guest {
    private double personal_id;
    private String full_name;
    private int age;
    private  int rentDay_num;
    private String category;


    public Guest(double personal_id, String full_name, int age, int rentDay_num, String category) {
        this.personal_id = personal_id;
        this.full_name = full_name;
        this.age = age;
        this.rentDay_num = rentDay_num;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "personal_id=" + personal_id +
                ", full_name='" + full_name + '\'' +
                ", age=" + age +
                ", rentDay_num=" + rentDay_num +
                ", category='" + category + '\'' +
                '}';
    }

    public double getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(double personal_id) {
        this.personal_id = personal_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRentDay_num() {
        return rentDay_num;
    }

    public void setRentDay_num(int rentDay_num) {
        this.rentDay_num = rentDay_num;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
