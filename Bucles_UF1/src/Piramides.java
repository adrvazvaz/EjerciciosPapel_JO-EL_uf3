/*
Donada una quanitat de piràmides p (amb p>=1) i una alçada a, mostrar les p piràmides d'alçada a.

Entrada
Cada cas de prova tindrà una línia amb dos valors: la quantitat de piràmides (p) i l'alçada de cada piràmide (a), separats per un espai en blanc.

Sortida
Per cada cas de prova es mostraran les piràmides amb l'alçada corresponent seguint el model de l'exemple. */
import java.util.Scanner;

public class Piramides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numP = input.nextInt();
        int alcada = input.nextInt();

        char[][] matriu = new char[alcada+1][alcada*2+1];

        for (int i = 0; i < numP; i++) {
            for (int j = 0; j < alcada+1; j++) {
                for (int k = 0; k < alcada*2+1; k++) {
                    matriu[j][k] = '*';
                }
            }
            for (int j = 0; j <  numP; j++) {

            }
        }





    }
}
