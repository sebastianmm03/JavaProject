public class App {
    public static void main(String[] args) throws Exception {
        Computador C1=new Computador("Cualquiera","Negro","Hp");
        C1.Color="Blanco";
        C1.Marca="HP";
        C1.setMemoriaRam("12 Gb");
        C1.Modelo="Cualquiera";
        C1.setProcesador("i7");
        C1.setSistemaOperativo("Windows 10");

        System.out.println("Mi sistema operativo es " +C1.getSistemaOperativo()+ ", tengo de memoria ram " +C1.getMemoriaRam()+ ", y mi procesador es " +C1.getProcesador());
    }
}
