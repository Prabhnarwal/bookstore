package bookstore1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class customer extends personClass {

    int cID;
    Date registerDate;

    void setcID(int cusID) {
        cusID = cID;
    }

    void setregisterDate(Date regDate) {
        regDate = registerDate;
    }

    public customer(String Fname,String Lname,String Address,String email,long Pno,int cusID, Date regDate) {

        super(Fname,Lname,Address,email,Pno);
    }

    int getcID() {
        return cID;
    }

    Date getregisterDate() {
        return registerDate;
    }

    void Display2(int cusID, Date regDate) {
        System.out.println(cusID + " " + regDate);
    }
public static String createId(Date newDate, String Fname)
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
