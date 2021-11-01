abstract class TerrestrialTransport extends Transport{
    int nWheels;
    double fuelConsumption;

    TerrestrialTransport (int power, double maxSpeed,
                          double weight,String brand, int nWheels, double fuelConsumption){
        super(power, maxSpeed,weight,brand);
        this.nWheels = nWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public void print(){
        super.print();
        System.out.println("Кол-во колес: "+nWheels+"\nРасход топлива "+fuelConsumption+" л/100км");
    }


}
