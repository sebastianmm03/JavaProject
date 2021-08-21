public class GradingSystem {

    public static String[] nombres={"armando","nicolas","daniel","maria","marcela","alexandra"};
    public static String[] materias={"historia", "literatura", "biologia"};

    protected int cantDatos;
    protected float[][] datos;

    public float stat1(){
        float suma;
        suma=0;
        float promedio;
        for (int i=0;i<cantDatos;i++){
        //suma = suma+nota;
        suma = suma + datos[i][3];
        }
        promedio=suma/cantDatos;
        return promedio;
    }
        
    public int stat2(){
        int cont=0;
        for (int i=0; i<cantDatos; i++){
        if (datos[i][3] >2.5 && datos[i][3]<=3.5){
            cont++;
            }
    
        }
        return cont;
        
    }
    

    public String stat3(){
        //String menor="";
        int Con_Hist=0, Con_Lit=0, Con_Bio=0;
        float sum_Hist=0.00f, sum_Lit=0.00f, sum_Bio=0.00f;
        float prom_Hist=0.0f, prom_Lit=0.0f, prom_Bio=0.0f;

        for (int k=0; k< cantDatos; k++){
            if (datos[k][1]==0.0){
                if (datos[k][2]==1){
                    sum_Hist+=datos[k][3];
                    Con_Hist++;
                }
                else if (datos[k][2]==2){
                    sum_Lit+=datos[k][3];
                    Con_Lit++;
                }
                else if (datos[k][2]==3){
                    sum_Bio+=datos[k][3];
                    Con_Bio++;
            
            }
        }


    }
            prom_Hist=sum_Hist/Con_Hist;
            prom_Lit=sum_Lit/Con_Lit;
            prom_Bio=sum_Bio/Con_Bio;
            float prom_Menor=1000;
            String menor="";
            //int id=0;
            if (prom_Hist<prom_Menor){
                prom_Menor=prom_Hist;
                menor=materias[0];
                //id=1;
            }
            if (prom_Lit<prom_Menor){
                prom_Menor=prom_Lit;
                menor=materias[1];
                //id=2;
            }
            if (prom_Bio<prom_Menor){
                prom_Menor=prom_Bio;
                menor=materias[2];
            //return materias[id];
            }
            return menor;
}

    public String stat4(){
        
        float mejorProm=0;
        int mejorEstud=0;
        for (int i=0; i<cantDatos; i++){
            if (datos[i][2]==1.0 && datos[i][3]>mejorProm){
                mejorProm=datos[i][3];
                mejorEstud=(int)Math.round(datos[i][0]);
            }
        }
        return nombres[mejorEstud-1];
    }
}