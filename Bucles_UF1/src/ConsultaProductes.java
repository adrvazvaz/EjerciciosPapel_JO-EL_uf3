/*
Entrada
L'entrada comença amb un número N que indica el nombre de productes a comprar.
A continuació vindran N línies on tindrem el nom del producte (String) i el preu del producte (float)
Finalment tindrem un número P que indica el producte que volem consultar.

Sortida
Cal mostrar 3 línies, amb el producte més car, més barat i el que ocupa la posició P si ordenem del més car al més barat.
La primera línia mostrarà "EL MES CAR: " seguit del nom i el preu del producte, separats per un espai.
La segona línia mostrarà "EL MES BARAT: " seguit del nom i el preu del producte, separats per un espai.
La tercera línia mostrarà "EL BUSCAT: " seguit del nom i el preu del producte, separats per un espai.
*/
import java.util.*;

public class ConsultaProductes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] nomsProductes = new String[N];
        float[] preusProductes = new float[N];

        for (int i = 0; i < N; i++) {
            nomsProductes[i] = scanner.next();
            preusProductes[i] = scanner.nextFloat();
            scanner.nextLine();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (preusProductes[i] > preusProductes[j]) {

                    String tempNom = nomsProductes[i];
                    nomsProductes[i] = nomsProductes[j];
                    nomsProductes[j] = tempNom;

                    float tempPreu = preusProductes[i];
                    preusProductes[i] = preusProductes[j];
                    preusProductes[j] = tempPreu;
                }
            }
        }

        int P = scanner.nextInt();

        System.out.println("EL MES CAR: " + nomsProductes[N - 1] + " " + preusProductes[N - 1]);
        System.out.println("EL MES BARAT: " + nomsProductes[0] + " " + preusProductes[0]);
        System.out.println("EL BUSCAT: " + nomsProductes[P] + " " + preusProductes[P]);

        scanner.close();
    }
}