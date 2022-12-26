package Management_Library;

public class Magazine extends Document{
    private int issue_number;
    private int release_month;

    public Magazine(String doc_id, String publisher, int release_number, int issue_number, int release_month) {
        super(doc_id, publisher, release_number);
        this.issue_number = issue_number;
        this.release_month = release_month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "doc_id=" + super.getDoc_id() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getRelease_number() +
                "issue_number=" + issue_number +
                ", release_month=" + release_month +
                '}';
    }

    public int getIssue_number() {
        return issue_number;
    }

    public void setIssue_number(int issue_number) {
        this.issue_number = issue_number;
    }

    public int getRelease_month() {
        return release_month;
    }

    public void setRelease_month(int release_month) {
        this.release_month = release_month;
    }
}
