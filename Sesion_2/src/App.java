import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.print("Esta prueba es sin salto de linea");
        // System.out.println("Esto es una prueba con salto de linea");
        // System.out.print("Estas es una prueba sin salto de linea");
        // String Genero="Femenino";
        // System.out.println("El Genero es: "+Genero);
        // System.out.println(String.format("El Genero de la profesora es %s ", Genero));
        // int Edad=17;
        // System.out.println(String.format("La edad de la profesora es %d ", Edad));
        // float Peso=60.23456789125489652f;
        // System.out.printf("El peso de la profesora es %.2f ", Peso);
        // System.out.println(String.format("El peso de la profesora es %.2f %n ", Peso));
        // System.out.println(String.format("El Genero de la profesora es %s, tiene %d y pesa %.2f ",Genero ,Edad ,Peso));

        // Scanner Entrada=new Scanner(System.in);
        // System.out.print("Digite el nombre: ")
        // String Nombre=Entrada.nextLine();
        // System.out.print("Digite Peso: ");
        // float Peso=Entrada.nextFloat();
        // // System.out.println(Peso);
        // System.out.print("Digite Edad: ");
        // Int Edad=Entrada.nextInt();
        // System.out.printf("Tu nombre es %s, tienes %d y pesas %f", Nombre, Edad, Peso);

        Scanner Entrada= new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros que desea ver: ");
        int n=Entrada.nextInt();
        for(int i=2;i<=n*2;i++){
            if(i%2==0){
                System.out.println(i);

    }
}
