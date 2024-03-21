/*
Entrada
Hi ha diverses línies. La última línea té un 0, que NO s'ha de processar

Sortida
Per cada cas de prova caldrà respondre: El nombre introduït més un.
 */

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;
        int resposta = 0;
        while(num != 0){
            num = input.nextInt();
            if (num == 0){
                break;
            }
            resposta = num + 1;
            System.out.println(resposta);
        }

    }
}
