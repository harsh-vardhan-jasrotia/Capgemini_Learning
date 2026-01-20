class Order{
    int orderId;
    int orderDate;
    Order(int a,int b){
        this.orderId=a;
        this.orderDate=b;
    }
    String getOrderStatus(){
        return "Order Placed";
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int a,int b,int c){
        super(a,b);
        this.trackingNumber=c;
    }
    String getOrderStatus(){
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder{
    int deliveryDate;
    DeliveredOrder(int a,int b,int c,int d){
        super(a,b,c);
        this.deliveryDate=d;
    }
    String getOrderStatus(){
        return "Order delivered";
    }
}
public class OnlineRetail {
    public static void main(String[] args) {
        Order o1=new Order(1,30/1/26);
        Order o2=new ShippedOrder(101, 11/2/26, 12113);
        Order o3=new DeliveredOrder(104, 12/2/26, 1123, 15/2/26);
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}