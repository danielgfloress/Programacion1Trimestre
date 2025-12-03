public class Inventarios {

    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";

    public final String vacio= (YELLOW +"vacio" + RESET);

    public final String jon_espada = (RED + "1. Espada"+ RESET);
    public final String jon_fantasma = (YELLOW+ "2. Lobo"+ RESET);
    public final String jon_ejercito = (GREEN +"3. Ejército"+ RESET);

    public final String dragones = (RED + "1. Dragones"+ RESET);
    public final String danny_ejercitos =(GREEN + "2. Ejército" + RESET);
    public final String jorah = (BLUE + "3. Jorah" + RESET);

    public final String lanza = (RED + "1. LANZA CONGELADA"+ RESET);
    public final String resureccion =(GREEN + "2. PODER DE RESURRECCIÓN" + RESET);
    public final String dragon_revivido = (BLUE + "3. DRAGÓN REVIVIDO" + RESET);

    public String[] inventarioDanny (int objeto){


        String[] inventario = new String[3];

        inventario[0] = dragones;
        inventario[1] = danny_ejercitos;
        inventario[2] = jorah;

        if (objeto == 1){

            inventario[0] = vacio;

        }

        if (objeto == 2){

            inventario[1] = vacio;

        }

        if (objeto == 3){

            inventario[2] = vacio;

        }


        return inventario;
    }

    public  String[] inventarioReyNoche (int objeto){

        String[] inventario = new String[3];

        inventario[0] = lanza;
        inventario[1] = resureccion;
        inventario[2] = dragon_revivido;

        if (objeto == 1){

            inventario[0] = vacio;

        }

        if (objeto == 2){

            inventario[1] = vacio;

        }

        if (objeto == 3){

            inventario[2] = vacio;

        }


        return inventario;
    }

    public String[] inventarioJon(int objetos){

        String[] inventario = new String[3];

        inventario[0] = jon_espada;
        inventario[1] = jon_fantasma;
        inventario[2] = jon_ejercito;

        if (objetos == 1){

            inventario[0] = vacio;

        }

        if (objetos == 2){

            inventario[1] = vacio;

        }

        if (objetos == 3){

            inventario[2] = vacio;

        }


        return inventario;

    }
}
