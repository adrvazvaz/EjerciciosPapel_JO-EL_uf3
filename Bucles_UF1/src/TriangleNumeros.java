
import java.util.Scanner;

public class TriangleNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                if (j > 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}