package zooAnimales;
import gestion.Zona;
import zooAnimales.*;
import java.security.PublicKey;

public class Animal {

    protected static int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public Animal(){this(null,0,null,null);}

    public String movimiento(){return "desplazarse";}

    public static String totalPorTipo(){
        String mensaje = "Mamiferos: "+ Mamifero.cantidadMamiferos()+ "\n" +
                "Aves: "+ Ave.cantidadAves() +"\n" +
                "Reptiles: "+ Reptil.cantidadReptiles() +"\n" +
                "Peces: "+ Pez.cantidadPeces() +"\n" +
                "Anfibios: "+ Anfibio.cantidadAnfibios();
        return mensaje;
    }

    public String toString(){
        return "Mi nombre es "+ nombre +", tengo una edad de "+ edad +", habito en "+ habitat +"y mi genero es " +
                genero + ", la zona en la que me ubico es " + zona +", en el ";
    }

    public String getNombre() {return nombre;}

    public int getEdad(){return edad;}

    public String getHabitat() {return habitat;}

    public String getGenero() {return genero;}

    public static int getTotalAnimales() {return totalAnimales;}

    public static void setTotalAnimales(int totalAnimales) {Animal.totalAnimales = totalAnimales;}
} // Anti - copy : Carlos Yazid Padilla Royero