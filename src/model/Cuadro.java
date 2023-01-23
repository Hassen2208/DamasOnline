package model;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 * Archivo: Cuadro.java
  Autor: Marcela Mazo, Hassen Ortiz
  Email: <marcela.mazo@correounivalle.edu.co> <hasse.ortiz@correounivalle.edu.co>
  Modificado por: Marcela Mazo. Hassen Ortiz
  <marcela.mazo@correounivalle.edu.co>
  Fecha creación: 2023-01-11
  Fecha última modificación: 2023-01-14
  Versión: 2.0
  Licencia: GPL
 */
public class Cuadro extends JButton{
       
    //Es la que esta en el cuadro.
    private Ficha ficha;
    //El color del cuadro.
    private Color color;
    //La posición del cuadro en el tablero.
    private final int x;
    private final int y;
    
    /**
     * Inicializa las variables de la clase.
     * 
     * @param color Es el color del cuadro
     * @param x La posición en x del cuadro.
     * @param y La posición en y del cuadro.
     * @param ficha Es la ficha que puede ser puesta encima del cuadro.
     */
    public Cuadro(Color color, int x, int y, Ficha ficha) {
        this.color = color;
        this.ficha = ficha;
        this.x = x;
        this.y = y;   
    }
    /**
     * Indica el color actual del cuadro.
     * 
     * @return Devuelve el color.
     */
    public Color getColor() {
        return color;
    }
    /**
     * Este se utilizara para indicar si el cuadro ha sido seleccionado.
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
        visualizar();
    }


    /**
     * Posición en x.
     * 
     * @return Devuelve la posición en x.
     */
    public int getXPos() {
        return x;
    }

    /**
     * Posición en y.
     * 
     * @return Devuelve la posición en y.
     */
    public int getYPos() {
        return y;
    }
    
    /**
     * Agrega la ficha al cuadro.
     * @param ficha 
     */
    public void setFicha(Ficha ficha){
        this.ficha = ficha;  
        repaint();
    }
    /**
     * Devuelve la ficha que contiene el cuadro.
     * 
     * @return La ficha que contiene el cuadro. 
     */
    public Ficha getFicha() {
        return ficha;
    }
    /**
     * Indica si el cuadro tiene un ficha o no.
     * 
     * @return devuelve si hay ficha o no 
     */
    public boolean estaVacio() {
        return ficha == null;
    }

    /**
     * Pinta el cuadro con el color indicado.
     */
    public void visualizar() {
        setText("");
        setBackground(color);    
        repaint();
    }    
    /**
    * Dibuja la ficha dependiendo del color que se le indique y si existe la ficha.
    * 
    * @param g Son los gráficos del cuadro. 
    */
    private void dibujarFicha(Graphics g){
        if(!estaVacio()) {
            g.setColor(ficha.getColor());
            g.fillOval(10, 10, 55, 55);
            //Si la ficha es reina se pinta un circulo blanco para indicar que lo es.
            if (ficha.isEsReina()) {
                g.setColor(Color.WHITE);
                g.fillOval(20, 20, 30, 30);
            }
        }
    }
    /**
     * Dibuja lo que hay adentro del cuadro si es que hay algo.
     * @param grphcs Es los graficos del cuadro.
     */
     @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        dibujarFicha(grphcs);
    }

    @Override
    public String toString() {
        return "Cuadro{" + "ficha=" + ficha + ", color=" + color + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
