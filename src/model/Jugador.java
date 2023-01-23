package model;

import java.util.ArrayList;

/**
 * Cualidades de un jugador de damas.
 * 
 * @author Ornelas Munguía Axel Leonardo
 * @version 05.03.2020
 */
public class Jugador {
    
    //Es el nombre del jugador de la partida.
    private String nombre;
    //Son las fichas que tiene en juego el jugador.
    private ArrayList<Ficha> fichas;
    //Es la cantidad de fichas que tiene el jugador.
    private int numFichas;
    
    /**
     * Constructor de Jugador
     * @param nombre Es el nombre que se le indica al jugador.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        numFichas = 0;
        fichas = new ArrayList<>(numFichas);
    }
    /**
     * EMPIEZAN GETTERS Y SETTERS
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public int getNumFichas() {
        return numFichas;
    }
    /**
     * TERMINAN GETTERS Y SETTERS 
     */
    
    /**
     * Agrega una ficha a la mano del jugador.
     * 
     * @param ficha Es la ficha que se agrega. 
     */
    public void agregarFicha(Ficha ficha){
        fichas.add(ficha);
        numFichas++;
    }
    /**
     * Indica que se va iniciar un nuevo juego al jugador.
     */
    public void nuevasFichas(){
        numFichas = 0;
        fichas.clear();
    }
    /**
     * Quita una ficha de las que obtenga el jugador.
     * 
     * @param ficha Es la ficha a remover.
     */
    public void quitarFicha(Ficha ficha) {
        fichas.remove(ficha);
        numFichas--;
    }
    

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", fichas=" + fichas + ", numFichas=" + numFichas + '}';
    }
    
    
    
}
