package Management_Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Guest> guestList;

    public Hotel(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "guestList=" + guestList +
                '}';
    }

    public Hotel() {
        guestList = new ArrayList<>();
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

}
