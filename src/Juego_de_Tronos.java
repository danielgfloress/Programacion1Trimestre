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


        System.out.println("\nComienza la aventura y tienes que hacerte con el trono de hierro, consigue el personaje que más te guste e intenta hacerte con el trono de hierro superando todos los peligros que aparecen por el camino.\n");
        System.out.println(YELLOW + "Elige un personaje: " + RESET);
        System.out.println(GREEN + "1. Jon Nieve" + RESET);
        System.out.println(RED + "2. Daenerys Targaryen" + RESET);
        System.out.println(BLUE + "3. El rey de la Noche" +  RESET);
        opciones = sc.nextInt();

        if (opciones == 1) {

            int opciones1;


            System.out.println("\n\n\nHas elegido a Jon Nieve, te encuantras en El Muro y posees:\n");
            System.out.println(RED + "ESPADA DE JON NIEVE" + RESET);
            System.out.println(BLUE + "LOBO BLANCO (FANTASMA)" + RESET);
            System.out.println(GREEN + "EJÉRCITO DEL NORTE" + RESET);
            System.out.println("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ");
            System.out.println(RED + "1. Roca Dragón" + RESET);
            System.out.println(YELLOW + "2. Nido de Águilas" + RESET);
            System.out.println(BLUE + "3. Invernalia" + RESET);
            opciones1 = sc.nextInt();

            if (opciones1 == 1) {

                System.out.println("\n\nEstás de camino a Roca Dragón. ");

            }


        }


        else if (opciones == 2) {

            int opciones2;

            System.out.println("\n\n\nHas elegido a Daenerys Tragaryen, te encuentras en Qarth y posees:\n ");
            System.out.println(RED + "3 DRAGONES" + RESET);
            System.out.println(BLUE + "EJÉRCITO DE ESCLAVOS" + RESET);
            System.out.println(GREEN + "JORAH (GURDAESPALDAS)" + RESET);
            System.out.println("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ");
            System.out.println(RED + "1. Bahia de los esclavos" + RESET);
            System.out.println(YELLOW + "2. Yunkai " + RESET);
            System.out.println(BLUE + "3. Astapor" + RESET);
            opciones2 = sc.nextInt();

            if (opciones2 == 1) {



            }


        }

        else if (opciones == 3) {

            int opciones3;

            System.out.println("\n\n\nHas elegido al Rey de la Noche, te encuentras al norte de El Muro y posees:\n ");
            System.out.println(BLUE + "LANZA CONGELADA" + RESET);
            System.out.println(RED + "PODER DE RESURRECCIÓN" + RESET);
            System.out.println(GREEN + "DRAGÓN REVIVIDO" + RESET);
            System.out.println("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ");
            System.out.println(BLUE + "1. El Muro" + RESET);
            System.out.println(YELLOW + "2. Pueblo de los salvajes " + RESET);
            System.out.println(RED + "3. Casa Craster" + RESET);
            opciones3 = sc.nextInt();

            if(opciones3 == 1){



            }

        }

    }
}
