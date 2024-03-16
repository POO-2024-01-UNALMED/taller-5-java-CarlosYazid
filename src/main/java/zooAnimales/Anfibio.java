package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{

    protected static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    public static int total;
    protected String colorPiel;
    protected boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        total++;
    }

    public Anfibio(){this(null,0,null,null,null,false);}

    public static int cantidadAnfibios(){return total;}

    public String movimiento(){return "saltar";}

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        Anfibio nuevoAnfibio = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
        listado.add(nuevoAnfibio);
        return nuevoAnfibio;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        Anfibio nuevoAnfibio = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
        listado.add(nuevoAnfibio);
        return nuevoAnfibio;
    }

    public ArrayList<Anfibio> getListado(){return listado;}

    public String getColorPiel(){return colorPiel;}

    public boolean isVenenoso(){return venenoso;}

} // Anti - copy: Carlos Yazid Padilla