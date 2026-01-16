public class Vehicle {
    String ownerName;
    String vehicletype;
    static double registration=1500.0;
    Vehicle(String ownerName,String vehicletype){
        this.ownerName=ownerName;
        this.vehicletype=vehicletype;
    }
    void displayVehicleDetails(){
        System.out.println("Owner name:"+ownerName);
        System.out.println("Vehicle"+vehicletype);
        System.out.println("Registration fee:"+registration);
    }
    static void updateRegistrationFee(double newFee){
        registration=newFee;
    }
}
    public class VehicleRegistration{
        public static void main(String[] args) {
        Vehicle V1=new Vehicle();
        Vehicle V2=new Vehicle();

        }
    }

