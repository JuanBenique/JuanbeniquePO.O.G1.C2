package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.List;

public interface ParticipanteServicioI {
     void save(Participante estudiante);
     List<Participante> findall();

    Participante uptade(Participante estudiante,int index);
     void delete(int index);

    Participante findById(int index );

}
