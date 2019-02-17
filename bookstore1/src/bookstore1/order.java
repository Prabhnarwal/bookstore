
package bookstore1;

import java.util.Date;

public class order {
int orderid;
Date date;
int cId;

void setorderid(int OrderId){
     OrderId=orderid;
     
}
void setorderdate(Date dt){
    dt=date;
}
void setordercId(int CId){
 CId=cId;   
}
int getorderid(){
    return orderid;
}
Date getdate(){
    return date;
    
}
int getcId(){
    return cId;
}
        public order(int OrderId,Date dt,int CId){
            orderid=OrderId;
            date=dt;
            cId=CId;
        }
        void display(int OrderId,Date dt,int Cid){
            System.out.println(OrderId+" "+dt+" "+Cid);
        }

}
