package Management_Town;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public void showInfor(){
        this.families.forEach(family -> System.out.println(family.toString()));
    }

    public void addFamily(Family family){
        this.families.add(family);
    }

}
