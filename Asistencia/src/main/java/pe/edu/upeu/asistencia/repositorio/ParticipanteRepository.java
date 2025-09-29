package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.modelo.Participante;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;



public class ParticipanteRepository {
    protected  List<Participante> participante=new ArrayList<>();

     public List<Participante> findall(){
         participante.add(new Participante=null;
         Connection con= ConDB.getConexion;
         PreparedStatement pst=null
         }

         return Participante;
     }
public Participante update(Participante p){
    String sql=" UPDATE participante \n" +
            "SET nombre=?, apellidos=?, carrera=?, tipo_participante=?, estado=? \n" +
            "WHERE dni=? ";
    int i=0;
    try {
        pst=con.prepareStatement(sql);
        pst.setString(++i, p.getNombre().getValue());
        pst.setString(++i, p.getApellidos().getValue());
        pst.setString(++i, p.getCarrera().name());
        pst.setString(++i, p.getTipoParticipante().name());
        pst.setBoolean(++i, p.getEstado().getValue());
        pst.setString(++i, p.getDni().getValue());
        pst.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return p;
}
public void delete(Participante p){
    String sql=" DELETE FROM participante WHERE dni=? ";
    int i=0;
    try {
        pst=con.prepareStatement(sql);
        pst.setString(++i, p.getDni().getValue());
        pst.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
