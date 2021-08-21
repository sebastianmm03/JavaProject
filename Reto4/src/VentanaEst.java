import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;

public class VentanaEst extends GradingSystem {

    @FXML
    private TextField Nombretxt;

    @FXML
    private TextField Generotxt;

    @FXML
    private TextField Materiatxt;

    @FXML
    private TextField Notatxt;

    @FXML
    private Button Guardarbtn;

    @FXML
    private Button CargarDatosbtn;

    @FXML
    private TextArea DatosCargtxt;

    @FXML
    private Button Procesarbtn;

    @FXML
    private TextArea Resultadostxt;

    @FXML
    private TextField NombreConstxt;

    @FXML
    private TextField MateriaConstxt;

    @FXML
    private Button Consultarbtn;

    @FXML
    private Button EliminarDatosbtn;

    @FXML
    private Line LineaDiv;

    @FXML
    void CargarDatos(MouseEvent event) {

    }

    @FXML
    void ConsultarDatos(MouseEvent event) {
        Connet conexion = new Connet();
        String resultado = "";
        try{
            Connection cone = conexion.connect();
            
            if(!Nombretxt.getText().equals("") && !Materiatxt.getText().equals("") ){
                String sql = "SELECT * FROM calificaciones WHERE nombre=? and materia=?";
                PreparedStatement ps = cone.prepareStatement(sql);
                ps.setString(1, Nombretxt.getText());
                ps.setString(2, Materiatxt.getText());
                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    while(rs.next()){
                        resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    }
                    System.out.println(resultado);
                    Resultadostxt.setText(resultado);
                }
                cone.close();
                
            }
            //solo nombre
            if(!Nombretxt.getText().equals("")){
                String sql = "SELECT * FROM calificaciones WHERE nombre=?";
                PreparedStatement ps = cone.prepareStatement(sql);
                ps.setString(1, Nombretxt.getText());
                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    while(rs.next()){
                        resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    }
                    System.out.println(resultado);
                    Resultadostxt.setText(resultado);
                }
                cone.close();
                
            }
            //solo materia
            if(!Materiatxt.getText().equals("") ){
                String sql = "SELECT * FROM calificaciones WHERE  materia=?";
                PreparedStatement ps = cone.prepareStatement(sql);
                
                ps.setString(1, Materiatxt.getText());
                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    while(rs.next()){
                        resultado+=rs.getString("nombre")+" "+ rs.getString("genero")+" "+ rs.getString("materia")
                                            +" "+ rs.getString("nota")+ "\n";
                    }
                    System.out.println(resultado);
                    Resultadostxt.setText(resultado);
                }
                cone.close();
                
            }
            //los dos nombre y materia
            

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void EliminarDatos(MouseEvent event) {

    }

    @FXML
    void GuardarDatos(MouseEvent event) {

    }

    @FXML
    void ProcesarDatos(MouseEvent event) {
        try {
            super.estudiantes=[];

        }

    }

}
