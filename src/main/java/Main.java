import Number1.Button;
import Number2.Balance;
import Number3.Bell;
import Number4.OddEvenSeparator;
import Number5.Table;
import Numder6.exceptions.InvalidArgumentException;
import Numder6.exceptions.ZeroVolumeException;
import Numder6.geometry2d.Circle;
import Numder6.geometry2d.Rectangle;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1
        Button button = new Button();
        System.out.println("Новый клик: " + button.new_click());
        System.out.println("Еще один клик: " + button.new_click());


        //#2
        Scanner in = new Scanner(System.in);
        Balance balance = new Balance();
        balance.setLeft(in.nextInt());
        balance.setRight(in.nextInt());
        balance.result();


        //#3
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();


        //#4
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(23);
        separator.addNumber(44);
        separator.addNumber(57);
        separator.addNumber(98);
        separator.addNumber(13);

        List<Integer> evenNumbers = separator.getChet();
        List<Integer> oddNumbers = separator.getNechet();

        System.out.println("Chet: " + evenNumbers);
        System.out.println("Nechet: " + oddNumbers);


        //#5
        Table table = new Table(3, 3);

        table.setValue(0, 0, 10);
        table.setValue(0, 1, 20);
        table.setValue(0, 2, 30);
        table.setValue(1, 0, 40);
        table.setValue(1, 1, 50);
        table.setValue(1, 2, 60);
        table.setValue(2, 0, 70);
        table.setValue(2, 1, 80);
        table.setValue(2, 2, 90);

        System.out.println("Table:");
        System.out.println(table.toString());
        System.out.println("Number of rows: " + table.rows());
        System.out.println("Number of columns: " + table.cols());
        System.out.println("value: " + table.average());

        System.out.println("Value in cell (1,1): " + table.getValue(1, 1));



        //#6
        try {
            Circle circle = new Circle(3);
            circle.area();
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(4, 5);
            rectangle.area();
            System.out.println(rectangle);

            geometry3d.Cylinder cylinder = new geometry3d.Cylinder(circle, 5);
            System.out.println(cylinder.Volume());
            System.out.println(cylinder);

        } catch (ZeroVolumeException | InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}
