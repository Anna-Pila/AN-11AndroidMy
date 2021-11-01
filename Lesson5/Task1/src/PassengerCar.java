class PassengerCar extends TerrestrialTransport {
    String typeBody;
    int nPassengers;

     PassengerCar(int power, double maxSpeed, double weight, String brand, int nWheels,
                  double fuelConsumption, String typeBody, int nPassengers) {
        super(power, maxSpeed, weight, brand, nWheels, fuelConsumption);
        this.typeBody = typeBody;
        this.nPassengers = nPassengers;
    }

    public void print(){
         super.print();
        System.out.println("Тип кузова: "+typeBody+"\n"+"Кол-во пассажиров: "+nPassengers+"\n");
    }

    public void maxKilometers (double time){
        System.out.print("За время " +time+ "ч, автомобиль"+ brand+"\n" +
                "двигаясь с максимальной скоростью "+maxSpeed+"км/ч\n" +
                "проедет "+nKilometers(time)+" км и израсходует " + nKilometers(time)*fuelConsumption +" литров топлива.\n");
    }

    private double nKilometers (double time){
        return time * maxSpeed;
    }

}
