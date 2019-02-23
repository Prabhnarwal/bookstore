package bookstore1;

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

    public customer(String Fname,String Lname,String Address,String email,long Pno) {

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

}
