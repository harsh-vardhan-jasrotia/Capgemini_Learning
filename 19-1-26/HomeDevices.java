class Device{
    int deviceId;
    String status;
    Device(int a,String b){
        this.deviceId=a;
        this.status=b;
    }
    void showDetails(){
        System.out.println("Device Id "+deviceId);
        System.out.println("Status "+status);
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    Thermostat(int d,String e,int c){
        super(d,e);
        this.temperatureSetting=c;
    }
}
public class HomeDevices {
    public static void main(String[] args) {
        Device d1=new Thermostat(101, "On", 120);
        d1.showDetails();
    }
}
