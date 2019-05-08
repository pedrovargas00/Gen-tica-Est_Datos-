package Lógica;

import Interfaces.*;
import Archivo.*;
import Controlador.*;
import Árbol.*;
import javax.swing.*;

public class TestProyecto {
    public static void main(String []args){

        Controlador controlador = new Controlador();
        
        Archivo archivo = new Archivo();
        PortadaUI ventana = new PortadaUI();
        DibujarUI dibujar = new DibujarUI();
        Persona persona = new Persona();
        Arbol arbol = new Arbol();
        
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setVisible(true);
       
        dibujar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dibujar.setVisible(true);
        
        controlador.setArbol(arbol);
        controlador.setArchivo(archivo);
        controlador.setPersona(persona);
        controlador.setPortada(ventana);
        controlador.setDibujar(dibujar);
        
        arbol.setControlador(controlador);
        archivo.setControlador(controlador);
        persona.setControlador(controlador);
        ventana.setControlador(controlador);
        
        /*ArrayList <Character> c = new ArrayList(); 
        Arbol a = new Arbol();

        a.insertarRaiz("0"); //significa la raiz   
        a.insertar("0", "1", a.getRaiz());
        a.desVisitar();
        a.insertar("0", "2", a.getRaiz());
        a.desVisitar();
        a.insertar("0", "3", a.getRaiz());
        a.desVisitar();
        a.insertar("1", "1.1", a.getRaiz());
        a.desVisitar();
        a.insertar("1", "1.2", a.getRaiz());
        a.desVisitar();
        a.insertar("3", "3.1", a.getRaiz());
        a.desVisitar();
        a.insertar("3", "3.2", a.getRaiz());
        a.desVisitar();
        a.insertar("3", "3.3", a.getRaiz());
        a.desVisitar();
        a.insertar("3", "3.4", a.getRaiz());
        a.desVisitar();
        //a.insertar("3.3", "3.3.1", a.getRaiz());
        //a.desVisitar();
        System.out.println(" El recorrido en preOrden es:");
        System.out.println(a.preOrden(a.getRaiz(),c));
        a.desVisitar();
        c.clear();
        System.out.println(" El recorrido en posOrden es:\n" + a.postOrden(a.getRaiz(), c));
        a.desVisitar();
        c.clear();
        System.out.println(" El recorrido en niveles es:\n" + a.niveles(a.getRaiz(), c, new LinkedList()));
        c.clear();

        //--------
            System.out.println("\n");
        Arbol a1 = new Arbol();

        a1.insertarRaiz("A"); //significa la raiz
        a1.insertar("A", "B", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("A", "C", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("A", "D", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("B", "E", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("C", "F", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("C", "G", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("G", "K", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("G", "L", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("D", "H", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("D", "I", a1.getRaiz());
        a1.desVisitar();
        a1.insertar("D", "J", a1.getRaiz());
        a1.desVisitar();
        System.out.println(" El recorrido en preOrden es:");
        System.out.println(a1.preOrden(a1.getRaiz(),c));
        a1.desVisitar();
        c.clear();
        System.out.println(" El recorrido en posOrden es:\n" + a1.postOrden(a1.getRaiz(), c));
        a1.desVisitar();
        c.clear();
        System.out.println(" El recorrido en niveles es:\n" + a1.niveles(a1.getRaiz(), c, new LinkedList()));*/
        
    }
}