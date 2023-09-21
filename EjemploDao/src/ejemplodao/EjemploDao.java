/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodao;

import Dao.PersonaDao;
import Dao.PersonaDaoImp;
import Model.Persona;

/**
 *
 * @author Diego
 */
public class EjemploDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaDao PD= new PersonaDaoImp();
        PD.consultarTodo();
        PD.Buscar();
        PD.agregar();
        PD.actualizar();
        
        
        
        
        
        // TODO code application logic here
    }
    
}
