/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface interfazUsuario {
    public List <Usuario> getUsuarios();
    public Usuario getId(String nombre,String clave);
    
    
}
