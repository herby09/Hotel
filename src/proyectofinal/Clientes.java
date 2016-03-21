/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 */
public class Clientes {
    
    
    public String nombreClient;
    public int phoneNum;
    public String nacionalidad;  // Datos del Cliente que se quiere hospedar en el Hotel.
    public byte edad;
    public byte dias;
    public int contador=0;

    public Clientes() {
    }

    public Clientes(String nombreClient, int phoneNum, String nacionalidad, byte edad, byte dias) {
        this.nombreClient = nombreClient;
        this.phoneNum = phoneNum;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.dias = dias;
    }
    
    
    public Clientes(byte dias) {
        this.dias = dias;
    }

    
    public String getNombreClient() {
        return nombreClient;
    }

    public void setNombreClient(String nombreClient) {
        this.nombreClient = nombreClient;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getDias() {
        return dias;
    }

    public void setDias(byte dias) {
        this.dias = dias;
    }
    
  

    @Override
    public String toString() {
        return "\nEl Cliente " + nombreClient+
                "\nCon numero de telefono " + phoneNum + 
                "\nPais " + nacionalidad + 
                "\nEdad de " + edad + 
                "\nEstadia de " + dias + 
                " ha sido registrado";
    }
    
    
    
}