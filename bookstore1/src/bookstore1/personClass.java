package bookstore1;

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
    }

}
