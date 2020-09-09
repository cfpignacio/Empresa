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
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // alt-inserte
        
        
        Cliente c1 = new Cliente(100,true);
        
        c1.setNombre("Jorge");
        
        // Cliente c2 = new Cliente("nombre", "dni", "edad", codigo); super()??
        
        // Empleado e1 = new Empleado("nombre" , "dni" , "edad", "sueldo");
        
        
        // Alumnos herede de Persona
        
        System.out.println(c1.getNombre());
        
    }
    
}
