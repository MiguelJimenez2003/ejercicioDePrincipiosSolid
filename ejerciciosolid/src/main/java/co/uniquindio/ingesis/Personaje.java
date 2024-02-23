package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Personaje {

    private static Set<String> nombresUnicos = new HashSet<>();
    private String nombrePersonaje;
    private String descripcion; 
    private String apodo;
    private Double dineroInicial;
    private ClasePersonaje tipoDePersonaje;
    private Map<Habilidad, Integer> habilidades;
    private Map<Atributo, Integer> atributos;
    
    public Personaje(String nombrePersonaje, ClasePersonaje tipoDePersonaje) {
        if(nombresUnicos.contains(nombrePersonaje)){
            throw new IllegalArgumentException("El nombre: "+ nombrePersonaje+ " ya está en uso");
        }
        this.nombrePersonaje = nombrePersonaje;
        this.tipoDePersonaje= tipoDePersonaje;
        this.atributos= new HashMap<>();
        this.habilidades= new HashMap<>(); 

        nombresUnicos.add(nombrePersonaje);
    }

    //Asignar atributos y habilidades según la clase del personaje
    public void asignarAtributosClaseGuerrero(int fuerza, int resistencia, int vitalidad){
        if(this.tipoDePersonaje==ClasePersonaje.GUERRERO){
            atributos.put(Atributo.FUERZA, fuerza);
            atributos.put(Atributo.RESISTENCIA,resistencia);
            atributos.put(Atributo.VITALIDAD,vitalidad);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Guerrero");
        }
    }

    public void asignarAtributosClaseMago(int inteligencia, int sabiduria, int energiaMagica){
        if(this.tipoDePersonaje==ClasePersonaje.MAGO){
            atributos.put(Atributo.INTELIGENCIA, inteligencia);
            atributos.put(Atributo.SABIDURIA, sabiduria);
            atributos.put(Atributo.ENERGIA_MAGICA, energiaMagica);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Mago");
        }
    }
    public void asignarAtributosClaseArquero(int destreza, int agilidad, int precision){
        if(this.tipoDePersonaje==ClasePersonaje.GUERRERO){
            atributos.put(Atributo.DESTREZA, destreza);
            atributos.put(Atributo.AGILIDAD, agilidad);
            atributos.put(Atributo.PRECISION, precision);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Arquero");
        }
    }
    public void asignarHabilidadClaseGuerrero(int espadaAfilada, int golpeDefinitivo, int escudoProtector){
        if(this.tipoDePersonaje==ClasePersonaje.GUERRERO){
            habilidades.put(Habilidad.ESPADA_AFILADA, espadaAfilada);
            habilidades.put(Habilidad.GOLPE_DEFINITIVO, golpeDefinitivo);
            habilidades.put(Habilidad.ESCUDO_PROTECTOR, escudoProtector);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Guerrero");
        }
    }
    public void asignarHabilidadClaseMago(int bolaDeFuego, int rayoElectrico, int hechizoDeCuracion){
        if(this.tipoDePersonaje==ClasePersonaje.GUERRERO){
            habilidades.put(Habilidad.BOLA_DE_FUEGO, bolaDeFuego);
            habilidades.put(Habilidad.RAYO_ELECTRICO, rayoElectrico);
            habilidades.put(Habilidad.HECHIZO_DE_CURACION, hechizoDeCuracion);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Mago");
        }
    }public void asignarHabilidadClaseArquero(int disparoRapido, int flechaVenenosa, int tiroCertero){
        if(this.tipoDePersonaje==ClasePersonaje.GUERRERO){
            habilidades.put(Habilidad.DISPARO_RAPIDO, disparoRapido);
            habilidades.put(Habilidad.FLECHA_VENENOSA, flechaVenenosa);
            habilidades.put(Habilidad.TIRO_CERTERO, tiroCertero);   
        } else{
            throw new IllegalArgumentException("El personaje no es un Arquero");
        }
    }

    @Override
    public String toString() {
        return "Personaje [nombrePersonaje=" + nombrePersonaje + ", descripcion=" + descripcion + ", apodo=" + apodo
                + ", dineroInicial=" + dineroInicial + ", tipoDePersonaje=" + tipoDePersonaje + ", habilidades="
                + habilidades + ", atributos=" + atributos + "]";
    }
   

    


}
