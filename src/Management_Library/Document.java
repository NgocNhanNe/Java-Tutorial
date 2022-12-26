package Management_Library;

public class Document {
    private String doc_id;
    private String publisher;
    private int release_number;

    public Document(String doc_id, String publisher, int release_number) {
        this.doc_id = doc_id;
        this.publisher = publisher;
        this.release_number = release_number;
    }

    public Document(){

    }
    @Override
    public String toString() {
        return "Document{" +
                "doc_id='" + doc_id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", release_number=" + release_number +
                '}';
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public int getRelease_number() {
        return release_number;
    }

    public void setRelease_number(int release_number) {
        this.release_number = release_number;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
