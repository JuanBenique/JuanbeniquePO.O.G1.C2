package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.repositorio.ParticipanteRepository;

import java.util.List;

public class ParticipanteServicioImp extends ParticipanteRepository
        implements ParticipanteServicioI {
    @Override
    public void save(Participante estudiante) {
        participante.add(estudiante);
    }
    @Override
    public Participante update(Participante participante, int index) {
        return participante.set(index, participante);
    }
    @Override
    public void delete(int index) {
        participante.remove(index);
    }
    @Override
    public Participante findById(int index) {
        return participante.get(index);
    }
    public List<Participante> findAll(){
        if(participante.isEmpty()){
            return super.findAll();
        }
        return participante;
    }

}