package task3;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Main {
    static void test() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        throw new NullPointerException();
    }
    public static void main(String[] args) throws URISyntaxException {
        try {
            test();
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
