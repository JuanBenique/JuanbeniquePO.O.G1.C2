package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter
@Setter
@EntityScan
@Table(name="Participante")



public class Participante {
    private StringProperty dni;
    private StringProperty nombre;
    private StringProperty apellidos;
    private carrera carrera;
    private BooleanProperty estado;
    private TipoParticipante tipoParticipante;
    private BooleanProperty estado2;

}
