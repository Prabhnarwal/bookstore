
package bookstore1;

import java.util.Date;

public class Bookstore1 {

    public static void main(String[] args) {
        // TODO code application logic here
        book b=new book("Puzzles",12.50,2018,1098989834);
        b.settitle("Hello");
        b.setprice(13.25);
        b.setyear(2019);
        b.setISBN(45679997);       
        System.out.println(b.gettitle() + " " + b.getprice() + " " + b.getyear()+" "+b.getISBN());
        b.Display("abc",24.50,2017,9090909);
        
        
        Publisher p=new Publisher("ABC","Montreal");
        p.setPname("abc");
        p.setlocation("Brampton");
        System.out.println(p.getPname() + " " +p.getlocation());
        p.Display1("hello","Montreal");
        
        Date tempdate = new Date(03 - 02 - 2019);
        customer c = new customer(101,tempdate);
        c.setcID(111);
        c.setregisterDate(tempdate);
        
        System.out.println(c.getcID() + " " + c.getregisterDate());
        c.Display2(112, tempdate);
    }
    }
    

