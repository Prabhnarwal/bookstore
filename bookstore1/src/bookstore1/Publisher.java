
package bookstore1;

public class Publisher {
    String Pname;
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
}
