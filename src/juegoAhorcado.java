import java.util.Scanner;

public class juegoAhorcado {
    public boolean jugarAhorcado(int a) {

        Scanner sc = new Scanner(System.in);
        imprimirDespacio imprimir = new imprimirDespacio();

        int vidas = 6;
        boolean ganado = false;
        boolean acierto = false;

        if (a==1){

            String palabraSecreta = "DESEMBARCO";
            char[] progreso = new char[palabraSecreta.length()];
            for (int i = 0; i < progreso.length; i++) progreso[i] = '_';



            while (vidas > 0 && !ganado) {


                imprimir.imprimirLento("\nAdivina la palabra para continuar. Pista: Donde se encuentra el trono de hierro " + String.valueOf(progreso), 10);
                System.out.println("Vidas restantes: " + vidas);
                System.out.print("Ingresa una letra: ");
                char letra = Character.toUpperCase(sc.next().charAt(0));




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
                imprimir.imprimirLento("\n¡Ganaste! La palabra era: " + palabraSecreta, 10);

            } else {
                imprimir.imprimirLento("\nPerdiste. La palabra era: " + palabraSecreta, 10);
            }

    }

        else if (a==2) {

            String palabraSecreta = "SALVAJES";
            char[] progreso = new char[palabraSecreta.length()];
            for (int i = 0; i < progreso.length; i++) progreso[i] = '_';



            while (vidas > 0 && !ganado) {


                imprimir.imprimirLento("\nAdivina la palabra para continuar. Pista: Como llaman a los del norte del muro" + String.valueOf(progreso), 10);
                System.out.println("Vidas restantes: " + vidas);
                System.out.print("Ingresa una letra: ");
                char letra = Character.toUpperCase(sc.next().charAt(0));




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
                imprimir.imprimirLento("\n¡Ganaste! La palabra era: " + palabraSecreta, 10);
            } else {
                imprimir.imprimirLento("\nPerdiste. La palabra era: " + palabraSecreta, 10);
            }

        } else if (a==3) {

            String palabraSecreta = "TARGARYEN";
            char[] progreso = new char[palabraSecreta.length()];
            for (int i = 0; i < progreso.length; i++) progreso[i] = '_';



            while (vidas > 0 && !ganado) {


                                    imprimir.imprimirLento("\nAdivina la palabra para continuar. Pista: La casa que viene de la antigua Valyria " + String.valueOf(progreso), 10);
                System.out.println("Vidas restantes: " + vidas);
                System.out.print("Ingresa una letra: ");
                char letra = Character.toUpperCase(sc.next().charAt(0));



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
                imprimir.imprimirLento("\n¡Ganaste! La palabra era: " + palabraSecreta, 10);
            } else {
                imprimir.imprimirLento("\nPerdiste. La palabra era: " + palabraSecreta, 10);
            }

        }

        return ganado;

    }



}
