package bookstore1;

import java.util.Date;

public class Bookstore1 {

    public static void main(String[] args) {
        // TODO code application logic here
        book b = new book("Puzzles", 12.50, 2018, 1098989834);
        b.settitle("Hello");
        b.setprice(13.25);
        b.setyear(2019);
        b.setISBN(45679997);
        System.out.println(b.gettitle() + " " + b.getprice() + " " + b.getyear() + " " + b.getISBN());
        b.Display("abc", 24.50, 2017, 9090909);

        Publisher p = new Publisher("ABC", "Montreal");
        p.setPname("abc");
        p.setlocation("Brampton");
        System.out.println(p.getPname() + " " + p.getlocation());
        p.Display1("hello", "Montreal");

        Date tempdate = new Date(03 - 02 - 2019);
        customer c = new customer(101, tempdate);
        c.setcID(111);
        c.setregisterDate(tempdate);
        System.out.println(c.getcID() + " " + c.getregisterDate());
        c.Display2(112, tempdate);

        personClass pc = new personClass("Prabhjot", "Narwal", "Montreal", "narwalprabhjot@gmail.com", 9898989);
        pc.setfirstname("Prabhjot");
        pc.setlastname("Narwal");
        pc.setaddress("Montreal");
        pc.setemail("narwalprabhjot@gmail.com");
        pc.setphoneno(90909090);
        System.out.println(pc.getfirstname() + " " + pc.getlastname() + " " + pc.getaddress() + " " + pc.getemail() + " " + pc.getphoneno());
        pc.Display3("abc", "cde", "fgh", "ijkl@gmail.com", 9090909);

        author a = new author("Anna Karenina", "Leo Tolstoy");
        a.setbookname("Madame Bovary");
        a.setauthorname("Gustave Flaubert");
        System.out.println(a.getBookname() + " " + a.getAuthorname());
        a.Display4("Middlemarch", "George Eliot");

        orderdetail od = new orderdetail(5);
        od.setquantity(7);
        System.out.println(od.getQuantity());
        od.Display5(10);
    }
}
