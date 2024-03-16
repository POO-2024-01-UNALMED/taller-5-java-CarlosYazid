package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{

    protected static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    public static int total;
    protected boolean pelaje;
    protected int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;
        total++;
    }

    public Mamifero(){
        this(null,0,null,null,false,0);
    }

    public static int cantidadMamiferos(){
        return total;
    }

    public static Mamifero crearCaballo(String nombre,int edad, String genero){
        caballos++;
        Mamifero nuevoCaballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
        listado.add(nuevoCaballo);
        return nuevoCaballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        Mamifero nuevoLeon = new Mamifero(nombre,edad,"selva",genero,true,4);
        listado.add(nuevoLeon);
        return nuevoLeon;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;
    }

}
