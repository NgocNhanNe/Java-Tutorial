package Management_Town;

import java.util.List;

public class Family {
    private List<Person> personList;
    private String address;

    public Family(List<Person> personList, String address) {
        this.personList = personList;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "Size of=" + personList.size() +
                ", address='" + address + '\'' +
                ", personList=" + personList +
                '}';
    }
}
