import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class App {
    public static void main(String[] args) throws Exception {
        /*Ejemplo 1
        String B[]=new String[4];
        B[0]="a";
        B[1]="b";
        B[2]="c";
        B[3]="d";

        System.out.println(B[3]);*/

        //Ejemplo 2

        /*int X[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<X.length;i++){
        System.out.println(X[i]);
        System.out.println(X[i]);
        }*/

        /*Ejemplo 3

        ArrayList<Object> b = new ArrayList<>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}*/

        // int suma=0;
        // Scanner Entrada= new Scanner(System.in);
        // System.out.print("Ingrese el tamaño del vector: ");
        // int T= Entrada.nextInt();
        // Integer Vector[]=new Integer[T];
        // for(int i=0;i<Vector.length;i++){
        //     System.out.print("Ingresa valor "+(i+1)+": ");
        //     Vector[i]=Entrada.nextInt();
        //     suma+=Vector[i];
        // }
        // for(int j=0;j<Vector.length;j++)
        // System.out.print(Vector[j]+" | ");
        // System.out.println();
        // System.out.println("Suma: "+suma);
        // System.out.println("Promedio: "+(suma/Vector.length));

        // //Forma 1 a pedal
        // int Mayor=Vector[0];
        // for(int k=1;k<Vector.length;k++){
        //     if(Vector[k]>Mayor)
        //     Mayor=Vector[k];
        //     }

        // int Menor=Vector[0];
        // for(int k=1;k<Vector.length;k++){
        //     if(Vector[k]<Menor)
        //     Menor=Vector[k];
        //     }
        
        // System.out.println("--------------------");

        // System.out.println("Máx_Forma 1: "+Mayor);
        // System.out.println("Mín_Forma 1: "+Menor);

        // System.out.println("--------------------");

        // //Forma 2 utilizando Collection

        // int Mayor_2= Collections.max(Arrays.asList(Vector));
        // int Menor_2= Collections.min(Arrays.asList(Vector));
        // System.out.println("Máx_Forma 2: "+Mayor_2);
        // System.out.println("Mín_Forma 2: "+Menor_2);

        // System.out.println("--------------------");

        // //Forma 3
        // Arrays.sort(Vector);
        // System.out.println("Mín_Forma 3: "+Vector[0]);
        // System.out.println("Máx_Forma 3: "+Vector[Vector.length-1]);


        int Matriz[][]={{1,2,3},{6,5,4}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t"+Matriz[i][j]); /* "\t" dejar la tabulación*/
            }
            System.out.println();
        
        }

        
    }
}
