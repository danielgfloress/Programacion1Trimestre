public class Dragon {

    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";
    imprimirDespacio imprimir = new imprimirDespacio();

    public void dragonOpcion(int a){

        if (a==1){

            imprimir.imprimirLento(YELLOW + "HAS ELEGIDO QUEMAR ASTAPOR Y HAS DEBILITADO TU EJÉRCITO QUE NO HAS PODIDO AUMENTAR YA QUE LES HAS QUEMADO A TODOS. HAS PODIDO IR A DESMBARCO PERO SIN DRAGONES Y CON UN EJÉRCITO DÉBIL POR LO QUE TE HAN DERROTADO EN EL CAMPO DE BATALLA" + RESET, 10);
            imprimir.imprimirLento(RED + "\nHAS PERDIDO" + RESET,10);

        } else if (a==2) {



        }else{

            System.out.println("Has intentado hacer otra cosa para evitar las dos opciones y como castigo han derribado a tu dragón contigo encima");
            System.out.println(RED +"HAS PERDIDO"+RESET);

        }

    }
}
