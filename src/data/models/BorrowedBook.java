package data.models;

import java.util.Date;

public class BorrowedBook {
    private Book id;
    private User user;
    private boolean isReturned;
    private Date dateBorrowed;
    private Date dateReturned;

    public Book getId() {
        return id;
    }

    public void setId(Book id) {
        this.id = id;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }
}
