import java.util.Scanner;

public class PuntG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorG = 0;
        for (int i = 0; i < 5; i++) {
            char lletra = input.next().charAt(0);
            if (lletra == 'G') {
                contadorG++;
            }
        }
        if (contadorG > 1){
            System.out.println("PUNTOS");
        } else if (contadorG == 1) {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}

