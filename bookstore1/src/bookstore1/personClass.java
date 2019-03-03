package bookstore1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class personClass {

    String firstname;

    String lastname;

    String address;

    String email;

    long phoneno;

    void setfirstname(String Fname) {
        Fname = firstname;
    }

    void setlastname(String Lname) {
        Lname = lastname;
    }

    void setaddress(String Address) {
        Address = address;

    }

    void setemail(String Email) {
        Email = email;

    }

    void setphoneno(long Pno) {
        Pno = phoneno;

    }

    String getfirstname() {

        return firstname;

    }

    String getlastname() {
        return lastname;
    }

    String getaddress() {
        return address;
    }

    String getemail() {
        return email;

    }

    long getphoneno() {
        return phoneno;

    }

    public personClass(String Fname, String Lname, String Address, String Email, long Pno) {
        firstname = Fname;
        lastname = Lname;
        address = Address;
        email = Email;
        phoneno = Pno;

    }

    void Display3(String Fname, String Lname, String Address, String Email, long Pno) {
        System.out.println(Fname + " " + Lname + " " + Address + " " + Email + " " + Pno);
    }public static String createId(Date newDate, String Fname)
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
        if(Fname.length()==1)
            fchar+="x";
        if(Fname.length()==2)
            fchar+=Fname;
        else if (Fname.equals(""))
            fchar="XX";
        else 
            fchar=Fname.substring(0,1);
        
        String lchar="";
        if(Fname.length()==1)
            lchar+="x";
        if(Fname.length()==2)
            lchar+=Fname;
        else if (Fname.equals(""))
            lchar="XX";
        else 
            lchar=Fname.substring(Fname.length()-1);
        String id=yr+"-"+mnt+"-"+dtInt+"-";
        if (Fname.equals(""))
            id+="XX";
        else if (Fname.length()==2)
            id+=Fname;
        else 
            id+=fchar.toUpperCase()+lchar.toUpperCase();
         return id;
    }
}



