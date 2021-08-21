import java.util.Scanner;
public class SchoolGradingSystem extends GradingSystem {

    public void loadData(){
        Scanner entrada = new Scanner(System.in);
        num_regis=Integer.parseInt(entrada.nextLine());
        datos = new float[num_regis][4];
        for(int i=0; i<num_regis;i++){
            for(int j=0;j<4;j++){
                datos[i][j]= Float.parseFloat(entrada.next()); 
            }
        }
        entrada.close();
    }
}