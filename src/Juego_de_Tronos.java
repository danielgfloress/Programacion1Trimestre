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
        BatallaFinal batalla = new BatallaFinal();
        JuegoContrasena juegoContrasena = new JuegoContrasena();
        boolean resultadoDelAhorcado;

        int opciones;
        int objetos;
        int a = 1;
        int b = 2;
        int c = 3;
        int dragon;
        boolean batallaRey;


        imprimir.imprimirLento("\nComienza la aventura y tienes que hacerte con el trono de hierro, consigue el personaje que más te guste e intenta hacerte con el trono de hierro superando todos los peligros que aparecen por el camino.\n", 10);

        System.out.println(YELLOW + "Elige un personaje: " + RESET);

        System.out.println(GREEN + "1. Jon Nieve" + RESET);
        System.out.println(RED + "2. Daenerys Targaryen" + RESET);
        System.out.println(BLUE + "3. El rey de la Noche" +  RESET);

        batalla.leerEntero();

        opciones = sc.nextInt();

        if (opciones == 1) {

            int opciones1;


            imprimir.imprimirLento("\n\n\nHas elegido a Jon Nieve, te encuantras en El Muro y posees:\n", 10);

            System.out.println(RED + "ESPADA DE JON NIEVE" + RESET);
            System.out.println(BLUE + "LOBO BLANCO (FANTASMA)" + RESET);
            System.out.println(GREEN + "EJÉRCITO DEL NORTE" + RESET);

            imprimir.imprimirLento("\n\nAvanza con tus refuerzos, pero antes debes escoger por donde quieres ir.\n ", 10);

            System.out.println(RED + "1. Roca Dragón" + RESET);
            System.out.println(YELLOW + "2. Nido de Águilas" + RESET);
            System.out.println(BLUE + "3. Invernalia" + RESET);

            batalla.leerEntero();

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
                    imprimir.imprimirLento(GREEN + "\n\nHas llegado a Roca Dragón pero es una ciudad muy bien protegida y con un ejército muy poderoso y grande"+ RESET,10);
                    System.out.println(GREEN + "Elige un objeto de Jon para enfrentarte a ellos" + RESET);

                    System.out.println(Arrays.toString(inventario.inventarioJon(0)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos) {

                        case 1:

                            inventario.inventarioJon(a);

                            imprimir.imprimirLento(RED + "\nEstás en la batalla y el rey de Roca Dragón va corriendo hacia ti para pelear. Sacas tu espada y te dispones a traspasarle con tu espada cuando... \nAPARECE UN DRAGÓN y el rey se va corriendo, ahora estás tu con el dragón pero tu espada es la más poderosa de los 7 reinos y acabas con el. Todo el pueblo de Roca Dragón te da las gracias y se arrodillan ante ti. Tu ejército crece y tu fama también." + RESET, 10);
                            imprimir.imprimirLento(RED + "Ahora todos te tienen miedo, A POR EL TRONO"+RESET , 10);

                            imprimir.imprimirLento(GREEN + "\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío y cuando has ido a sacar la espada te han atacado y han acabado con tu vida."+RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);
                                    break;

                                case 2:

                                    inventario.inventarioJon(b);

                                    imprimir.imprimirLento(GREEN + "\nHas elegido usar a Fantasma\nSueltas a fantasma a las afueras de Desembarco e inspecciona la zona. Encuentra una palanca con la que se puede bajar la puerta y acceder.\nLos guardias le pillan...\n¡Pero echa a correr y salta hacia la palanca activándola y dejándo pasar a todas tus tropas\n" + RESET, 10);
                                    imprimir.imprimirLento(RED + "Empieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu ejército del Norte que es el más poderoso de los 7 Reinos y has conseguido entrar en la muralla de Desembarco. Ahora vas a por el Rey a reclamar tu corona\n\nMUCHA SUERTE" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    ref.opcionIncorrecta();
                                    break;

                            }

                            break;

                        case 2:

                            imprimir.imprimirLento(YELLOW + "Has usado a tu lobo (Fantasma), pero rápidamente le han pillado los guardias intentándo colarse y le han asesinado. Como consecuencia el resto de lobos de tus filas te ha atacado y te han devorado." + RESET,10);
                            System.out.println(RED + "HAS PERDIDO" + RESET);

                            break;

                        case 3:

                            imprimir.imprimirLento(YELLOW + "Tu ejército no es lo suficientemente fuerte para conquistar Roca Dragón"+ RESET,10);
                            System.out.println(RED + "HAS PERDIDO" + RESET);

                            break;

                        default:

                            ref.opcionIncorrecta();
                            break;

                    }


                    break;

                case 2:
                imprimir.imprimirLento("\n\nEstás de camino al Nido de Águilas, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento(BLUE + "\n\nHas llegado al Nido de Águilas, la que se encuentra en el trono es tu tía, sin embargo, no está dispuesta a dejarte pasar ni a darte tu ejército"+ RESET,10);
                    System.out.println(GREEN + "Elige un objeto de Jon para enfrentarte a ellos" + RESET);

                    System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();


                    switch (objetos) {

                        case 1:
                            inventario.inventarioJon(a);

                            imprimir.imprimirLento(RED + "¡¿Has usado la espada contra tu tía?!, tu pueblo te destierra ya que un rey jamás buscaría esa opción contra sus familiares." + RESET, 10);
                            System.out.println(RED + "HAS PERDIDO" +RESET);

                            break;

                        case 2:

                            inventario.inventarioJon(b);
                            imprimir.imprimirLento(YELLOW + "Has usado a Fantasma, ¡BUENA ELECCIÓN!, ha descubierto la Puerta de la Luna, es una puerta secreta y vas hacia ella." + RESET,10);
                            imprimir.imprimirLento(YELLOW + "\n\nLlegas a la Puerta de la luna y...\n¡¡¡TIENE UNA CONTRASEÑA!!!" + RESET, 10);

                            boolean contra = juegoContrasena.contrasena();

                            if (!contra){

                                juego.perderTexto();
                                break;

                            }

                            imprimir.imprimirLento(YELLOW + "Has conseguido entrar en el Nido de Águilas y tras mucho dialogar con tu tí ha cedido a prestarte y ejército para conquistar Desembarco."+ RESET,10);
                            System.out.println(GREEN + "A POR ELLOS REY"+ RESET);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                                System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                                switch (opciones) {

                                case 1:
                                    imprimir.imprimirLento(RED + "Has decidido usar la espada de Jon contra un ejército entero por lo que cuando has echado a correr contra su ejército y antes de entrar te han clavado más de 10 flechas..." + RESET,10);
                                    System.out.println(RED + "HAS PERDIDO" + RESET);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío y mientras estabas buscando a Fantasma te han tendido una emboscada."+RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                case 3:

                                    imprimir.imprimirLento(GREEN + "Has usado el ejército más poderoso de los 7 reinos y has conseguido romper sus filas plantándote en la cara del rey para enfrentarte a él.\nAcaba con él." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }



                            break;


                        case 3:

                            inventario.inventarioJon(c);

                            imprimir.imprimirLento(GREEN + "Tras mucha negociación con tu tía no habéis llegado a ningún acuerdo y has decidido usar tu ejército, el ejército del Nido de Águilas es mucho inferior al tuyo y tras la guerra has conseguido vencer, pero no tienes tiempo de que tu ejército se recupere y partes con tu lobo a Desembarco." + RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "\nHas elegido usar la espada de Jon pero para usara has tenido que colarte sin que te vean en su fortaleza, una vez allí usas la espada para decapitar al guardia que siempre va con el Rey. Prepárate para la pelea con el Rey" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                    break;

                                case 2:

                                    imprimir.imprimirLento(GREEN + "Has usado a Fantasma para inspeccionar la zona y decirte una manera de de entrar sin que los guardias te pillen...\nConsigues acceder y te topas con el Rey.\nPrepárate para la batalla con el Rey" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío, preparas el ataque como si tuvieses el ejército pero como no lo "+RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;
                    }

                    break;

                case 3:
                imprimir.imprimirLento("\n\nEstás de camino a Invernalia, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento(BLUE + "\n\nHas llegado a Invernalia, tu antigua casa donde está tu hermano gobernando."+ RESET,10);
                    System.out.println(GREEN + "Elige un objeto de Jon para enfrentarte a ellos" + RESET);

                    System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos){

                        case 1:

                            imprimir.imprimirLento(RED + "Has usado tu espada contra tu hermano...\nPero la usas para alzarla y el pueblo de invernalia y su ejército se une a ti nombrándote Rey en el Norte.",10);
                            imprimir.imprimirLento(BLUE + "A POR DESEMBARCO REY EN EL NORTE" + RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioJon(a)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío y cuando has ido a sacar la espada te han atacado y han acabado con tu vida."+RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(GREEN + "Has usado a Fantasma para inspeccionar la zona y decirte una manera de de entrar sin que los guardias te pillen...\nPero justo antes de llegar a ti " + RESET,10);



                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu ejército del Norte que es el más poderoso de los 7 Reinos y has conseguido entrar en la muralla de Desembarco. Ahora vas a por el Rey a reclamar tu corona\n\nMUCHA SUERTE" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;

                        case 2:

                            inventario.inventarioJon(b);

                            imprimir.imprimirLento(YELLOW + "Has mandado a tu lobo a inspeccionar la zona, aunque los guardias le detectan y...\nHAN RECONOCIDO A FANTASMA y te invitan a entrar, reclamas su ejército y te nombran Rey en el Norte. Lo único malo es que Fantasma ha encontrado su hábitat y no te acompañará" + RESET,10);
                            imprimir.imprimirLento(BLUE + "A POR DESEMBARCO REY EN EL NORTE" + RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioJon(b)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu espada, la cual con ella has acabado con más de 200 personas de Desembarco hasta encontrate con el Rey...\nPrepárate para la batalla\n\nMUCHA SUERTE" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío y de tanto buscarlo te has vuelto loco...\nTe han quitado el titulo de Rey en el Norte y tu gente ya no te sigue."+RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);



                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu ejército del Norte que es el más poderoso de los 7 Reinos y has conseguido entrar en la muralla de Desembarco. Ahora vas a por el Rey a reclamar tu corona\n\nMUCHA SUERTE" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;

                        case 3:
                            imprimir.imprimirLento(GREEN + "Como vas a atacar a tu hermano en tu propia ciudad, te han decapitado por traición al norte"+ RESET , 10);
                            System.out.println(RED + "HAS PERDIDO"+ RESET);

                            break;

                    }


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

            batalla.leerEntero();

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

                batalla.leerEntero();

                objetos = sc.nextInt();

                switch (objetos){

                    case 1:

                        inventario.inventarioDanny(a);

                        imprimir.imprimirLento(RED + "\nHAS ELEGIDO USAR A TUS DRAGONES\n" + RESET, 10);
                        imprimir.imprimirLento(RED + "La batalla ha comenzado y llegas con tus dragones. El pueblo de la Bahía de los esclavos se queda aterrorizado y comienzas a quemar todo lo que te encuentras en tu camino derrotando a su ejército y haciéndote con la Bahía de los esclavos. Sin embargo, derrotan a tus dragones y avanzas sin ellos." + RESET, 10);
                        imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);
                        imprimir.imprimirLento(BLUE + "A POR DESEMBARCO REINA" + RESET,10);
                        imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                        System.out.println(Arrays.toString(inventario.inventarioDanny(a)));

                        batalla.leerEntero();

                        opciones = sc.nextInt();

                        switch (opciones) {

                            case 1:

                                imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío y ya tenías todo planeado para atacar con tus 3 dragones, no has podido hacer nada poque era tarde y te han atacado..."+RESET,10);
                                imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);


                                break;

                            case 2:

                                imprimir.imprimirLento(RED + "Has elegido usar tu ejército de esclavos, has acabado con sus filas y te has conseguido plantar cara a cara con el Rey...\nPrepárate para la batalla\n\nMUCHA SUERTE" + RESET,10);
                                imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                batallaRey = batalla.batalla();

                                if (!batallaRey) {
                                    System.out.println(RED + "HAS PERDIDO" + RESET);
                                    break;
                                }

                                imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                break;

                            case 3:

                                imprimir.imprimirLento(RED + "Has elegido usar a Jorah el cual te ha ayudado a llegar a manos del Rey pero justo cuando el Rey te iba a matar se pone en medio y se sacrifica por ti. \nVenga a Jorah y acaba con él" + RESET,10);
                                imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                batallaRey = batalla.batalla();

                                if (!batallaRey) {
                                    System.out.println(RED + "HAS PERDIDO" + RESET);
                                    break;
                                }

                                imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                break;

                            default:

                                juego.perderTexto();
                                break;

                        }

                        break;
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
                        imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                        System.out.println(Arrays.toString(inventario.inventarioDanny(a)));

                        batalla.leerEntero();

                        opciones = sc.nextInt();

                        switch (opciones) {

                            case 1:

                                imprimir.imprimirLento(RED + "Has elegido usar tus dragones y has quemado toda la ciudad, lo típico de una Reina loca...\n\nTe han traicionado por loca" + RESET,10);
                                imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                break;

                            case 2:

                                imprimir.imprimirLento(RED + "Has elegido usar tu ejército que es más poderso y está más descansado que nunca. \nConsigues estar cara a cara con el Rey. \nPrepárate para pelear con el Rey" + RESET,10);
                                imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                batallaRey = batalla.batalla();

                                if (!batallaRey) {
                                    System.out.println(RED + "HAS PERDIDO" + RESET);
                                    break;
                                }

                                imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                break;

                            case 3:

                                imprimir.imprimirLento(RED + "Ese hueco de tu inventario estaba vacío , como consecuencia se han enterado y te han atacado ..."+RESET,10);
                                imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                break;

                            default:

                                juego.perderTexto();
                                break;

                        }



                        break;

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

                    batalla.leerEntero();

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
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioDanny(b)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tus dragones y vuelas hasta el centro de ciudad arrasando todo por tu camino Hasta llegar al castillo donde se encuentra el Rey. \nConsigues estar cara a cara con el Rey. \nPrepárate para pelear con el Rey" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu ejército pero ya lo habías usado anteriormente y te quedas sin un plan ofensivo.\nEn el tiempo que tardas en pensar otro plan te atacan y te derrotan" + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar a Jorah y avanzáis hasta el lugar en el que se encuentra el Rey, le mandas pelear a Jorah pero muere y ahora solo quedas tu contra él. \nAcaba con él" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }


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
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioDanny(c)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tus dragones y vuelas hasta el centro de ciudad arrasando todo por tu camino Hasta llegar al castillo donde se encuentra el Rey. \nConsigues estar cara a cara con el Rey. \nPrepárate para pelear con el Rey" + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu ejército pero sin una estrategia no te ha servido de nada por lo que te arrasan y acaban con tu ejército." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar a Jorah, pero ya no está en tus filas por lo que nadie ha diseñado una estrategia concreta para atacar Desembarco y atacas a lo loco por lo que fracasas." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;

                        default:

                            ref.opcionIncorrecta();
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

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos) {

                        case 1:
                            inventario.inventarioDanny(a);

                            imprimir.imprimirLento(RED + "\nHAS ELEGIDO USAR TUS 3 DRAGONES, PERO TE DAS CUENTA DE QUE SI QUEMAS LA CIUDAD QUEMARÁS TAMBIÉN A OTRA GENTE QUE PUEDES INCORPORAR A TU EJÉRCITO, ELIGE QUE QUIERES HACER",10);
                            System.out.println(YELLOW + "1. QUEMAR LA CIUDAD" + RESET);
                            System.out.println(GREEN + "2. INTENTAR LLEGAR CON EL DRAGÓN AL CENTRO DE LA CIUDAD Y HACERTE CON LA CORONA");

                            batalla.leerEntero();

                            dragon = sc.nextInt();

                            if(dragon == 1){

                                dragones.dragonOpcion(dragon);

                                break;

                            }else if(dragon == 2){

                                dragones.dragonOpcion(dragon);
                                imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES IR A RECLAMAR TU TRONO DE REINA LEGÍTIMA" + RESET, 10);

                                imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                                System.out.println(Arrays.toString(inventario.inventarioDanny(c)));

                                batalla.leerEntero();

                                opciones = sc.nextInt();

                                switch (opciones) {

                                    case 1:

                                        imprimir.imprimirLento(RED + "Has elegido usar tus dragones y vuelas hasta el centro de ciudad arrasando todo por tu camino Hasta llegar al castillo donde se encuentra el Rey. \nConsigues estar cara a cara con el Rey. \nPrepárate para pelear con el Rey" + RESET,10);
                                        imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                        batallaRey = batalla.batalla();

                                        if (!batallaRey) {
                                            System.out.println(RED + "HAS PERDIDO" + RESET);
                                            break;
                                        }

                                        imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                        break;

                                    case 2:

                                        imprimir.imprimirLento(RED + "Has elegido usar tu ejército y tras días de batlla has conseguido vencer y llegar cara a cara con el Rey.\nAcaba con él" + RESET,10);
                                        imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                        batallaRey = batalla.batalla();

                                        if (!batallaRey) {
                                            System.out.println(RED + "HAS PERDIDO" + RESET);
                                            break;
                                        }

                                        imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                        break;

                                    case 3:

                                        imprimir.imprimirLento(RED + "Has elegido usar a Jorah, pero ya no está en tus filas por lo que nadie ha diseñado una estrategia concreta para atacar Desembarco y atacas a lo loco por lo que fracasas." + RESET,10);
                                        imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                        break;

                                    default:

                                        juego.perderTexto();
                                        break;

                                }

                                break;

                            }else{

                                dragones.dragonOpcion(dragon);

                                break;
                            }


                        case 2:

                            imprimir.imprimirLento(GREEN + "\nTU EJÉRITO ERA MÁS PODEROSO Y HAS CONSEGUIDO HACERTE CON LA VICTORIA."+ RESET,10);
                            imprimir.imprimirLento(GREEN + "SIN EMBARGO, EN DESEMBARCO SE ESTÁN HACIENDO MÁS FUERTES Y NO HAY TIEMPO QUE PERDER TIENES QUE AVANZAR DE INMEDIATO PARA DESEMBARCO SIN TU EJÉRCITO DEBIDO AL CANSANCIO EN EL CAMPO DE BATALLA."+ RESET,10);


                            break;

                        case 3:

                            imprimir.imprimirLento(BLUE + "MALA ELECCIÓN. Han capturado a Jorah y le han torturado haste contarle todos tus planes de batalla. Les contó que atacarías cuando se hiciese de día y en cuanto se entró montó una ofensiva hacia ti que te pilla totalmente por sorpesa y te arrasa." + RESET,10);
                            System.out.println(RED + "HAS PERDIDO" +RESET);


                            break;

                        default:

                            ref.opcionIncorrecta();
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
            System.out.println(YELLOW + "2. Pueblo de los salvajes" + RESET);
            System.out.println(RED + "3. Casa Craster" + RESET);

            batalla.leerEntero();

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
                    imprimir.imprimirLento("\n\n\nHAS LLEGADO A El Muro\n", 10);
                    imprimir.imprimirLento("Conquista El Muro, vamos tu puedes!", 10);
                    imprimir.imprimirLento("\nUsa algo del inventario para atacar\n", 10);

                    System.out.println(Arrays.toString(inventario.inventarioReyNoche(0)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos){
                        case 1:
                            int decision;
                            imprimir.imprimirLento("\nHas elegido tu lanza",10);
                            imprimir.imprimirLento("\nCoges tu lanza y la tiras contra el muro",10);
                            imprimir.imprimirLento("Consigues derribar el muro y entrar", 10);
                            imprimir.imprimirLento("Qué deseas hacer",10);
                            imprimir.imprimirLento("\n1. Pasar directamente a por el rey", 10);
                            imprimir.imprimirLento("2.Acabar con todo el pueblo", 10);

                            batalla.leerEntero();

                            decision = sc.nextInt();

                            switch (decision){
                                case 1:
                                    imprimir.imprimirLento("Cuando entras te hacen una enboscada por la espalda y mueres",10);
                                    System.out.println(RED + "HAS PERDIDO" +RESET);
                                    break;

                                case 2:
                                    imprimir.imprimirLento("Has arrasado con todo el pueblo",10);
                                    imprimir.imprimirLento("Vas a por el rey y le cortas la cabeza. Has conseguido el trono",10);
                                    imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                                    imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                                    System.out.println(Arrays.toString(inventario.inventarioReyNoche(a)));

                                    batalla.leerEntero();

                                    opciones = sc.nextInt();

                                    switch (opciones) {

                                        case 1:

                                            imprimir.imprimirLento(RED + "Has elegido usar tu lanza pero ya la habías usado por lo que lanzas un cuchillo normal y no sirve de nada, por lo que te sorprenden al no congelar a nadie y acaban contigo." + RESET,10);
                                            imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                            break;

                                        case 2:

                                            imprimir.imprimirLento(RED + "Has elegido usar tu poder de resurrección en la mitad de la batalla y todos los muertos de la ciudad se unen a tu ejército permitiéndote llegar hasta el rey.\nPrepárate para la batalla." + RESET,10);
                                            imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                            batallaRey = batalla.batalla();

                                            if (!batallaRey) {
                                                System.out.println(RED + "HAS PERDIDO" + RESET);
                                                break;
                                            }

                                            imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                            break;

                                        case 3:

                                            imprimir.imprimirLento(RED + "Has elegido usar tu dragón en Desembarco y has congelado la ciudad lo que te permite pasar hasta donde está el Rey, pero justo antes de llegar a él se descongela todo y te tienes que enfrentar a él." + RESET,10);
                                            imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                            batallaRey = batalla.batalla();

                                            if (!batallaRey) {
                                                System.out.println(RED + "HAS PERDIDO" + RESET);
                                                break;
                                            }

                                            imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                            break;

                                        default:

                                            juego.perderTexto();
                                            break;

                                    }


                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }
                        case 2:
                            imprimir.imprimirLento("Has elegido usar el poder de resureccion\nPero en el muro queman a los muertos por lo tanto no ha servido para nada y tu ejercito es mas debil que el del muro",10);
                            System.out.println(RED + "HAS PERDIDO" +RESET);
                            break;

                        case 3:
                            imprimir.imprimirLento("Has elegido usar tu Dragon",10);
                            imprimir.imprimirLento("Con el derrites el muro y quemas a toda la gente que hay",10);
                            imprimir.imprimirLento("Consigues llegar al rey y quitarle el trono\nAhora el trono es tuyo",10);
                            imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioReyNoche(b)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu lanza y consigues abrir un camino helado hasta donde se encuentra el Rey  .\nPrepárate para la batalla." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu poder en mitad de la batalla y te confías en que se van a levantar, mientras te quedas esparando que se levanten van rápido a por ti y te matan." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);


                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu dragón en Desembarco y has congelado la ciudad lo que te permite pasar hasta donde está el Rey, pero justo antes de llegar a él se descongela todo y te tienes que enfrentar a él." + RESET,10);
                                    System.out.println(RED + "HAS PERDIDO"+ RESET);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }


                            break;

                        default:

                            ref.opcionIncorrecta();
                            break;
                    }

                break;
                case 2:

                imprimir.imprimirLento("\n\nEstás de camino al Pueblo de los salvajes, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(b);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento("\n\n\nHAS LLEGADO AL PUEBLO DE LOS SALVAJES\n", 10);
                    imprimir.imprimirLento("Conquista el Pueblo de los Salvajes, animo!", 10);
                    imprimir.imprimirLento("\nUsa algo del inventario para atacar\n", 10);

                    System.out.println(Arrays.toString(inventario.inventarioReyNoche(0)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos){
                        case 1:
                            imprimir.imprimirLento("\nHas elegido tu lanza",10);
                            imprimir.imprimirLento("\nLos salvajes llevan estudiandote mucho tiempo y han diseñado una defensa para tu lanza\nTe atrapan y te matan",10);
                            System.out.println(RED + "HAS PERDIDO" +RESET);

                            break;

                        case 2:
                            imprimir.imprimirLento("Has elegido usar el poder de resureccion",10);
                            imprimir.imprimirLento("Has revivido a todos lo muertos de la zona y se han aliado a tu ejercito\nTras derrotar a todos tu ejercito ha aumentado",10);
                            imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioReyNoche(b)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu lanza y consigues abrir un camino helado hasta donde se encuentra el Rey  .\nPrepárate para la batalla." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu poder en mitad de la batalla, pero ya no lo tienes y te confías en que se van a levantar, mientras te quedas esparando que se levanten van rápido a por ti y te matan." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);


                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu dragón en Desembarco y has congelado la ciudad lo que te permite pasar hasta donde está el Rey, pero justo antes de llegar a él se descongela todo y te tienes que enfrentar a él." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;

                        case 3:
                            imprimir.imprimirLento("Has elegido usar tu Dragon, que quieres hacer con el",10);
                            System.out.println(YELLOW + "1. QUEMAR LA CIUDAD" + RESET);
                            System.out.println(GREEN + "2. INTENTAR LLEGAR CON EL DRAGÓN AL CENTRO DEL PUEBLO Y HACERTE CON TODO");

                            batalla.leerEntero();

                            dragon = sc.nextInt();

                            if(dragon == 1){

                                dragones.dragonOpcion(dragon);

                                break;

                            }else if(dragon == 2){

                                dragones.dragonOpcion(dragon);
                                imprimir.imprimirLento(YELLOW + "AHORA YA PUEDES QUEDARTE CON TODO EL EJERCITO" + RESET, 10);
                                imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                                imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                                System.out.println(Arrays.toString(inventario.inventarioReyNoche(c)));

                                batalla.leerEntero();

                                opciones = sc.nextInt();

                                switch (opciones) {

                                    case 1:

                                        imprimir.imprimirLento(RED + "Has elegido usar tu lanza y consigues abrir un camino helado hasta donde se encuentra el Rey  .\nPrepárate para la batalla." + RESET,10);
                                        imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                        batallaRey = batalla.batalla();

                                        if (!batallaRey) {
                                            System.out.println(RED + "HAS PERDIDO" + RESET);
                                            break;
                                        }

                                        imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                        break;

                                    case 2:

                                        imprimir.imprimirLento(RED + "Estás peleando en la batalla de Desembarco y vas perdiendo la batalla...\n¡Usas el poder de resurrección!, tu ejército se levanta y consigues llegar donde está el Rey. Prepárate para pelear con él." + RESET,10);
                                        imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                        batallaRey = batalla.batalla();

                                        if (!batallaRey) {
                                            System.out.println(RED + "HAS PERDIDO" + RESET);
                                            break;
                                        }

                                        imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                        break;

                                    case 3:

                                        imprimir.imprimirLento(RED + "Has elegido usar tu dragón pero ya no lo tienes por lo que cuando vas a montarte en él descubres que no está  te tienden una emboscada." + RESET,10);
                                        imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                        break;

                                    default:

                                        juego.perderTexto();
                                        break;

                                }

                            }else{

                                dragones.dragonOpcion(dragon);

                                break;
                            }
                            break;

                        default:
                            ref.opcionIncorrecta();
                            break;
                    }


                break;
                case 3:

                imprimir.imprimirLento("\n\nEstás de camino a la Casa Craster, pero te encuentras con unos caballeros que no te dejan pasar. Para pasar debes acertar el ahorcado.", 10);
                resultadoDelAhorcado = juego.jugarAhorcado(c);

                    if (!resultadoDelAhorcado){

                        juego.perderTexto();
                        break;

                    }


                    imprimir.imprimirLento("\nHas conseguido superar a los caballeros sigilosamente", 10);
                    imprimir.imprimirLento("\n\n\nHAS LLEGADO A LA CASA CRASTER\n", 10);
                    imprimir.imprimirLento("Conquista la casa craster para hacerte con la corona, a por ellos!", 10);
                    imprimir.imprimirLento("\nUsa algo del inventario para atacar\n", 10);

                    System.out.println(Arrays.toString(inventario.inventarioReyNoche(0)));

                    batalla.leerEntero();

                    objetos = sc.nextInt();

                    switch (objetos){
                        case 1:
                            imprimir.imprimirLento("\nHas elegido tu lanza",10);
                            imprimir.imprimirLento("Antes de entrar hay una puerta con una contraseña debes de descubrirla para poder entrar y acabar con todos", 10);
                            imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioReyNoche(a)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu lanza pero ya la habías usado por lo que lanzas un cuchillo normal y no sirve de nada, por lo que te sorprenden al no congelar a nadie y acaban contigo." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu poder de resurrección en la mitad de la batalla y todos los muertos de la ciudad se unen a tu ejército permitiéndote llegar hasta el rey.\nPrepárate para la batalla." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);


                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu dragón en Desembarco, quemas todo y te bajas justo antes de encontrarte con el Rey\nPrepárate para pelear contra él." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }

                            break;


                        case 2:
                            imprimir.imprimirLento("Has elegido usar el poder de resureccion",10);
                            imprimir.imprimirLento("Todos los hijos varones se han convertido en caminantes",10);
                            imprimir.imprimirLento("Llegas a un acuerdo para quedarse a todos sus hijos",10);
                            imprimir.imprimirLento(BLUE + "\nDirígete a Desembarco\n"+RESET,10);
                            imprimir.imprimirLento(GREEN + "\n\nHas llegado a Desembarco del Rey, ahora usa otro objeto para acceder al trono. "+RESET,10);
                            System.out.println(Arrays.toString(inventario.inventarioReyNoche(b)));

                            batalla.leerEntero();

                            opciones = sc.nextInt();

                            switch (opciones) {

                                case 1:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu lanza con la que atraviesas su ejército." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                case 2:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu poder en mitad de la batalla, pero ya no lo tienes y te confías en que se van a levantar, mientras te quedas esparando que se levanten van rápido a por ti y te matan." + RESET,10);
                                    imprimir.imprimirLento(RED + "HAS PERDIDO"+RESET,100);


                                    break;

                                case 3:

                                    imprimir.imprimirLento(RED + "Has elegido usar tu dragón en Desembarco y has congelado la ciudad lo que te permite pasar hasta donde está el Rey, pero justo antes de llegar a él se descongela todo y te tienes que enfrentar a él." + RESET,10);
                                    imprimir.imprimirLento(RED + "\nEmpieza la batalla con el Rey"+RESET,100);

                                    batallaRey = batalla.batalla();

                                    if (!batallaRey) {
                                        System.out.println(RED + "HAS PERDIDO" + RESET);
                                        break;
                                    }

                                    imprimir.imprimirLento(GREEN + "=====HAS GANADO REY JON=====" + RESET,100);

                                    break;

                                default:

                                    juego.perderTexto();
                                    break;

                            }


                            break;

                        case 3:
                            imprimir.imprimirLento("Has elegido usar tu Dragon",10);
                            imprimir.imprimirLento("Quemas todo y te quedas sin los herederos del rey\nHas un perdido un aliado y te matan por arrasar con todo",10);
                            System.out.println(RED + "HAS PERDIDO" +RESET);

                            break;

                        default:
                            ref.opcionIncorrecta();
                            break;
                    }


                break;

                default:

                    ref.opcionIncorrecta();
                    break;
            }



        }else{

            ref.opcionIncorrecta();

        }



        imprimir.imprimirLento(RED + "\n\n=========FIN DEL JUEGO=========" +RESET,100);


    }

}
