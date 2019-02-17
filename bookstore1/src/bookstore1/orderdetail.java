
package bookstore1;

public class orderdetail {

    String quantity;

    void setquantity(String Quantity) {
        Quantity = quantity;
    }

    String getQuantity() {
        return quantity;
    }

    public orderdetail(String Quantity) {
        quantity = Quantity;
    }

    void Display5(String Quantity) {
        System.out.println(Quantity);
    }
}
