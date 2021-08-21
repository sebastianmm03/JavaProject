public class Persona {
    private int Identificacion;
    private String Nombre;
    private int Edad;
    
    // Getters and Setter

    public Persona() {
    }

    public Persona(int identificacion, String nombre) {
        Identificacion = identificacion;
        Nombre = nombre;
    }



    public int getIdentificacion() {
        return Identificacion;
    }
    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Su identificacion es: "+Identificacion);
        System.out.println("Su nombre es: "+Nombre);
        System.out.println("Su edad es: "+Edad);
        

    }
}
