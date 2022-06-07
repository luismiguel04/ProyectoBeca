/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import BasedeDatos.Conexion;
import Clases.Servicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Mayra Garrido
 */
public class Mservicio {
    
    
    private Conexion cone;
    private Servicio Servicio;
    private Conexion con;

    
    public Mservicio(){
    cone = new Conexion();
    Servicio = new Servicio();
    
}
    
        public void insertar(Servicio ser){
        Conexion conec = new Conexion();
        String sql = "INSERT INTO Servicio (Id_Servicio, Nombre)\n" +
        "VALUES (NULL,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, ser.getNombre());
          
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        
   
    }
public void consulta(JComboBox JCBservicio){

//Creamos objeto tipo Connection   
Conexion conec = new Conexion();    
PreparedStatement ps = null;
ResultSet result = null;
//Creamos la Consulta SQL
String sql = "SELECT *  FROM Servicio ";
//Establecemos bloque try-catch-finally
try {
       
   //Establecemos conexión con la BD 
   //Preparamos la consulta SQL
  
    ps = conec.getConnection().prepareStatement(sql);
   //Ejecutamos la consulta
   result = ps.executeQuery();
   
   //LLenamos nuestro ComboBox
   JCBservicio.addItem("Seleccione una opción");
   
   
   while(result.next()){
   
       JCBservicio.addItem(result.getString("Nombre"));
   }
   
    
} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
} 

} 
    
}
