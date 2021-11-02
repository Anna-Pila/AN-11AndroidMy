public class Utils {
    public static double random(double min, double max) {
        return (Math.random() * ((max - min) + 1)) + min;
    }

    public static String boolString(boolean flag) {
        if (flag) {
            return "Да";
        } else return "Нет";
    }

    public static boolean stringBool(String str) {
        return str.equals("Да") || (str.equals("+"));
    }
}
