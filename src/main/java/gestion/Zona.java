package gestion;

import zooAnimales.Anfibio;
import zooAnimales.Animal;

import java.util.ArrayList;

/*
 *  Taller 5 Java
 *  Realizado el 16 de marzo del 2024
 *  Desarrollado por Carlos Yazid Padilla
 *  Topico: Herencia
 *
 *  Dependencias:
 *
 *  - gestion > Zona
 *  - gestion > Zoologico
 *  - zooAnimales > Animal
 *  - zooAnimales > Anfibio
 *  - zooAnimales > Ave
 *  - zooAnimales > Mamifero
 *  - zooAnimales > Pez
 *  - zooAnimales > Reptil
 *
 */

public class Zona {

    protected String nombre;
    protected Zoologico zoo;
    protected ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){this(null,null);}

    public void agregarAnimales(Animal animal){
        animales.add(animal);
        Animal.setTotalAnimales(Animal.getTotalAnimales()+1);
    }

    public String getNombre(){return nombre;}

    public Zoologico getZoo() {return zoo;}

    public int cantidadAnimales() {return animales.size();}

    public ArrayList<Animal> getAnimales(){return animales;}

} // Anti - copy : Carlos Yazid Padilla Royero