package task1;

import java.util.List;
import java.util.concurrent.Callable;

public class SearchMax implements Callable<Integer> {

    private List<Integer> numbers;

    public SearchMax(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() {
        Integer max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
