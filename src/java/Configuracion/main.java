/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import DAO.UserDAO;

/**
 *
 * @author Gabriel
 */
public class main {

    public static void main(String[] args) {
        ConexionMySQL cn = new ConexionMySQL();
        cn.Conectar();

        UserDAO us = new UserDAO();
        System.out.println(us.getUsuarios().get(0).getNombre());
        System.out.println(us.getUsuarios().get(0).getClave());

    }

}
