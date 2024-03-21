/*
Entrada
Cada cas consisteix en un número de l'1 al 1439

Sortida
Per cada cas es respondrà amb l'hora en format hh:mm . Si l'hora no té 0 no la poseu */
import java.util.Scanner;

public class deMinutAhora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numMinuts = input.nextInt();

        int hores = numMinuts / 60;
        int minuts = numMinuts % 60;

        String hora = String.format("%2d:%2d", hores, minuts);
        System.out.println(hora);
    }
}
