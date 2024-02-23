package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class Jugador {
    
    public static void main(String[] args) {


    Personaje personaje1 = new Personaje("Miguel", ClasePersonaje.GUERRERO);

    personaje1.asignarAtributosClaseArquero(10 , 10, 10);
    personaje1.asignarHabilidadClaseGuerrero(3, 2, 4);

    System.out.println(personaje1.toString());

    Personaje personajeCamila = new Personaje("Camila", ClasePersonaje.MAGO);

    personajeCamila.asignarAtributosClaseMago(50, 54, 700);

    System.out.println(personajeCamila.toString());

}
}
