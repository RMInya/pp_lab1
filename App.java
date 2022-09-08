import java.util.*;

public class App {
    int a, b, c, i, length;
    int[] lucasNum;

    public App(int length) {
        this.a = 2;
        this.b = 1;
        lucasNum = new int[length];
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public void search() {
        int number = 1;
        while (number != 0) {
            System.out.println();
            Scanner nu = new Scanner(System.in);
            System.out.println("Enter queue of Lucas Number you want to find: (0 to stop)");
            number = nu.nextInt();
            for (int k = 0; k < length + 1; k++) {

                if (k == number) {
                    System.out.println(number + " Lucas Number is " + ANSI_GREEN + lucasNum[k - 1] + ANSI_RESET);
                }
            }
        }
    }

    public void check() {

        for (int i = 0; i < length; i++) {
            int temp = 0;
            int sum = 0;
            temp = lucasNum[i];
            for (int n = 1; sum <= temp; n++) {
                int x = 0;
                sum += n;
                if (sum == temp)
                    x = 1;
                if (x == 1) {
                    System.out.print(ANSI_RED + "Lucas " + lucasNum[i] + " is triangle" + ANSI_RESET);
                    System.out.println();
                }
            }
        }
    }

    public int lucasInit() {
        int j = 0;
        App obj = new App(length);
        for (obj.i = 1; obj.i <= length; obj.i++) {
            obj.c = obj.a + obj.b;
            lucasNum[j] = obj.c;
            obj.a = obj.b;
            obj.b = obj.c;
            j++;
        }
        return 0;
    }

    public void out() {
        System.out.print(ANSI_GREEN + "Lucas Numbers: " + ANSI_RESET);
        for (int k = 0; k < length; k++) {
            System.out.print(lucasNum[k] + " ");
        }
    }

    public static void main(String[] args) {
        int len;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of lucas series:");
        len = in.nextInt();
        App obj = new App(len);
        obj.length = len;
        obj.lucasInit();
        System.out.println();
        obj.out();
        System.out.println();
        obj.check();
        System.out.println();
        obj.search();
    }
}