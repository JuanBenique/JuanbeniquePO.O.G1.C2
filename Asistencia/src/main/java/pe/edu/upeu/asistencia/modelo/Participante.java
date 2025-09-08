package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.*;
import pe.edu.upeu.asistencia.enums.CARRERA;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Participante {
    private StringProperty dni;
    private StringProperty nombre;
    private StringProperty apellidos;
    private carrera carrera;
    private BooleanProperty estado;
    private TipoParticipante tipoParticipante;
    private BooleanProperty estado2;

}
