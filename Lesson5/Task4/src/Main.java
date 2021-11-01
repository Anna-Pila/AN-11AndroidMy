public class Main {
    public static void main(String[] args) {
        IStart start = new Start();
        Cosmodrome сosmodrome = new Cosmodrome(start);
        сosmodrome.start(start);
        System.out.println("________________________");
        System.out.println("Запуск шатла!");
        Shuttle shuttle = new Shuttle();
        Cosmodrome startShuttle = new Cosmodrome(shuttle);
        startShuttle.start(shuttle);
        System.out.println("________________________");
        System.out.println("Запуск SpaceX!");
        SpaceX spaceX = new SpaceX();
        Cosmodrome startSpaceX = new Cosmodrome(spaceX);
        startSpaceX.start(spaceX);

    }
}
