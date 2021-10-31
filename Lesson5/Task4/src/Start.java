public class Start implements IStart {

    public Start() {
    }
    @Override
    public boolean startingCheck(){
        return true;
    }
    @Override
    public void  startEngine(){
        System.out.println("Запуск двигателя!");
    }
    @Override
    public void start(){
        System.out.println("Запуск пошел!");
    }
}
