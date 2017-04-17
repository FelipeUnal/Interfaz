/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.ArrayList;


/**
 *
 * @author Estudiante
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Edad;
    private String email;
    private ArrayList<Asset> asset;

    public Cliente(String Nombre, String Apellido, String Telefono, int Edad, String email) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.email = email;
        this.asset = new ArrayList<>();
    }
    
    public void addAsset(Asset asset){
        this.asset.add(asset);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asset> getAsset() {
        return asset;
    }

    public void setAsset(ArrayList<Asset> asset) {
        this.asset = asset;
    }
    
    
    
}
