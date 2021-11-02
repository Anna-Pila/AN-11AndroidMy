public class Main {
    public static void main(String[] args) {
        Greeter russia = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Приветствие в России - Привет!");
            }
        };
        Greeter english = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Приветствие в англоговорящих странах - Hello!");
            }
        };
        Greeter french = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Приветствие во Франции - Bonjour!");
            }
        };
        Greeter belarus = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Приветсвие в Беларуси - Добры дзень!");
            }
        };
        russia.wish();
        english.wish();
        french.wish();
        belarus.wish();
    }
}
