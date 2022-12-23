package Homework_OOP;

public class Department {
    private String full_name;
    private int age;
    private String gender;
    private String address;


    @Override
    public String toString() {
        return "Department{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Department(String full_name, int age, String gender, String address) {
        this.full_name = full_name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
