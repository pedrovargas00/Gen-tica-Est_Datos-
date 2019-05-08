package Lógica;

import Controlador.Controlador;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String peso;
    private String estatura;
    private String IMC;
    //Enfermemdades
    private Controlador controlador;
    
    public Persona(){}
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getIMC() {
        return IMC;
    }

    public void setIMC(String IMC) {
        this.IMC = IMC;
    }
    
    
    
}
