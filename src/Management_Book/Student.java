package Management_Book;

public class Student {
    private String full_name;
    private int age;
    private String class_id;

    public Student(String full_name, int age, String class_id) {
        this.full_name = full_name;
        this.age = age;
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                ", class_id='" + class_id + '\'' +
                '}';
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

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }
}
