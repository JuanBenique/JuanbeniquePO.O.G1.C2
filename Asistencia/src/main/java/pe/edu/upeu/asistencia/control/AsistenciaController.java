package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

import java.awt.*;

@Controller

public class AsistenciaController {
    @FXML private TextField txtnum1, txtnum2;

    @FXML private Label result;

    @FXML
    private void sumar() {
        double num1 =Double.parseDouble(txtnum1.gettext());
        double num2 =Double.parseDouble(txtnum2.gettext());
        double result=num1+num2;
        result.setText(String.valueOf(resultado));
    }

}
