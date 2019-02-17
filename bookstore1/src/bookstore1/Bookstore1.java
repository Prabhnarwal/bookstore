
package bookstore1;

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
    }
    
}
