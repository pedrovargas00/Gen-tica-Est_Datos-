package Árbol;

import Controlador.Controlador;
import java.awt.geom.*;
import java.awt.*;

public class Nodo {
    
    private String dato;
    private Nodo hijo;
    private Nodo hermano;
    private Nodo anterior;
    private boolean visitado;
    private Color color;
    private Point2D origen;
    private Ellipse2D circulo;
    private final int diametro = 30;
    public static int nVertices = 0;
    private Controlador controlador;
    
    public Nodo(){
        this(new Point2D.Double(0,0));
    }

    public Nodo(Point2D p){
        this(p, ""+nVertices);
    }
    
    public Nodo(Point2D p, String dato){
        
        double x = p.getX();
        double y = p.getY();
        origen = p;
        this.setColor(Color.black);
        circulo = new Ellipse2D.Double(x-diametro/2,y-diametro/2,
        diametro,diametro);
        this.dato = dato;
        this.visitado = false;
        this.hijo = null;
        this.hermano = null;
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public void setDato(String dato){
        this.dato = dato;
    }
    
    public void setHijo(Nodo hijo){
        this.hijo = hijo;
    }
    
    public void setHermano(Nodo hermano){
        this.hermano = hermano;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public boolean isVisitado(){
        return visitado;
    }
    
    public String getDato(){
        return dato;
    }
    
    public Nodo getHijo(){
        return hijo;
    }
    
    public Nodo getHermano(){
        return hermano;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
    
    public Ellipse2D getCirculo() {
        return circulo;
    }

    public void setCirculo(Ellipse2D circulo) {
        this.circulo = circulo;
    }
    
    public void dibujar(Graphics2D g2){
        g2.setPaint(color);
        g2.fill(circulo);
        g2.setPaint(Color.BLACK);
        g2.setColor(Color.WHITE);
        g2.drawString(this.getDato(), (int)(origen.getX()), (int)(origen.getY()));
    }

}
