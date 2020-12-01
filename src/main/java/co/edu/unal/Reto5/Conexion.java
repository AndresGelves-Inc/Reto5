/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafa
 */
public class Conexion {

    
    static Connection contacto = null;
    public static String usuario = "root";
    public static String password = "Valentina4418#";
    public static boolean status = false;
    
    public static Connection getConexion(){
        status = false;
        String url = "jdbc:mysql://localhost:3306/museo?serverTimezone=UTC";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(url, usuario, password);
            status = true;
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
    
    
    public static boolean getstatus(){
        return  status;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static void BuscarArticulo(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarArticulo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
}
