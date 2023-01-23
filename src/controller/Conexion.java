package controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Define las conexiones que tiene el cliente y el servidor.
 Archivo: Conexion.java
  Autor: Marcela Mazo, Hassen Ortiz
  Email: <marcela.mazo@correounivalle.edu.co> <hasse.ortiz@correounivalle.edu.co>
  Modificado por: Marcela Mazo. Hassen Ortiz
  <marcela.mazo@correounivalle.edu.co>
  Fecha creación: 2023-01-18
  Fecha última modificación: 2023-01-18
  Versión: 2.0
  Licencia: GPL
 */
public class Conexion {

    private final int PUERTO = 1234; //Puerto para la conexión
    private final String HOST = "localhost"; //Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salida; //Flujo de datos de salida
    protected DataInputStream entrada;
    
    public Conexion(String tipo) throws IOException //Constructor
    {
        if (tipo.equalsIgnoreCase("servidor")) {
            ss = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        } else {
            cs = new Socket(HOST, PUERTO); //Socket para el cliente en localhost en puerto 1234
        }
    }
    
    
}
