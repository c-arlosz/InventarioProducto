public class MainProducto {
    public static void main (String[] args){
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        p1.codigo = 01;
        p1.nombre = "laptop";
        p1.precioUnitario = 1500;
        p1.stock = 10;

        p2.codigo = 02;
        p2.nombre = "Mouse";
        p2.precioUnitario = 25;
        p2.stock = 50;

        p1.vender(3);
        p1.reabastecer(5);
        System.out.println("Quedan en stock " + p1.stock);

        p2.vender(51);
        p2.vender(20);
        p2.reabastecer(15);
        System.out.println("Quedan en stock " + p2.stock);

        double inventarioTotal = p1.calcularValorInventario() + p2.calcularValorInventario();
        System.out.println("valor total del inventario");
        System.out.println(inventarioTotal);
    }
}
