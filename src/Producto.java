public class Producto {
    int codigo;
    String nombre;
    double precioUnitario;
    int stock;

    void reabastecer(int cantidad){
        stock = stock + cantidad;
    }
    boolean vender(int cantidad){
        if (stock >= cantidad){
            stock = stock - cantidad;
            double totalPagar = cantidad * precioUnitario;
            System.out.println("vendio " + cantidad + " " + nombre + ", total a pagar " + totalPagar);
            return true;
        }else{
            System.out.println("Stock insuficiente");
            return false;
        }
    }
    double calcularValorInventario(){
        return precioUnitario * stock;
    }
}
