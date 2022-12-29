package Management_Town;

public class Person {
    private double personal_id;
    private String full_name;
    private int age;
    private String career;

    public Person(double personal_id, String full_name, int age, String career) {
        this.personal_id = personal_id;
        this.full_name = full_name;
        this.age = age;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personal_id=" + personal_id +
                ", full_name='" + full_name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                '}';
    }

}
