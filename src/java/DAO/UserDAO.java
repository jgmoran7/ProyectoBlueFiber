/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuracion.ConexionMySQL;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class UserDAO implements interfazUsuario {


    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> user = new ArrayList<>();
        String sql = "select * from catalogo.usuariopagina";
        try {
            PreparedStatement ps = ConexionMySQL.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setNombre(rs.getString(2));
                u.setClave(rs.getString(3));
                user.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return user;
    }

    @Override
    public Usuario getId(String nombre, String clave) {
        String sql = "select * from catalogo.usuariopagina where User=? and Password=?";
        Usuario u = new Usuario();
        try {
            PreparedStatement ps = ConexionMySQL.Conectar().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u.setNombre(rs.getString(2));
                u.setClave(rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println("Error" + e);

        }
        return u;

    }

}
