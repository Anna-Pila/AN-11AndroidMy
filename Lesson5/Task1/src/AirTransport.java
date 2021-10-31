abstract class AirTransport extends Transport{
    double wingspan;
    double minRunway;

    AirTransport (int power, double maxSpeed,
                          double weight,String brand, double wingspan,double minRunway){
        super(power, maxSpeed,weight,brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    public void print(){
        super.print();
        System.out.print("Взмах крыльев "+wingspan+" м\nМинимальная длина посадочной полосы "+minRunway+" км\n");

    }
}
