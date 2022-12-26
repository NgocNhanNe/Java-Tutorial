package Management_Library;

public class Book extends Document{

    private String author_name;
    private int pages;

    public Book(String doc_id, String publisher, int release_number, String author_name, int pages) {
        super(doc_id, publisher, release_number);
        this.author_name = author_name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "doc_id='" + super.getDoc_id() + '\'' +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getRelease_number() +
                ", author_name='" + author_name + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
