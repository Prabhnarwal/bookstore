package bookstore1;

import java.util.Date;

public class customer {

    int cID;
    Date registerDate;

    void setcID(int cusID) {
        cusID = cID;
    }

    void setregisterDate(Date regDate) {
        regDate = registerDate;
    }

    public customer(int cusID, Date regDate) {

        cID = cusID;
        registerDate = regDate;
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
