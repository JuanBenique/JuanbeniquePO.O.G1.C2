package pe.edu.upeu.asistencia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.*;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter
@Setter
@Entity
@Table(name="participante")
public class Participante {
    @Id
    private String dni;
    private String nombre;
    private String apellidos;
    private Carrera carrera;
    private Boolean estado;
    private TipoParticipante tipoParticipante;
    private Boolean estado2;

}
