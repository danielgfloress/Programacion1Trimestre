import java.util.Scanner;

public class BatallaFinal {

    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";

    imprimirDespacio imprimir = new imprimirDespacio();
    Scanner sc = new Scanner(System.in);

    int vidaRey = 100;
    int vidaJugador = 100;

    public boolean batalla() {

        imprimir.imprimirLento(YELLOW + "¡El Rey te espera sobre el Trono de Hierro!" + RESET, 30);

        while (vidaRey > 0 && vidaJugador > 0) {

            mostrarEstado();
            mostrarOpciones();
            int eleccion = leerEntero();

            elegirAtaque(eleccion);

            if (vidaRey <= 0) break;

            ataqueDelRey();

            if (vidaJugador <= 0) break;
        }

        if (vidaJugador <= 0) {
            imprimir.imprimirLento(RED + "\nHas muerto... El Rey sigue en el poder." + RESET, 40);
            return false;
        } else {
            imprimir.imprimirLento(GREEN + "\n¡Has vencido al Rey y el Trono es tuyo!" + RESET, 40);
            return true;
        }
    }

    void mostrarEstado() {
        imprimir.imprimirLento(BLUE + "\nTu vida: " + vidaJugador + RESET + RED+"\nVida del Rey: " + vidaRey + RESET, 20);
    }

    void mostrarOpciones() {
        System.out.println("\n¿Dónde quieres atacar?");
        System.out.println("1. Cabeza");
        System.out.println("2. Pecho");
        System.out.println("3. Piernas");
        System.out.println("4. Corazón (arriesgado)");
        System.out.print("Elige: ");
    }

    public int leerEntero() {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Introduce un número válido: ");
        }
        return sc.nextInt();
    }


    public void elegirAtaque(int opcion) {
        switch (opcion) {
            case 1: atacar(20); break;
            case 2: atacar(15); break;
            case 3: atacar(10); break;
            case 4:
                boolean acertado = Math.random() < 0.40;
                if (acertado) {
                    atacar(35, true);
                } else {
                    imprimir.imprimirLento(YELLOW + "Fallaste el ataque al corazón..." + RESET, 20);
                }
                break;
            default:
                imprimir.imprimirLento(RED + "Te equivocas atacando y pierdes el turno..." + RESET, 20);
        }
    }

    public void atacar(int dano) {
        atacar(dano,false);
    }


    public void atacar(int dano, boolean especial) {
        vidaRey -= dano;
        if (vidaRey < 0) vidaRey = 0;

        if (!especial) {
            imprimir.imprimirLento(GREEN + "Golpeas al Rey." + RESET, 20);
        } else {
            imprimir.imprimirLento(RED + "¡Impacto directo al corazón!" + RESET, 20);
        }
    }


    public void ataqueDelRey() {
        int dano = 10 + (int)(Math.random() * 15);

        imprimir.imprimirLento(YELLOW + "\nEl Rey te ataca..." + RESET, 20);

        vidaJugador -= dano;
        if (vidaJugador < 0) vidaJugador = 0;

        imprimir.imprimirLento(RED + "El Rey te hiere gravemente." + RESET, 20);
    }
}
