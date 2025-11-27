import java.util.Scanner;

public class Batallas {

    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";

    imprimirDespacio imprimir = new imprimirDespacio();
    RefactorizarTexto ref = new RefactorizarTexto();

    public void batallaBahia(){

        Scanner sc = new Scanner(System.in);

        int opcion;

        imprimir.imprimirLento("Batalla Bahia: ", 10);
        System.out.println("ELIGE QUE QUIERES HACER:");
        System.out.println(RED + "1. Atacar de día" + RESET);
        System.out.println(YELLOW + "2.Atacar de noche " + RESET);
        System.out.println(GREEN + "3. Usar uno de los objetos para atacar" + RESET);
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:

                imprimir.imprimirLento(YELLOW + "HAS ELEGIDO ATACAR DE DÍA" + RESET, 10);

        }


    }

}
