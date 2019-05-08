package Interfaces;

import Controlador.Controlador;
import java.awt.*;
import javax.swing.*;

public class DibujarUI extends JFrame{
    
    private Controlador controlador;
    //private Lienzo lienzo;
    private JPanel pPlegable, pSalir, lienzo;
    private Boton btModificar, btEliminar, btDiagnostico, btSalir, btAgregar;
    private Color color;
    
    public DibujarUI(){
        
        super("------");
        this.setLocation(100, 100);
        this.setSize(600, 600);
        this.setResizable(false);
        initComponentes();
    }
    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    private void initComponentes(){
        
        color = new Color(137, 194, 255);
        
        pPlegable = new JPanel();
        pPlegable.setLayout(new GridLayout(15, 1, 0, 10));
        pSalir = new JPanel(new BorderLayout());
        lienzo = new JPanel();
        
        btModificar = new Boton("Modificar", color, Color.pink, 20, 20);
        btEliminar = new Boton("Eliminar", color, Color.pink, 20, 20);
        btDiagnostico = new Boton("Diagnóstico", color, Color.pink, 20, 20);
        btSalir = new Boton("Salir", color, Color.pink, 20, 20);
        btAgregar = new Boton("Agregar", color, Color.pink, 20, 20);
        setBoton(btAgregar, 120, 140, 110, 155);
        btAgregar.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 20));
        
        pPlegable.add(btModificar);
        pPlegable.add(btEliminar);
        pPlegable.add(btDiagnostico);
        
        pSalir.add(btAgregar, BorderLayout.WEST);
        pSalir.add(btSalir, BorderLayout.EAST);
        
        add(pPlegable, BorderLayout.EAST);
        add(pSalir, BorderLayout.SOUTH);
        add(lienzo, BorderLayout.CENTER);
        
    }
    
    private static void setBoton(Boton boton, int x, int y, int p ,int p1){ 
        boton.setBounds(x, y, p, p1); 
        boton.setFocusPainted(false); 
        boton.setForeground(Color.white);
    }
    
    
    
}
