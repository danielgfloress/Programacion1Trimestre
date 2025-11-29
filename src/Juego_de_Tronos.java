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
        Dragon dragones = new Dragon();
        boolean resultadoDelAhorcado;

        int opciones;
        int objetos;
        int a = 1;
        int b = 2;
        int c = 3;
        int dragon;


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
                        imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);




                    case 2:

                        inventario.inventarioDanny(b);

                        imprimir.imprimirLento(GREEN + "\nHAS ELEGIDO USAR TU EJÉRCITO" + RESET, 10);
                        imprimir.imprimirLento(GREEN + "Tu ejército se ha revelado contra ti en su pueblo y has caído en manos de su rey, prueba otros caminos si quieres llegar al trono" + RESET, 10);
                        System.out.println("HAS PERDIDO. INTÉNTALO DE NUEVO");

                        break;

                    case 3:

                        inventario.inventarioDanny(c);

                        imprimir.imprimirLento(BLUE + "HAS ELEGIDO USAR A JORAH PARA INFILTRARSE EN SU CASTILLO" + RESET, 10);
                        imprimir.imprimirLento(BLUE + "Jorah se ha conseguido infiltrar en su castillo pero para acceder al lugar donde se encuentra el rey debe pensar rapido y elegir. Si las puertas que eliges están cerradas, hacen ruido si intentas abrirlas, a las 3 puertas que intentes abrir y estém cerradas te capturarán. TEN CUIDADO" + RESET, 10);

                        if(!mapa.ejecutarMapa()){

                        break;

                        }

                        imprimir.imprimirLento(BLUE + "\nTE HAS COLADO EN LA HABITACIÓN DEL REY Y HAS CONSEGUIDO CONQUISTAR LA CIUDAD GRACIAS A JORAH ", 10);

                        imprimir.imprimirLento(BLUE + "\n\nENHORABUENA, HAS CONSEGUIDO HACERTE CON LA BAHÍA DE LOS ESCLAVOS Y TU EJÉRCITO HA INCREMENTADO SU FUERZA Y SE HA HECHO MÁS GRANDE" + RESET, 10);
                        imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);

                    default:
                        System.out.println("Ese objeto no está en tu inventario");
                        System.out.println("La próxima vez elige una opción correcta");
                        break;
                }

                case 2:

                imprimir.imprimirLento("\n\nEstás de camino a la Yunkai, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento("\n\n\nHAS LLEGADO A YUNKAI\n", 10);
                    imprimir.imprimirLento("Conquista YUNKAI, A POR TODAS", 10);
                    imprimir.imprimirLento("Usa algo del inventario para atacar\n", 10);

                    System.out.println(Arrays.toString(inventario.inventarioDanny(0)));
                    objetos = sc.nextInt();

                    switch (objetos){
                        case 1:
                            inventario.inventarioDanny(a);

                            imprimir.imprimirLento(RED + "HAS ELEGIDO USAR TUS 3 DRAGONES EN UNA CIUDAD DE ARENA DONDE TUS DRAGONES NADA MÁS ENTRAR SE HAN QUEDADO CIEGOS Y SE HAN CAÍDO CONTIGO MONTADA EN UNO DE ELLOS"+ RESET,10);
                            imprimir.imprimirLento(RED + "HAS PERDIDO. VUELVE A INTENTARLO"+ RESET,10);

                            break;

                        case 2:

                            inventario.inventarioDanny(b);

                            imprimir.imprimirLento(GREEN + "HAS ELEGIDO USAR TU EJÉRCITO DE ESCLAVOS Y HA COMENZADO LA GUERRA EN YUNKAI\n\n" + RESET, 10);
                            imprimir.imprimirLento(GREEN + "TRAS TRES DÍAS DE BATALLA TU EJÉRCITO HA SIDO CAPAZ DE VENCER AL PUEBLO DE YUNKAI" + RESET, 10);
                            imprimir.imprimirLento(GREEN + "SIN EMBARGO...\n HAS PERDIDO TU EJÉRCITO Y TODAVÍA TE QUEDA HACERTE CON EL TRONO DE HIERRO, TEN CUIDADO CON TUS PRÓXIMAS ELECCIONES "+RESET, 10);
                            imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);


                            break;

                        case 3:

                            inventario.inventarioDanny(c);

                            imprimir.imprimirLento(BLUE + "HAS ELEGIDO MANDAR A JORAH A EXPLORAR YUNKAI Y SE HA INFILTRADO EN SU CASTILLO, PERO LA PUERTA DEL REY ES UNA PUERTA MÁGICA QUE SE ABRE CON UN ACERTIJO",10);
                            resultadoDelAhorcado = juego.jugarAhorcado(4);

                            if (!resultadoDelAhorcado){

                                juego.perderTexto();
                                break;

                            }

                            imprimir.imprimirLento(BLUE + "HAS ACERTADO EL ACERTIJO Y JORAH TIENE UNA PELEA CARA A CARA CON EL REY CUANDO DE REPENTE...\nE DESHACE DE ÉL EN UN ABRIR Y CERRAR DE OJOARREBATANDOLE LA CORONA Y ENTREGANDOTELA JUSTO ANTES DE MORIR...\nEN SU PELEA CON EL REY HABÍA SUFRIDO GRAVES HERIDAS Y HA FALLECIDO, PERO AHORA NO HAY TIEMPO DE PENSAR EN ESO" + RESET, 10);
                            imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);


                            break;
                    }

                    break;

                case 3:

                imprimir.imprimirLento("\n\nEstás de camino a Astapor, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento("\n\n\nHAS LLEGADO A ASTAPOR\n", 10);
                    imprimir.imprimirLento("Conquista ASTAPOR, A POR TODAS", 10);
                    imprimir.imprimirLento("Usa algo del inventario para atacar\n", 10);

                    System.out.println(Arrays.toString(inventario.inventarioDanny(0)));
                    objetos = sc.nextInt();

                    switch (objetos) {

                        case 1:
                            inventario.inventarioDanny(a);

                            imprimir.imprimirLento(RED + "\nHAS ELEGIDO USAR TUS 3 DRAGONES, PERO TE DAS CUENTA DE QUE SI QUEMAS LA CIUDAD QUEMARÁS TAMBIÉN A OTRA GENTE QUE PUEDES INCORPORAR A TU EJÉRCITO, ELIGE QUE QUIERES HACER",10);
                            System.out.println(YELLOW + "1. QUEMAR LA CIUDAD" + RESET);
                            System.out.println(GREEN + "2. INTENTAR LLEGAR CON EL DRAGÓN AL CENTRO DE LA CIUDAD Y HACERTE CON LA CORONA");
                            dragon = sc.nextInt();

                            if(dragon == 1){

                                dragones.dragonOpcion(dragon);

                                break;

                            }else if(dragon == 2){

                                dragones.dragonOpcion(dragon);

                            }else{

                                dragones.dragonOpcion(dragon);

                                break;
                            }

                            break;

                        case 2:


                            break;

                        case 3:


                            break;

                    }

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



        }else{

            imprimir.imprimirLento(BLUE + "ESO NO ES UN PERSONAJE" + RESET, 10);

        }



        imprimir.imprimirLento(RED + "\n\n=========FIN DEL JUEGO=========" +RESET,100);


    }

}
