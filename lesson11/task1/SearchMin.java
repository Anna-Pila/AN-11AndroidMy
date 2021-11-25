package task1;

import java.util.List;
import java.util.concurrent.Callable;

public class SearchMin implements Callable<Integer> {

    private List<Integer> numbers;

    public SearchMin(List<Integer> numbers) {
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
        Integer min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
