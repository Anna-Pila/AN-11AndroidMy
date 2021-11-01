class Cargo extends TerrestrialTransport{
    double carryingCapacity;

     Cargo(int power, double maxSpeed, double weight, String brand,
                 int nWheels, double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, weight, brand, nWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void print(){
        super.print();
        System.out.println("Грузоподъемность: "+carryingCapacity+" т\n");
    }

    private boolean capacity(double youCarryingCapacity){
         if (( youCarryingCapacity>0 ) && (youCarryingCapacity<=carryingCapacity)){
             return true;
         }
         else {
             return false;
         }
    }
    public void printCapacity(double youCarryingCapacity){
         if (capacity(youCarryingCapacity)){
             System.out.println("Грузовик загружен");
         }
         else {
             System.out.println("Груз в "+youCarryingCapacity+"т не поместися!\nВам нужен грузовик побольше ");
         }
    }
}
