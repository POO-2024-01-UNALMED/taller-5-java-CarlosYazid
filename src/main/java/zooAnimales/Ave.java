package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal {

    protected static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    public static int total;
    protected String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        total++;
    }

    public Ave(){this(null,0,null,null,null);}

    public static int cantidadAves(){return total;}

    public String movimiento(){return "volar";}

    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones++;
        Ave nuevaAve = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
        listado.add(nuevaAve);
        return nuevaAve;
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas++;
        Ave nuevaAve = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
        listado.add(nuevaAve);
        return nuevaAve;
    }

    public String getColorPlumas() {return colorPlumas;}

    public String toString() {
        return "Mi nombre es "+ super.getNombre() + ", tengo una edad de "+ super.getEdad()+ ", habito en " + super.getHabitat() + " y mi genero es " + super.getGenero();
    }

}
