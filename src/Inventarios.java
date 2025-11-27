public class Inventarios {

    public final int vacio= 0;

    public final String jon_espada = "Espada";
    public final String jon_fantasma = "Lobo2";
    public final String jon_ejercito = "Ejército";

    public final String dragones = "Dragones";
    public final String danny_ejercitos = "Ejército";
    public final String jorah = "Jorah";

    public int[] inventarioDanny (int objeto){


        int[] inventario = new int[3];

        inventario[0] = dragones;
        inventario[1] = danny_ejercitos;
        inventario[2] = jorah;

        if (objeto == 1){

            inventario[0] = vacio;

        }


        return inventario;
    }
}
