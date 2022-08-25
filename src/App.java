import java.util.*;

public class App {
    int a = 2, b = 1, c, i;
 
    public static void main(String[] args) {
        App obj = new App();
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of lucas series:");
        int len = in.nextInt();
        int[] LucasNum = new int[len];
        int j = 0;
        for (obj.i = 1; obj.i <= len; obj.i++) {
            obj.c = obj.a + obj.b;
            // if(obj.i == 1){
            // System.out.print(obj.a + " "); System.out.print(obj.b + " ");
            // }
            LucasNum[j] = obj.c;
            // System.out.print(Luc[j] + " ");
            obj.a = obj.b;
            obj.b = obj.c;
            j++;
        }

        System.out.print(System.lineSeparator());
        for (int k = 0; k < len; k++) {
            System.out.print(LucasNum[k] + " ");
        }

        for (int k = 0; k < len; k++) {

        }
    }
}
