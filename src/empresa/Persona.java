/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Notebook
 */
public class Persona {
    
    //alt + insert
    private String nombre,apellido;
    private int edad,dni;

    
    
    //Constructor

    public Persona() {
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    public Boolean esMayorDeEdad() {
        if(edad >= 18){
        return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
}
