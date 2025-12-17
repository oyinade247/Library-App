package data.models;

public class Book {
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String authorName;
    private int pages;
    private int edition;
    private int quantity;
    private Genre genre;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getEdition() {
        if(edition == 11 || edition == 12 || edition == 13) return  edition + "th" + "edition" ;
        if(edition % 10 == 1) return edition + "st" + "edition";
        if(edition % 10 == 2)return edition + "nd" + "edition";
        if(edition % 10 == 3)return edition + "rd" + "edition";
        return  edition + "th" + "edition" ;

    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
