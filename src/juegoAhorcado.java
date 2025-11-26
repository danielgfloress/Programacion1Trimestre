import java.util.Scanner;

public class juegoAhorcado {
    public void jugarAhorcado() {

        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "DESEMBARCO";
        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) progreso[i] = '_';

        int vidas = 6;
        boolean ganado = false;

        while (vidas > 0 && !ganado) {


            imprimirLento("\nAdivina la palabra para continuar. Pista: Donde se encuentra el trono de hierro " + String.valueOf(progreso), 10);
            System.out.println("Vidas restantes: " + vidas);
            System.out.print("Ingresa una letra: ");
            char letra = Character.toUpperCase(sc.next().charAt(0));

            boolean acierto = false;


            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                vidas--;
                System.out.println("Letra incorrecta");
            } else {
                System.out.println("Letra correcta");
            }


            if (String.valueOf(progreso).equals(palabraSecreta)) {
                ganado = true;
            }
        }


        if (ganado) {
            imprimirLento("\n¡Ganaste! La palabra era: " + palabraSecreta, 10);
        } else {
            imprimirLento("\nPerdiste. La palabra era: " + palabraSecreta, 10);
        }
    }

    public static void imprimirLento(String texto, int velocidad) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
