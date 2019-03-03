
package bookstore1;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static String createId(Date newDate, String title)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(newDate);
        String[] dt=date.split("-");
        String dtInt;
        if(Integer.parseInt(dt[2])%2==0)
        {
            dtInt="E";
           
        }
        else
        {
             dtInt="O";
        }
        String mnt=dt[1];
        String yr=dt[0].substring(2);
        String fchar="";
        if(title.length()==1)
            fchar+="x";
        if(title.length()==2)
            fchar+=title;
        else if (title.equals(""))
            fchar="XX";
        else 
            fchar=title.substring(0,1);
        
        String lchar="";
        if(title.length()==1)
            lchar+="x";
        if(title.length()==2)
            lchar+=title;
        else if (title.equals(""))
            lchar="XX";
        else 
            lchar=title.substring(title.length()-1);
        String id=yr+"-"+mnt+"-"+dtInt+"-";
        if (title.equals(""))
            id+="XX";
        else if (title.length()==2)
            id+=title;
        else 
            id+=fchar.toUpperCase()+lchar.toUpperCase();
         return id;
    }
}
