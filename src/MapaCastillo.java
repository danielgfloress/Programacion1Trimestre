import java.util.Scanner;

public class MapaCastillo {

    public boolean ejecutarMapa() {

        Scanner sc = new Scanner(System.in);

        boolean[][] mapa = {
                {false, false, false, true},
                {true, false, true, false},
                {true, false, true, false},
                {false, true, false, false}
        };

        int fila = 1;
        int col = 0;
        int filaHabitacion = 0;
        int colHabitacion = 3;
        int contador = 5;

        System.out.println("\nMapa castillo:");
        for (int i = 0; i < mapa.length; i++) {

            for (int j = 0; j < mapa[0].length; j++) {

                if (i == fila && j == col) {

                    System.out.print(" J ");

                } else if (i == filaHabitacion && j == colHabitacion) {

                    System.out.println("Rey");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        while (true) {
            if (col == 3) {
                System.out.println("¡Has llegado a la habitación del rey!");
                return true;
            }

            System.out.println("\nMovimientos válidos:");
            System.out.println("W = Arriba, S = Abajo, A = Izquierda, D = Derecha");
            System.out.println("Q = Diagonal Arriba-Izquierda, E = Diagonal Arriba-Derecha");
            System.out.println("Z = Diagonal Abajo-Izquierda, C = Diagonal Abajo-Derecha");
            System.out.print("Indica la puerta a la que quieres ir: ");

            char mov = sc.next().toUpperCase().charAt(0);

            int nuevaFila = fila;
            int nuevaCol = col;

            switch (mov) {
                case 'W':
                    nuevaFila--;
                    break;

                case 'S':
                    nuevaFila++;
                    break;

                case 'A':
                    nuevaCol--;
                    break;

                case 'D':
                    nuevaCol++;
                    break;
                case 'Q':
                    nuevaFila--;
                    nuevaCol--;
                    break;

                case 'E':
                    nuevaFila--;
                    nuevaCol++;
                    break;
                case 'Z':
                    nuevaFila++;
                    nuevaCol--;
                    break;

                case 'C':
                    nuevaFila++;
                    nuevaCol++;
                    break;

                default:
                    System.out.println("Movimiento no válido");
                    continue;
            }

            if (nuevaFila < 0 || nuevaFila >= 4 || nuevaCol < 0 || nuevaCol >= 4) {

                System.out.println("Te sales del Castillo. Movimiento cancelado.");

            } else if (!mapa[nuevaFila][nuevaCol]) {
                System.out.println("Esa puerta estaba cerrada. Has hecho ruido.");
                contador--;

                System.out.println("Te quedan " + contador + " intentos.");

                if (contador == 0) {

                    System.out.println("Has alertado a los guardias... ¡PERDISTE!");
                    return false;

                }
            } else {

                fila = nuevaFila;
                col = nuevaCol;

            }

            System.out.println("\nMapa del castillo:");
            for (int i = 0; i < mapa.length; i++) {

                for (int j = 0; j < mapa[0].length; j++) {

                    if (i == fila && j == col) {

                        System.out.print(" J ");

                    }else if (i == filaHabitacion && j == colHabitacion) {

                        System.out.println("Habitación rey");
                    }
                    else {

                        System.out.print(" . ");

                    }
                }

                System.out.println();

            }
        }


    }

}
