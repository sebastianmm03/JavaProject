import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader f = new FXMLLoader(getClass().getResource("/Ventana.fxml")); //Asocio el formulario
        Parent p = f.load(); //Cargar el formulario
        Scene s = new Scene(p); // Crear un Escena
        arg0.setTitle("Reto 4"); //Colocar un titulo
        arg0.setScene(s); // Asociar la escena
        arg0.show();    
    }
}
