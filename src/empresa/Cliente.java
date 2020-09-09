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
public class Cliente extends Persona {
        
    private int codigo;
    private Boolean deuda;

    
    public Cliente(int codigo, Boolean deuda) {
        this.codigo = codigo;
        this.deuda = deuda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Boolean getDeuda() {
        return deuda;
    }

    public void setDeuda(Boolean deuda) {
        this.deuda = deuda;
    }
    
    
    
    
    
}
