/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore1;

/**
 *
 * @author 1894830
 */
public class author extends personClass {
    
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

    public author(String Fname,String Lname,String Address,String email,long Pno,String BookName, String Authorname ) {

        super(Fname,Lname,Address,email,Pno);
    
    }

    void Display4(String BookName, String Authorname) {
        System.out.println(BookName + ""
                + Authorname);
    }
}
