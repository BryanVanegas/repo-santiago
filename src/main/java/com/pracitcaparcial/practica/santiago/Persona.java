/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pracitcaparcial.practica.santiago;

/**
 *
 * @author BryanVanegas
 */
public class Persona {
    
    private int cedula;
    private String apellido;

    public Persona(int cedula, String apellido) {
        this.cedula = cedula;
        this.apellido = apellido;
    }
    
    public boolean verificarCoincidencia(int cedula) {
        if (cedula == this.cedula) {
            return true;
        } else {
            return false;
        }
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
