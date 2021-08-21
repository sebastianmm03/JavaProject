public class Producto {
    String Codigo;
    int Pcompra;
    int CBodega;
    int CminBodega;

    boolean SolicitarPedido(){
        return CBodega<CminBodega;
        // if(CBodega<CminBodega)
        // return true;
        // else 
        // return false;

    }

    void Imprimir(){
        String Solicitar;
        if(SolicitarPedido())
        Solicitar= "Si";
        else
        Solicitar="No";
        System.out.printf("El artículo de código %s %ncon %d existencias, requiere solicitar %s %n",Codigo, CBodega, Solicitar, CminBodega);
        
    }
}
