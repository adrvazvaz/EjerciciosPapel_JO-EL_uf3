import java.util.Scanner;

public class tresPerCinc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int replica = input.nextInt();

        for (int i = 0; i < replica; i++) {
            System.out.print(num);
        }
    }
}