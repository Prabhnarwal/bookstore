
package bookstore1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Publisher {
    String Pname,Ptype;
    String location;

    void setPname(String pn) {
        pn = Pname;
    }

    void setlocation(String loc) {
        loc = location;
    }

    String getPname() {
        return Pname;
    }

    String getlocation() {
        return location;

    }

    void Display1(String pn,String loc) {
        System.out.println(pn + " " + loc);
    }

    public Publisher(String pn, String loc) {
       Pname=pn;
       location=loc;
    }
    public static String createId(Date newDate, String Pname)
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
        if(Pname.length()==1)
            fchar+="x";
        if(Pname.length()==2)
            fchar+=Pname;
        else if (Pname.equals(""))
            fchar="XX";
        else 
            fchar=Pname.substring(0,1);
        
        String lchar="";
        if(Pname.length()==1)
            lchar+="x";
        if(Pname.length()==2)
            lchar+=Pname;
        else if (Pname.equals(""))
            lchar="XX";
        else 
            lchar=Pname.substring(Pname.length()-1);
        String id=yr+"-"+mnt+"-"+dtInt+"-";
        if (Pname.equals(""))
            id+="XX";
        else if (Pname.length()==2)
            id+=Pname;
        else 
            id+=fchar.toUpperCase()+lchar.toUpperCase();
         return id;
    }
}
