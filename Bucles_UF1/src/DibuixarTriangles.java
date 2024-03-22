/*
Vol que a partir d’una alçada indicada amb un nombre, el programa escrigui tantes línies com el valor indicat.
Per cada línia es mostraran els nombres que van des de l'1 fins a un valor que indica en quina línia es troba (la primera línia serà la 1). És a dir, creixentment.

Entrada
Cada cas de prova tindrà una línia amb un nombre natural.

Sortida
Per cada cas de prova es mostrarà el triangle corresponent amb el nombre de línies indicat en l'entrada. Els valors d'una línia se separaran amb una coma "," seguida d'un espai en blanc. */
import java.util.Scanner;

public class DibuixarTriangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j >= 1; j++) {
                System.out.print(j);
                if (j > 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
