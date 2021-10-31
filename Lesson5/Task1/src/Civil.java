class Civil extends AirTransport {
     int nPassengers;
     boolean businessClass;

     public Civil(int power, double maxSpeed, double weight, String brand,
                  double wingspan, double minRunway, int nPassengers, boolean businessClass) {
         super(power, maxSpeed, weight, brand, wingspan, minRunway);
         this.nPassengers = nPassengers;
         this.businessClass = businessClass;
     }
     private String isBusinessClass(){
         if (businessClass){
             return "+";
         }
         else {return "-";}
     }

     public void print(){
         super.print();
         System.out.println("Кол-во пассажиров: "+nPassengers+"\nНаличие бизнесс-класса: "+isBusinessClass()+"\n");
     }

    private boolean capacity(int youPassengers){
        if (( youPassengers>0 )&& (youPassengers<=nPassengers)){
            return true;
        }
        else {
            return false;
        }
    }
    public void printCapacity(int youPassengers){
        if (capacity(youPassengers)){
            System.out.println("Мест достаточно!");
        }
        else {
            System.out.println("Кол-во посадочных мест не рассчитано на "+youPassengers+ " пассажиров!" );
        }
    }
 }
