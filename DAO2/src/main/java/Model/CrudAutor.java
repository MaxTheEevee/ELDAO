/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAO.DAOautor;

/**
 *
 * @author Erik
 */
public class CrudAutor {
    Conexion conexion = new Conexion();
    public String Create(Object obj){
    DAOautor autor = (DAOautor) obj;
    Connection connection;
    PreparedStatement pst;
    String query = "INSERT TBL_AUTORES VALUES (?)";
    String respuesta;
    
    try{
        Class.forName(conexion.getDriver());
        connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getPassword());
        
        pst = (PreparedStatement) connection.prepareStatement(query);
        pst.setString(1, autor.getVCH_NOMBRE_AUTOR());
        respuesta = Integer.toString(pst.executeUpdate());
    }
    catch(ClassNotFoundException | SQLException ex){
        respuesta = ex.getMessage();
    }
    return respuesta;
    }
}
