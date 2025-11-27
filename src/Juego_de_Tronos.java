import java.util.Arrays;
import java.util.Scanner;


public class Juego_de_Tronos {
    public static void main(String[] args) {

        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";

        Scanner sc = new Scanner(System.in);
        juegoAhorcado juego = new juegoAhorcado();
        imprimirDespacio imprimir = new imprimirDespacio();
        RefactorizarTexto ref = new RefactorizarTexto();
        Inventarios inventario = new Inventarios();
        MapaCastillo mapa = new MapaCastillo();
        boolean resultadoDelAhorcado;

        int opciones;
        int objetos;
        int a = 1;
        int b = 2;
        int c = 3;


        imprimir.imprimirLento("\nComienza la aventura y tienes que hacerte con el trono de hierro, consigue el personaje que más te guste e intenta hacerte con el trono de hierro superando todos los peligros que aparecen por el camino.\n", 10);

        System.out.println(YELLOW + "Elige un personaje: " + RESET);

        System.out.println(GREEN + "1. Jon Nieve" + RESET);
        System.out.println(RED + "2. Daenerys Targaryen" + RESET);
        System.out.println(BLUE + "3. El rey de la Noche" +  RESET);
        opciones = sc.nextInt();

        if (opciones == 1) {

            int opciones1;


            imprimir.imprimirLento("\n\n\nHas elegido a Jon Nieve, te encuantras en El Muro y posees:\n", 10);

            System.out.println(RED + "ESPADA DE JON NIEVE (ESPADA)" + RESET);
            System.out.println(BLUE + "LOBO BLANCO (FANTASMA)" + RESET);
            System.out.println(GREEN + "EJÉRCITO DEL NORTE (EJÉRCITO)" + RESET);

            imprimir.imprimirLento("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ", 10);

            System.out.println(RED + "1. Roca Dragón" + RESET);
            System.out.println(YELLOW + "2. Nido de Águilas" + RESET);
            System.out.println(BLUE + "3. Invernalia" + RESET);
            opciones1 = sc.nextInt();

            switch (opciones1) {
                case 1:
                imprimir.imprimirLento("\n\nEstás de camino a Roca Dragón, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(a);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }

                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);

                    break;

                case 2:
                imprimir.imprimirLento("\n\nEstás de camino al Nido de Águilas, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);

                    break;

                case 3:
                imprimir.imprimirLento("\n\nEstás de camino a Invernalia, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);

                    break;

                default:

                    ref.opcionIncorrecta();

                    break;

            }

        }


        else if (opciones == 2) {

            int opciones2;

            imprimir.imprimirLento("\n\n\nHas elegido a Daenerys Tragaryen, te encuentras en Qarth y posees:\n ", 10);

            System.out.println(RED + "3 DRAGONES" + RESET);
            System.out.println(BLUE + "EJÉRCITO DE ESCLAVOS" + RESET);
            System.out.println(GREEN + "JORAH (GURDAESPALDAS)" + RESET);

            imprimir.imprimirLento("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ", 10);

            System.out.println(RED + "1. Bahia de los esclavos" + RESET);
            System.out.println(YELLOW + "2. Yunkai " + RESET);
            System.out.println(BLUE + "3. Astapor" + RESET);
            opciones2 = sc.nextInt();

            switch (opciones2){

                case 1:
                imprimir.imprimirLento("\n\nEstás de camino a la Bahía de los esclavos, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(a);

                if (!resultadoDelAhorcado){

                    juego.perderTexto();
                    break;

                }

                imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente y sigues tu camino hacia la Bahía de los esclavos", 10);
                imprimir.imprimirLento("\n\n\nHAS LLEGADO A LA BAHÍA DE LOS ESCLAVOS\n", 10);
                imprimir.imprimirLento("Conquista la Bahía de los esclavos, A POR TODAS", 10);
                imprimir.imprimirLento("Usa algo del inventario para atacar\n", 10);

                System.out.println(Arrays.toString(inventario.inventarioDanny(0)));

                objetos = sc.nextInt();

                switch (objetos){

                    case 1:

                        inventario.inventarioDanny(a);

                        imprimir.imprimirLento(RED + "\nHAS ELEGIDO USAR A TUS DRAGONES\n" + RESET, 10);
                        imprimir.imprimirLento(RED + "La batalla ha comenzado y llegas con tus dragones. El pueblo de la Bahía de los esclavos se queda aterrorizado y comienzas a quemar todo lo que te encuentras en tu camino derrotando a su ejército y haciéndote con la Bahía de los esclavos. Sin embargo, derrotan a tus dragones y avanzas sin ellos." + RESET, 10);


                    case 2:

                        inventario.inventarioDanny(b);

                        imprimir.imprimirLento(GREEN + "\nHAS ELEGIDO USAR TU EJÉRCITO" + RESET, 10);
                        imprimir.imprimirLento(GREEN + "Tu ejército se ha revelado contra ti en su pueblo y has caído en manos de su rey, prueba otros caminos si quieres llegar al trono" + RESET, 10);
                        System.out.println(Arrays.toString(inventario.inventarioDanny(b)));

                        break;

                    case 3:

                        inventario.inventarioDanny(c);

                        imprimir.imprimirLento(BLUE + "HAS ELEGIDO USAR A JORAH PARA INFILTRARSE EN SU CASTILLO" + RESET, 10);
                        imprimir.imprimirLento(BLUE + "Jorah se ha conseguido infiltrar en su castillo pero para acceder al lugar donde se encuentra el rey debe pensar rapido y elegir. Si las puertas que eliges están cerradas y hacen ruido si intentas abrirlas, a las 3 puertas que intentes abrir y estém cerradas te capturarán. TEN CUIDADO" + RESET, 10);

                        if(!mapa.ejecutarMapa()){

                        break;

                        }

                        imprimir.imprimirLento(BLUE + "\nTE HAS COLADO EN LA HABITACIÓN DEL REY Y HAS CONSEGUIDO CONQUISTAR LA CIUDAD GRACIAS A JORAH ", 10);




                        break;

                }





                break;
                case 2:

                imprimir.imprimirLento("\n\nEstás de camino a la Yunkai, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);


                break;
                case 3:

                imprimir.imprimirLento("\n\nEstás de camino a la Astapor, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);



                    break;

                default:

                    ref.opcionIncorrecta();
                    break;
            }




        }

        else if (opciones == 3) {

            int opciones3;

            imprimir.imprimirLento("\n\n\nHas elegido al Rey de la Noche, te encuentras al norte de El Muro y posees:\n ",10);

            System.out.println(BLUE + "LANZA CONGELADA" + RESET);
            System.out.println(RED + "PODER DE RESURRECCIÓN" + RESET);
            System.out.println(GREEN + "DRAGÓN REVIVIDO" + RESET);

            imprimir.imprimirLento("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ", 10);

            System.out.println(BLUE + "1. El Muro" + RESET);
            System.out.println(YELLOW + "2. Pueblo de los salvajes " + RESET);
            System.out.println(RED + "3. Casa Craster" + RESET);
            opciones3 = sc.nextInt();

            switch (opciones3){

                case 1:

                imprimir.imprimirLento("\n\nEstás de camino a El Muro, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(a);


                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);


                break;
                case 2:

                imprimir.imprimirLento("\n\nEstás de camino al Pueblo de los salvajes, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);


                break;
                case 3:

                imprimir.imprimirLento("\n\nEstás de camino a la Casa Craster, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);


                break;

                default:

                    ref.opcionIncorrecta();
                    break;
            }

        }


    }

}
