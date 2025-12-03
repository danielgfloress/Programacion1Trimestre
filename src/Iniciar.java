import java.util.Scanner;

public class Iniciar {

    public static void main(String[] args) {

        final String RESET = "\u001B[0m";
        final String YELLOW = "\u001B[33m";

        Juego_de_Tronos iniciar = new Juego_de_Tronos();
        Scanner sc = new Scanner(System.in);

        String no = "NO";
        String palabra;

        do {

            iniciar.juegoTrono();

            System.out.println(YELLOW + "¿Quieres volver a jugar?  \nSi no quieres volver a jugar escribe no, si quieres volver a jugar escribe lo que quieras " + RESET);
            palabra = sc.nextLine();


        }while(!palabra.equalsIgnoreCase(no));

    }

}