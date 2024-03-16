package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{

    protected static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    public static int total;
    protected String colorEscamas;
    protected int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        total++;
    }

    public Pez() {this(null,0,null,null,null,0);}

    public static int cantidadPeces(){return total;}

    public String movimiento(){return "nadar";}

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        Pez nuevoPez = new Pez(nombre,edad,"oceano",genero,"rojo",6);
        listado.add(nuevoPez);
        return nuevoPez;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        Pez nuevoPez = new Pez(nombre,edad,"oceano",genero,"gris",6);
        listado.add(nuevoPez);
        return nuevoPez;
    }

    public String getColorEscamas() {return colorEscamas;}

    public int getCantidadAletas() {return cantidadAletas;}
}
