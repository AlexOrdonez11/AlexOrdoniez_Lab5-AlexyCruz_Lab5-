/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5;

import java.util.ArrayList;

/**
 *
 * @author Alex Ordonez
 */
public class Equipo {
    private String nombre,estadio;
    private double presupuesto;
    private int copas;
    ArrayList<Jugador> jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String estadio, double presupuesto, int copas) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.presupuesto = presupuesto;
        this.copas = copas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", estadio=" + estadio + ", presupuesto=" + presupuesto + ", copas=" + copas + ", jugadores=" + jugadores + '}';
    }
    
}
