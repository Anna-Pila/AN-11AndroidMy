public class Cosmodrome {
    IStart iStart;

    public Cosmodrome(IStart iStart) {
        this.iStart = iStart;
    }

    public void start (IStart myStart){
        if (!iStart.startingCheck()) {
            System.out.println("Предстартовая проверка провалена!");
        }
        else {
            iStart.startEngine();
            for (int i = 10; i >0 ; i--) {
                System.out.print(i+"..");
            }
            System.out.println();
            myStart.start();
        }
    }
}
