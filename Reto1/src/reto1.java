import java.util.*;
public class reto1 {
    public static void main(String[] args) throws Exception {
        String[] nombres = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"};
        String[] materias = {"historia", "literatura", "biologia"};

        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int con_reg=0;
        float suma=0.00f;
        input.nextLine();
        int con_hist=0, con_litera=0, con_bio=0;
        float suma_hist=0.00f, suma_litera=0.00f, suma_bio=0.00f;
        float prom_hist=0.0f , prom_litera=0.0f, prom_bio=0.0f; 
        double mayor_nota= 0.0;
        int estudiante=0;
        for(int i=0 ;i<n ;i++){
            String text =input.nextLine();
            // dividirla
            String [] datos= text.split(" ");
            //transformarla
            double est = Double.parseDouble(datos[0]);
            double gen =Double.parseDouble(datos[1]);
            double mate =Double.parseDouble(datos[2]);
            double not =Double.parseDouble(datos[3]);
            suma+=not;
        
        if (not>2.5 && not<=3.5){
            con_reg++;
        }
        if(gen==0.0 && mate==1.0){
            con_hist++;
            suma_hist+=not;
        }
        if(gen==0.0 && mate==2.0){
            con_litera++;
            suma_litera+=not;
        }
        if(gen==0.0 && mate==3.0){
            con_bio++;
            suma_bio+=not;
        }
        if (mate==1.0){
            if (not>mayor_nota){
                mayor_nota=not;
                estudiante=(int)Math.round(est);
            }
        }
    }    
    String menor="";
    prom_hist=suma_hist/con_hist;
    prom_litera=suma_litera/con_litera;
    prom_bio=suma_bio/con_bio;
    if (prom_hist<prom_litera && prom_hist<prom_bio){
        menor=materias[0];
    }
    if (prom_bio<prom_hist && prom_bio<prom_litera){
        menor=materias[2];
    }
    if (prom_litera<prom_hist && prom_litera<prom_bio){
        menor=materias[1];
    }


    float promedio= suma/n;
    System.out.printf("%.2f %n", promedio);
    System.out.println(con_reg);
    System.out.println(menor);
    System.out.println(nombres[estudiante-1]);

    // o estudiante
    // 1 genero
    // 2 Materias
    // 3 Nota
    input.close();

}
}

