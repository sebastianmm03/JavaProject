import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Ventana extends GradingSystem { // Se hace la extención de la clase GradingSystem donde estan los metodos que claculan las respuestas

    
    @FXML
    private TextField CantRegistros;

    @FXML
    private TextArea Datos;

    @FXML
    private TextArea Resultados;

    @FXML
    private Button CalcularButton;

    @FXML
    void CalcularResultados(MouseEvent event) {
        try {
            super.cantDatos = Integer.parseInt(CantRegistros.getText());
            String responses = Datos.getText();
            super.datos=new float[cantDatos][4];
            String[] data = responses.split("\n"); 
            for (int i = 0; i < super.cantDatos; i++) {
                String[] data2 = data[i].split(" ");
                System.out.println(data[i]);
                for(int j=0; j<4; j++){
                    super.datos[i][j]=Float.parseFloat(data2[j]);

                }
            }
            Resultados.setText(String.format("%.2f %n%d %n%s %n%s",stat1(),stat2(),stat3(),stat4())); 

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}