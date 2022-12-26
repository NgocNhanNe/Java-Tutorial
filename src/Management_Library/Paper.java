package Management_Library;

public class Paper extends Document{
    private int day;

    public Paper(String doc_id, String publisher, int release_number, int day) {
        super(doc_id, publisher, release_number);
        this.day = day;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "doc_id=" + super.getDoc_id() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getRelease_number() +
                "day=" + day +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
