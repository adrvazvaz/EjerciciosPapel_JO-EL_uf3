/*
En el videojoc The Witcher hi ha un petit minijoc anomenat Poker de Daus. Farem una petita variant d’aquest joc.

Tindrem 4 daus. Hem de comparar si hi ha alguna parella, algun trio o algún poker (els 4 iguals)

Pista: Les combinacions possibles si tens 4 daus a,b,c i d són: Parelles: ab, ac, ad, bc, bd, cd Trios: abc, abd, acd, bcd Poker: abcd

Entrada
Cada cas és d'una línea, i conté 4 números, els 4 daus, entre 1 i 6. No és necessari mostrar per exemple “PARELLA de 4s”,
només “PARELLA” No consideris dobles parelles ni escales.

Sortida
Mostrarem per pantalla “RES”, “PARELLA”, “TRIO” o “POKER” depenent del que hagi passat. */

import java.util.Scanner;

public class PokerDaus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();

        if (d1 == d2 && d2 == d3 && d3 == d4) {
            System.out.println("POKER");
        } else if (d1 == d2 && d2 == d3 || d2 == d3 && d3 == d4 || d1 == d3 && d3 == d4 || d1 == d2 && d2 == d4) {
            System.out.println("TRIO");
        } else if (d1 == d2 || d1 == d3 || d1 == d4 || d2 == d3 || d2 == d4 || d3 == d4) {
            System.out.println("PARELLA");
        } else {
            System.out.println("RES");
        }
    }
}
