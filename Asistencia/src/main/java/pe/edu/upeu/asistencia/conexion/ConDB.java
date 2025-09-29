package pe.edu.upeu.asistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConDB {
    public static Connection conexion=null;
    public static Connection getConexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            String url="jdbc:sqlite:data/asistencia.db?foreign_keys=on";
            if(conexion==null){
                conexion= DriverManager.getConnection(url);
            }
            System.out.println("conexcion establecida");

        }
    }
}
public static void main(String[] args) {
    PreparedStatement pst=null;
    ResultSet rs=null;
    Connection con=getConexion();
    try {
        pst=con.prepareStatement("SELECT * FROM participante");
        rs=pst.executeQuery();
        while(rs.next()){
            String nombre=rs.getString("nombre");
            String apellido=rs.getString("apellidos");
            System.out.println(nombre+" "+apellido);
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}