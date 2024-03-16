package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{

    protected static ArrayList<Reptil> listado = new ArrayList<>();

    public static int iguanas;

    public static int serpientes;

    public static int total;
    protected String colorEscamas;

    protected int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        total++;
    }

    public  Reptil(){this(null,0,null,null,null,0);}

    public static int cantidadReptiles(){return total;}

    public String movimiento(){return "reptar";}

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        Reptil nuevoReptil = new Reptil(nombre,edad,"humedal",genero,"verde",3);
        listado.add(nuevoReptil);
        return nuevoReptil;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        Reptil nuevoReptil = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
        listado.add(nuevoReptil);
        return nuevoReptil;
    }

    public String getColorEscamas() {return colorEscamas;}

    public int getLargoCola() {return largoCola;}

} // Anti - copy: Carlos Yazid Padilla