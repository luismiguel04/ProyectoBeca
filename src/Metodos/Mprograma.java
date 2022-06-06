/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import BasedeDatos.Conexion;
import Clases.Programa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Mayra Garrido
 */
public class Mprograma {
    private Conexion cone;
    private Programa Programa;
    private Conexion con;

    
    public Mprograma(){
    cone = new Conexion();
    Programa = new Programa();
    
}
    
   
   
    
    public void insertar(Programa pro){
        Conexion conec = new Conexion();
        String sql = "INSERT INTO Programa (id_Programa, nombre)\n" +
        "VALUES (NULL,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, pro.getNombre());
          
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
    
    public void consulta(JComboBox JCBprograma, JTextField JTid){

//Creamos objeto tipo Connection   
Conexion conec = new Conexion();    
PreparedStatement ps = null;
ResultSet result = null;
//Creamos la Consulta SQL
String sql = "SELECT * FROM programa";
//Establecemos bloque try-catch-finally
try {
       
   //Establecemos conexión con la BD 
   //Preparamos la consulta SQL
  
    ps = conec.getConnection().prepareStatement(sql);
   //Ejecutamos la consulta
   result = ps.executeQuery();
   
   //LLenamos nuestro ComboBox
   JCBprograma.addItem("Seleccione una opción");
   
   
   while(result.next()){
   
       JCBprograma.addItem(result.getString("Nombre"));
       JTid.setText(result.getString("Id_Programa"));
   
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
    
    public void Modificar(Programa prog){
        Conexion conec = new Conexion();
        String sql = "UPDATE Programa SET nombre = ?\n" +
"WHERE Id_programa = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, prog.getNombre());
            ps.setInt(4, prog.getId_programa());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }

    
    
    
}
