import java.util.*;

public class App {
    int a = 2, b = 1, c, i;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        App obj = new App();
        // змінні і масиви
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of lucas series:");
        int len = in.nextInt();
        int[] LucasNum = new int[len];
        int[] TriangleNum = new int[len];
        int j = 0;
        int count = 2;
        // масив чисел Люка
        for (obj.i = 1; obj.i <= len; obj.i++) {
            obj.c = obj.a + obj.b;
            LucasNum[j] = obj.c;
            obj.a = obj.b;
            obj.b = obj.c;
            j++;
        }
        // вивід чисел Люка
        System.out.print(System.lineSeparator());
        System.out.print(ANSI_GREEN + "Lucas Numbers: " + ANSI_RESET);
        for (int k = 0; k < len; k++) {
            System.out.print(LucasNum[k] + " ");
        }
        // масив трикутних чисел
        for (int k = 0; k < len; k++) {
            TriangleNum[k] = ((count * (count + 1)) / 2);
            count++;
        }
        System.out.print(System.lineSeparator() + System.lineSeparator());
        System.out.print(ANSI_GREEN + "Triangle Numbers: " + ANSI_RESET);

        // вивід трикутних чисел
        for (int k = 0; k < len; k++) {
            System.out.print(TriangleNum[k] + " ");
        }
        System.out.print(System.lineSeparator() + System.lineSeparator());

        // Числа Люка які = трикутним числам
        for (int k = 0; k < len; k++) {
            if (LucasNum[k] == TriangleNum[k]) {
                System.out.println(ANSI_RED + "Lucas " + LucasNum[k] + " = Tringle " + TriangleNum[k] + ANSI_RESET);
            } else {
                System.out.println("Lucas " + LucasNum[k] + " != Tringle " + TriangleNum[k]);
            }
        }
    }
}
