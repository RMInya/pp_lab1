import java.util.*;

public class App {
    int a = 2, b = 1, c, i, len;
    int[] LucasNum = new int[100];
    int[] TriangleNum = new int[300];
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void search(int[] LucasNum, int len) {
        int number = 1;
        while (number != 0) {
            System.out.print(System.lineSeparator());
            Scanner nu = new Scanner(System.in);
            System.out.println("Enter queue of Lucas Number you want to find: (0 to stop)");
            number = nu.nextInt();
            for (int k = 0; k < len + 1; k++) {

                if (k == number) {
                    System.out.println("You found " + LucasNum[k - 1]);
                }
            }
        }
    }

    public static void compare(int[] LucasNum, int[] TriangleNum, int len) {
        for (int v = 0; v < 300; v++) {
            int local = 0;
            local = TriangleNum[v];
            for (int k = 0; k < len; k++) {
                if (LucasNum[k] == local) {
                    System.out.println(ANSI_RED + "Lucas " + LucasNum[k] + " = Triangle " + local + ANSI_RESET);
                }
            }
        }
    }

    public static void main(String[] args) {
        App obj = new App();
        // змінні і масиви
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of lucas series:");
        obj.len = in.nextInt();
        int j = 0;
        int count = 2;
        // масив чисел Люка
        for (obj.i = 1; obj.i <= obj.len; obj.i++) {
            obj.c = obj.a + obj.b;
            obj.LucasNum[j] = obj.c;
            obj.a = obj.b;
            obj.b = obj.c;
            j++;
        }
        // вивід чисел Люка
        System.out.print(System.lineSeparator());
        System.out.print(ANSI_GREEN + "Lucas Numbers: " + ANSI_RESET);
        for (int k = 0; k < obj.len; k++) {
            System.out.print(obj.LucasNum[k] + " ");
        }
        // масив трикутних чисел
        for (int k = 0; k < 300; k++) {
            obj.TriangleNum[k] = ((count * (count + 1)) / 2);
            count++;
        }
        // System.out.print(System.lineSeparator() + System.lineSeparator());

        // // вивід трикутних чисел
        // System.out.print(ANSI_GREEN + "Triangle Numbers: " + ANSI_RESET);
        // for (int k = 0; k < 300; k++) {
        // System.out.print(obj.TriangleNum[k] + " ");
        // }
        System.out.print(System.lineSeparator() + System.lineSeparator());

        // Числа Люка які = трикутним числам
        compare(obj.LucasNum, obj.TriangleNum, obj.len);
        // пошук чисел люка
        System.out.print(System.lineSeparator());
        search(obj.LucasNum, obj.len);
    }
}
