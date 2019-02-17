package bookstore1;

public class book {

    String title;
    Double price;
    int year;
    long ISBN;

    void settitle(String t) {
        t = title;
    }

    void setprice(Double pr) {
        pr = price;
    }

    void setyear(int y) {
        y = year;
    }

    void setISBN(long isbn) {
        isbn = ISBN;
    }

    String gettitle() {
        return title;
    }

    Double getprice() {
        return price;

    }

    int getyear() {
        return year;
    }

    long getISBN() {
        return ISBN;
    }

    void Display(String t, Double pr, int y, long isbn) {
        System.out.println(t + " " + pr + " " + y + " " + " " + isbn);
    }

    public book(String t, Double pr, int y, long isbn) {
        title=t;
        price=pr;
        year=y;
        ISBN=isbn;
    }
}
