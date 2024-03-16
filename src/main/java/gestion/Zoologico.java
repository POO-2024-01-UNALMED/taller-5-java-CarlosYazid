package gestion;
import zooAnimales.Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zoologico {

    protected String nombre;
    protected String ubicacion;
    protected ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){this(null,null);}

    public void agregarZonas(Zona zona){zonas.add(zona);}

    public static int cantidadTotalAnimales(){return Animal.getTotalAnimales();}

    public String getNombre(){return nombre;}

    public String getUbicacion(){return ubicacion;}

    public ArrayList<Zona> getZona(){return zonas;}

} // Anti - copy : Carlos Yazid Padilla Royero
