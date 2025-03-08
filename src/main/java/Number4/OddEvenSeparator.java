package Number4;


import java.util.ArrayList;
import java.util.List;


public class OddEvenSeparator {
    private final List<Integer> chet = new ArrayList<>();
    private final List<Integer> nechet = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            chet.add(number);
        } else {
            nechet.add(number);
        }
    }

    public List<Integer> getChet() {
        return chet;
    }

    public List<Integer> getNechet() {
        return nechet;
    }
}