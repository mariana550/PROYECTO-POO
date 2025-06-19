/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author sebas
 */
public class Persona {
    
    private String nombre;
    private String edad;
    private String peso;
    private String estatura;

    public Persona(String nombre, String edad, String peso, String estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

        
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public String getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
    
           
    
}
