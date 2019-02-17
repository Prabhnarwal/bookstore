/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1894830
 */
public class authorclass {

    String bookname;
    String authorname;

    void setbookname(String BookName) {

        BookName = bookname;
    }

    void setauthorname(String Authorname) {
        Authorname = authorname;
    }

    String getBookname() {
        return bookname;
    }

    String getAuthorname() {
        return authorname;
    }

    public authorclass(String BookName, String Authorname) {
        bookname = BookName;
        authorname = Authorname;
    }

    void Display4(String BookName, String Authorname) {
        System.out.println(BookName + ""
                + Authorname);
    }
}
