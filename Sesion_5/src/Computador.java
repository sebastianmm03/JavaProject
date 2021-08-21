public class Computador {
    public String Modelo;
    private String SistemaOperativo;
    private String Procesador;
    private String MemoriaRam;
    public String Color;
    public String Marca;

    public Computador(String modelo, String sistemaOperativo, String procesador, String memoriaRam, String color,
            String marca) {
        this.Modelo = modelo;
        SistemaOperativo = sistemaOperativo;
        Procesador = procesador;
        MemoriaRam = memoriaRam;
        Color = color;
        Marca = marca;
    }

    //  public Computador() {
    // }
    
    public Computador(String modelo, String color, String marca) {
        Modelo = modelo;
        Color = color;
        Marca = marca;
    }

    // Generacion de los Getters and Setters
    // Public es el parametro de visibilidad, string es el tipo de dato y getSistemaOperativo es el nombre,
    // en el return se esta tornando un atributo privado


    public String getSistemaOperativo() {
        return SistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }
    public String getMemoriaRam() {
        return MemoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        MemoriaRam = memoriaRam;
    }

}
