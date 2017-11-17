/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5;

/**
 *
 * @author Alex Ordonez
 */
public class Jugador {
    private String nombre,posicion;
    private double precio;
    private boolean disponibilidad;
    private int habilidad,tecnica,resistencia;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, double precio, boolean disponibilidad, int habilidad, int tecnica, int resistencia) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }    

    @Override
    public String toString() {
        return nombre + "(" +" precio = "+ precio+" posicion = "+ posicion+" disponibilidad = " +disponibilidad+"  )";
    }

}
