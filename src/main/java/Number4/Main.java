package Number4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OddEvenSeparator separator = new OddEvenSeparator();

        // Добавляем числа в разделитель
        separator.addNumber(10); // Чётное
        separator.addNumber(23); // Нечётное
        separator.addNumber(44); // Чётное
        separator.addNumber(57); // Нечётное
        separator.addNumber(98); // Чётное
        separator.addNumber(13); // Нечётное

        // Получаем списки чётных и нечётных чисел
        List<Integer> evenNumbers = separator.getChet();
        List<Integer> oddNumbers = separator.getNechet();

        // Выводим результаты
        System.out.println("Chet: " + evenNumbers);
        System.out.println("Nechet: " + oddNumbers);
    }
}
