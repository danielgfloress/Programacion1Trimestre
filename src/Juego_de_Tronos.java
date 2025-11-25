import java.util.Scanner;

public class Juego_de_Tronos {
    public static void main(String[] args) {

        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";

        Scanner sc = new Scanner(System.in);

        int opciones;


        System.out.println("Comienza la aventura y tienes que hacerte con el trono de hierro, consigue el personaje que más te guste e intenta hacerte con el trono de hierro superando todos los peligros que aparecen por el camino.\n");
        System.out.println(YELLOW + "Elige un personaje: " + RESET);
        System.out.println(GREEN + "1. Jon Nieve" + RESET);
        System.out.println(RED + "2. Daenerys Targaryen" + RESET);
        System.out.println(BLUE + "3. El rey de la noche" +  RESET);
        opciones = sc.nextInt();

        if (opciones == 1) {


            System.out.println("\n\n\nHas elegido a Jon Nieve y como recompensa has obtenido:");
            System.out.println(RED + "ESPADA DE JON NIEVE" + RESET);
            System.out.println(BLUE + "LOBO BLANCO (FANTASMA)" + RESET);
            System.out.println(GREEN + "EJÉRCITO" );
            System.out.println("\n\n");


        }


    }
}
