/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1894830
 */
public class orderdetail {
    String quantity;
    
    void setquantity(String Quantity)
    {
        Quantity=quantity;
    }
     String getQuantity() {
        return quantity;
}
     public orderdetail(String 
             Quantity)
     {
         quantity=Quantity;
     }
     void diaplay(String Quantity){
         System.out.println(""+Quantity);
     }
}