package Interfaces;
import Controlador.Controlador;
import java.awt.*;
import javax.swing.*;

public class PortadaUI extends JFrame{
    
    private JPanel pMenu, pPrincipal, pTitulo;
    private JButton btSalir, btComenzar;
    private JLabel lbTitulo;
    private Color color;
    private Font fuente;
    private Controlador controlador;
    
    public PortadaUI(){
        
        super("-------");
        initComponentes();
        this.setLocation(100, 100);
        this.setSize(600, 600);
        this.setResizable(false);

    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    private void initComponentes(){
        
        pPrincipal = new JPanel(new BorderLayout());
        pMenu = new JPanel(new BorderLayout());
        pTitulo = new JPanel();
        
        btSalir = new JButton("Salir");
        btComenzar = new JButton("Comenzar Diagnóstico");
        
        lbTitulo = new JLabel("Título :D");
        
        pMenu.add(btSalir, BorderLayout.WEST);
        pMenu.add(btComenzar, BorderLayout.EAST);
        pMenu.setBackground(Color.green);
        pTitulo.add(lbTitulo);
        
        add(pMenu, BorderLayout.SOUTH);
        add(pTitulo, BorderLayout.NORTH);
        add(pPrincipal, BorderLayout.CENTER);
        
    }
}
