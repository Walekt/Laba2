package Numder6;
import Numder6.geometry2d.*;
import Numder6.geometry3d.*;
import Numder6.exceptions.ZeroVolumeException;
import Numder6.exceptions.InvalidArgumentException;
public class Main {
    public static void main(String[] args) {
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
