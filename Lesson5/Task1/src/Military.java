public class Military extends AirTransport{
    boolean catapult;
    int nRocket;

    public Military(int power, double maxSpeed, double weight,
                    String brand, double wingspan, double minRunway, boolean catapult, int nRocket) {
        super(power, maxSpeed, weight, brand, wingspan, minRunway);
        this.catapult = catapult;
        this.nRocket = nRocket;
    }

    public void print(){
        super.print();
        System.out.println("Кол-во ракет: "+nRocket);
    }

    private boolean shot(int youRocket){
        if (( nRocket > 0 )&& (youRocket <= nRocket)){
            return true;
        }
        else {
            return false;
        }
    }
    public void printCapacity(int youRocket){
        if (shot(youRocket)){
            System.out.println("Вы запустили "+youRocket+" \nРакета пошла…");
        }
        else {
            System.out.println("Вы запустили "+youRocket+"\nБоеприпасы отсутствуют" );
        }
    }
    public void printCatapult(){
        if (catapult){
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У вас нет такой системы");
        }
    }


}
