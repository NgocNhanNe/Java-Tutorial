package Homework_OOP;

public class Engineer extends Department{
    private String training_industry;

    public Engineer(String full_name, int age, String gender, String address, String training_industry) {
        super(full_name, age, gender, address);
        this.training_industry = training_industry;
    }

    public String toString() {
        return "Department{" +
                "full_name='" + super.getFull_name() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", training_industry='" + training_industry + '\'' +
                '}';
    }


    public String getTraining_industry() {
        return training_industry;
    }

    public void setTraining_industry(String training_industry) {
        this.training_industry = training_industry;
    }
}
