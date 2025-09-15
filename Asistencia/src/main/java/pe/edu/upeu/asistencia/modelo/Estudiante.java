package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Setter
@Getter

public class Participante {
    private StringProperty nombre;
    private BooleanProperty estado;
}
