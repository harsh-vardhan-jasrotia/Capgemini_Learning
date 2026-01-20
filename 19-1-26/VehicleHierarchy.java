class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void showInfo(){
        System.out.println("Maxspeed "+maxSpeed);
        System.out.println("Fueltype "+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("Seat capacity "+seatCapacity);
    }
}
class Truck extends Vehicle{
    double loadcapacity;
    Truck(int maxSpeed,String fuelType,double loadcapacity){
        super(maxSpeed, fuelType);
        this.loadcapacity=loadcapacity;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("Load capacity "+loadcapacity);
    }
}
class Motorcycle extends Vehicle{
    double cc;
    Motorcycle(int maxSpeed,String fuelType,double cc){
        super(maxSpeed,fuelType);
        this.cc=cc;
    }
    void showInfo(){
        super.showInfo();
        System.out.println("CC "+cc);
    }
}
public class VehicleHierarchy {    
    public static void main(String[] args) {
        Vehicle v1=new Car(240,"Diesel",5);
        Vehicle v2=new Truck(250,"Petrol",1000);
        Vehicle v3=new Motorcycle(170,"Petrol",170);
        v1.showInfo();
        v2.showInfo();
        v3.showInfo();
    }
}
