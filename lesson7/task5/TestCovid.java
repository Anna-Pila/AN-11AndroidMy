package task5;

class TestCovid {

    private Patient patient;


    public TestCovid (Patient patient) {
        this.patient = patient;
    }

    public boolean test (boolean mask, boolean covid, boolean freelance){
        int result = 0;
        if (!mask) {
            result = result + (int) Utils.random(0,25);
        }
        if (!covid) {
            result = result + (int)Utils.random(0,25);
        }
        if (!freelance) {
            result = result + (int)Utils.random(0,25);
        }

        if ((result>=0)&&(result<=20)){
            return false;
        }
        else return true;
    }

    public String antibodies (boolean mask, boolean covid, boolean freelance){
        int igM = 0;
        int igG = 0;
        if (!mask) {
            igM = igM + (int)Utils.random(0,1);
            igG = igG + (int)Utils.random(0,3);
        }
        if (covid) {
            igG = igG + (int)Utils.random(5,7);
        }else {
            igG = igG + (int)Utils.random(0,3);
        }
        if (!freelance) {
            igM = igM + (int)Utils.random(0,1);
            igG = igG + (int)Utils.random(0,3);
        }

        if ((igM < 1)&&(igG<10)) {
            return "IgM - "+ igM +" IgG - "+igG+" - контакта с вирусом не было, " +
                    "\nантитела к коронавирусу отсутствуют.";
        }
        if ((igM == 1) &&(igG<10)) {
            return "IgM - "+ igM +" IgG - "+igG+" : сомнительный результат: контакт с " +
                    "\nвирусом мог состояться совсем недавно," +
                    "\n и он может находиться в организме.";
        }
        if ((igM >= 2) && (igG<10)) {
            return "IgM - "+ igM +" IgG - "+igG+" : контакт с вирусом состоялся недавно, " +
                    "\nидет начальная стадия " +
                    "\nзаболевания или бессимптомное течение.";
        }
        if ((igM < 2) &&(igG>=10)) {
            return "IgM - "+ igM +" IgG - "+igG+" : перенесенное в прошлом заболевание или " +
                    "\nстадия выздоровления, от момента контакта с вирусом могло пройти больше 3 недель " +
                    "\nпри бессимптомном течении.";
        }
        if ((igM >= 1) &&(igG>=10)) {
            return "IgM - "+ igM +" IgG - "+igG+" : сомнительный результат: наличие антител " +
                    "\nк вирусу говорит о перенесенном заболевании, антитела IgM могут говорить " +
                    "\nо нахождении вируса в организме. " +
                    "\nРекомендуется повторное тестирование через 7 дней.";
        }
        return "IgM - "+ igM +" \n IgG - "+igG+" - что-то не так";
    }
}
