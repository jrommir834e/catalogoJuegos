/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author jesus
 */
public class Juegos {
    
    //atributos encapsulados
    private String nombre;
    private int añoLanzamiento;
    private int pegi;
    private String consola;
    private String creadores;

    public Juegos() {
    }

    public Juegos(String nombre, int añoLanzamiento, int pegi, String consola, String creadores) {
        this.nombre = nombre;
        this.añoLanzamiento = añoLanzamiento;
        this.pegi = pegi;
        this.consola = consola;
        this.creadores = creadores;
    }
    
    
    public Juegos(Juegos origen) {
         this.nombre = origen.nombre;
        this.añoLanzamiento = origen.añoLanzamiento;
        this.pegi = origen.pegi;
        this.consola = origen.consola;
        this.creadores = origen.creadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCreadores() {
        return creadores;
    }

    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Juegos{");
        sb.append("nombre=").append(nombre);
        sb.append(", a\u00f1oLanzamiento=").append(añoLanzamiento);
        sb.append(", pegi=").append(pegi);
        sb.append(", consola=").append(consola);
        sb.append(", creadores=").append(creadores);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + this.añoLanzamiento;
        hash = 11 * hash + this.pegi;
        hash = 11 * hash + Objects.hashCode(this.consola);
        hash = 11 * hash + Objects.hashCode(this.creadores);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juegos other = (Juegos) obj;
        if (this.añoLanzamiento != other.añoLanzamiento) {
            return false;
        }
        if (this.pegi != other.pegi) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.consola, other.consola)) {
            return false;
        }
        return Objects.equals(this.creadores, other.creadores);
    }
    
    
    
    
    
    
    
    
}
