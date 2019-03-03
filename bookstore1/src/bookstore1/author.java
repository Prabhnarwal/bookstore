/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore1;

import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static String createId(Date newDate, String bookName)
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
        if(bookName.length()==1)
            fchar+="x";
        if(bookName.length()==2)
            fchar+=bookName;
        else if (bookName.equals(""))
            fchar="XX";
        else 
            fchar=bookName.substring(0,1);
        
        String lchar="";
        if(bookName.length()==1)
            lchar+="x";
        if(bookName.length()==2)
            lchar+=bookName;
        else if (bookName.equals(""))
            lchar="XX";
        else 
            lchar=bookName.substring(bookName.length()-1);
        String id=yr+"-"+mnt+"-"+dtInt+"-";
        if (bookName.equals(""))
            id+="XX";
        else if (bookName.length()==2)
            id+=bookName;
        else 
            id+=fchar.toUpperCase()+lchar.toUpperCase();
         return id;
    }
}
