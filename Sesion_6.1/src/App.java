public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner Entrada=new java.util.Scanner(System.in);
        Producto P1=new Producto();
        System.out.println("Digite Código: ");
        String Codigo=Entrada.nextLine();
        System.out.println("Digite Precio de Compra: ");
        int PCompra=Entrada.nextInt();
        System.out.println("Digite Cantidad en Bodega: ");
        int CBodega=Entrada.nextInt();
        System.out.println("Digite Cantidad minima requerida: ");
        int CanminBodega=Entrada.nextInt();
        P1.Codigo=Codigo;
        P1.Pcompra=PCompra;
        P1.CBodega=CBodega;
        P1.CminBodega=CanminBodega;

        if(P1.SolicitarPedido())
        System.out.println("Alerta existencias insuficientes");

        P1.Imprimir();

    }
}
