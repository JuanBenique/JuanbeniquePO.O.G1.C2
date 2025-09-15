package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.modelo.Participante;


import java.util.ArrayList;
import java.util.List;



public class ParticipanteRepository {
    protected  List<Participante> participante=new ArrayList<>();

     public List<Participante> findall(){
         participante.add(new Participante(
                 new SimpleStringProperty("123456"),
                 new SimpleStringProperty("juan"),
                 new SimpleStringProperty("apaza"),
                 Carrera.SISTEMAS,
                 TipoParticipante
         ));
         return Participante;
     }

}
