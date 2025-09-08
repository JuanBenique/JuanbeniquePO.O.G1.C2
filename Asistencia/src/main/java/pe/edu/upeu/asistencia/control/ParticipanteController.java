package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

import javax.swing.table.TableColumn;

@Controller
public class ParticipanteController {
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private Label resultado;

}
@FXML
public void initialize(){
    cbxCarrera.getItems().addAll(Carera.values());
    cbxTipoParticipantes.getItems().add(TipoParticipante.values());
    cbxCarrera.getSelectionModel().select(4);
    Carrera carrera =cbxCarrera.getSelectionModel().getSelectedItem();
    System.out.println(carrera.name());
    definirColumnas();
    listarParticipantes();
}
ublic void definirColumnas(){
    dniCol = new TableColumn<>("DNI");
    nombreCol = new TableColumn<>("Nombre");
    apellidoCol = new TableColumn<>("Apellido");
    carreraCol = new TableColumn<>("Carrera");
    tipoParticipanteCol = new TableColumn<>("Tipo Participante");
    tableRegPart.getColumns().addAll(dniCol, nombreCol, apellidoCol, carreraCol, tipoParticipanteCol);
}
public void listarPartipantes(){
    dniCol.setCellValueFactory(cellData -> cellData.getValue().getDni());
    nombreCol.setCellValueFactory(cellData -> cellData.getValue().getNombre());
    apellidoCol.setCellValueFactory(cellData->cellData.getValue().getApellidos());
    carreraCol.setCellValueFactory(
            cellData->new SimpleStringProperty(cellData.getValue().getCarrera().toString())
    );
    participantes = FXCollections.observableList(ps.findAll());
    tableRegPart.setItems(participantes);
}
public void  listarParticipantes(){
    dniCol.setCellValueFactory(cellData)
}
