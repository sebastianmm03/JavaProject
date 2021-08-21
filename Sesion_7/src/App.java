public class App {
    public static void main(String[] args) throws Exception {
        // en ambientes Estaticos no es necesario instanciar la clase
        estaticos e1 = new estaticos(); 
        estaticos e2 = new estaticos(); 
        estaticos e3 = new estaticos(); 
        no_estaticos e4 = new no_estaticos(); 
        no_estaticos e5 = new no_estaticos(); 
        no_estaticos e6 = new no_estaticos(); 

        estaticos.setName ("Sebastian.");
        // NoEstatico.setName ("Dilan Solar");
        e4.setName ("David");
        e5.setName ("Luis");
        //e6.apellido();
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(e3.getName());
        System.out.println(e4.getName());
        System.out.println(e5.getName());
        System.out.println(e6.getApellido());


    }
}