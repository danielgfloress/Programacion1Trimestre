import java.util.Scanner;

public class JuegoContrasena {

    public boolean contrasena() {
        Scanner sc = new Scanner(System.in);

        String contrasena = "170411";
        String adivinar;
        int intentos = 0;

        System.out.println("La contraseña tiene "+contrasena.length()+" numeros.");
        System.out.println("Su primer numero es el "+ contrasena.charAt(0));
        System.out.println("Su ultimo numero es el "+ contrasena.charAt(contrasena.length()-1));
        System.out.println();

        do {

            intentos++;

            System.out.println("¿En qué día mes y año se lanzó Juego de Tronos?");
            adivinar = sc.nextLine();

            if (contrasena.charAt(0)>adivinar.charAt(0)){
                System.out.println("El primer numero es mayor que el "+adivinar.charAt(0));
            } else if (contrasena.charAt(0)<adivinar.charAt(0)){
                System.out.println("El primer numero es menor que el "+adivinar.charAt(0));
            }

            if (contrasena.charAt(1)>adivinar.charAt(1)){
                System.out.println("El segundo numero es mayor que el "+adivinar.charAt(1));
            } else if (contrasena.charAt(1)<adivinar.charAt(1)){
                System.out.println("El segundo numero es menor que el "+adivinar.charAt(1));
            } else {
                System.out.println("Has acertado el segundo número");
            }

            if (contrasena.charAt(2)>adivinar.charAt(2)){
                System.out.println("El tercer numero es mayor que el "+adivinar.charAt(2));
            } else if (contrasena.charAt(2)<adivinar.charAt(2)){
                System.out.println("El tercer numero es menor que el "+adivinar.charAt(2));
            } else {
                System.out.println("Has acertado el tercer número");
            }

            if (contrasena.charAt(3)>adivinar.charAt(3)){
                System.out.println("El cuarto numero es mayor que el "+adivinar.charAt(3));
            } else if (contrasena.charAt(3)<adivinar.charAt(3)){
                System.out.println("El cuarto numero es menor que el "+adivinar.charAt(3));
            } else {
                System.out.println("Has acertado el cuarto número");
            }

            if (contrasena.charAt(4)>adivinar.charAt(4)){
                System.out.println("El quinto numero es mayor que el "+adivinar.charAt(4));
            } else if (contrasena.charAt(4)<adivinar.charAt(4)){
                System.out.println("El quinto numero es menor que el "+adivinar.charAt(4));
            } else {
                System.out.println("Has acertado el quinto número");
            }

            if (contrasena.charAt(5)>adivinar.charAt(5)){
                System.out.println("El sexto numero es mayor que el "+adivinar.charAt(5));
            } else if (contrasena.charAt(5)<adivinar.charAt(5)){
                System.out.println("El sexto numero es menor que el "+adivinar.charAt(5));
            }

        }while(!contrasena.equals(adivinar) && intentos != 30);

        if (intentos == 30){
            System.out.println("Se te han acabado los intentos");
            return false;
        } else {
            System.out.println("\nHas acertado la contraseña, ya puedes pasar del El Muro");
            return  true;
        }

    }

}
