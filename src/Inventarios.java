public class Inventarios {

    public final String vacio= "vacio";

    public final String jon_espada = "Espada";
    public final String jon_fantasma = "Lobo2";
    public final String jon_ejercito = "Ejército";

    public final String dragones = "Dragones";
    public final String danny_ejercitos = "Ejército";
    public final String jorah = "Jorah";

    public String[] inventarioDanny (int objeto){


        String[] inventario = new String[3];

        inventario[0] = dragones;
        inventario[1] = danny_ejercitos;
        inventario[2] = jorah;

        if (objeto == 1){

            inventario[0] = vacio;

        }


        return inventario;
    }
}
