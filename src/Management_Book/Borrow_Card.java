package Management_Book;

import java.util.Date;
import java.util.List;

public class Borrow_Card {
    private int card_id;
    private Date date_borrow;
    private Date date_deadline;
    private int book_id;
    Student student;

    public Borrow_Card(int card_id, Date date_borrow, Date date_deadline, int book_id, Student student) {
        this.card_id = card_id;
        this.date_borrow = date_borrow;
        this.date_deadline = date_deadline;
        this.book_id = book_id;
        this.student = student;
    }

    public Borrow_Card(){

    }

    @Override
    public String toString() {
        return "Borrow_Card{" +
                "card_id=" + card_id +
                ", date_borrow=" + date_borrow +
                ", date_deadline=" + date_deadline +
                ", book_id=" + book_id +
                ", student=" + student +
                '}';
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public Date getDate_borrow() {
        return date_borrow;
    }

    public void setDate_borrow(Date date_borrow) {
        this.date_borrow = date_borrow;
    }

    public Date getDate_deadline() {
        return date_deadline;
    }

    public void setDate_deadline(Date date_deadline) {
        this.date_deadline = date_deadline;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
