/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuracion.ConexionMySQL;
import Modelo.Productos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Gabriel
 */
public class ProductosDAO implements interfazProducto{

    @Override
    public List<Productos> getProductos(){
        List<Productos> producto=new ArrayList<>();
        String sql = "select * from catalogo.listap";
        try {
            PreparedStatement ps = ConexionMySQL.Conectar().prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                Productos p=new Productos();
                p.setCodigo(rs.getInt(0));
                p.setImagenes(rs.getByte(1));
                p.setMarca(rs.getString(2));
                p.setModelo(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setSubtotal(rs.getFloat(5));
                p.setIVA(rs.getFloat(6));
                p.setPrecioTotal(rs.getFloat(7));
                producto.add(p);
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        return producto;
    }

    
}
