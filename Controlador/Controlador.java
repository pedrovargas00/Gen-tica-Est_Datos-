package Controlador;

import Archivo.*;
import Interfaces.*;
import Lógica.*;
import Árbol.*;

public class Controlador{
    
    private Archivo archivo;
    private PortadaUI portada;
    private DibujarUI dibujar;
    private Persona persona;
    private Arbol arbol;
    private Nodo nodo;
    
    public Controlador(){}

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    public void setPortada(PortadaUI portada) {
        this.portada = portada;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public void setDibujar(DibujarUI dibujar){
        this.dibujar = dibujar;
    }
    
    
    
}
