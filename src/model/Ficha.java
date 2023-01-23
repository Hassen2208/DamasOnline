package model;

import java.awt.Color;

/**
 * Describe las cualidades de una ficha
 * 
 * @author Ornelas Munguía Axel Leonardo
 * @version 11.03.2020
 */
public class Ficha {
    
    private int xPos;
    private int yPos;
    private boolean esReina;
    private final Color color; 

    /**
     * Constructor de la clase
     * 
     * @param xPos Es la posición en x de la ficha.
     * @param yPos Es la posición en y de la ficha.
     * @param color Es el bando y el color de la ficha.
     */
    public Ficha(int xPos, int yPos,Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        esReina = false;
    }
    /**
     * EMPIEZAN GETTERS Y SETTERS 
     */
    public Color getColor() {
        return color;
    }

    
    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isEsReina() {
        return esReina;
    }
    
    public void setEsReina(boolean esReina) {
        this.esReina = esReina;
    }
    /**
     * TERMINANA GETTERS Y SETTERS
     */
    public void hacerReina() {
        esReina = true;
    }   
    
    @Override
    public String toString() {
        return "Ficha{" + "xPos=" + xPos + ", yPos=" + yPos + ", esReina=" + esReina + ", color=" + color + '}';
    }
    
    
}
