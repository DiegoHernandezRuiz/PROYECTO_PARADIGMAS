/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Diego
 */
public class PersonaDaoImp implements PersonaDao {
    
   
    
    @Override
    
    
    public void consultarTodo(){
        FileInputStream FIS= new FileInputStream("dato.txt");
        ObjectInputStream OIS=new ObjectInputStream(FIS);
        Persona or=(Persona)OIS.readObject();
        or.setNombre("Diego");
        System.out.println(or.getNombre());
        OIS.close();
        
        
        
    }

    @Override
    public void Buscar() {
        
    }

    @Override
    public void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
