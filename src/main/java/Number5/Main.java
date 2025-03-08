package Number5;

public class Main {
    public static void main(String[] args) {
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
    }
}
