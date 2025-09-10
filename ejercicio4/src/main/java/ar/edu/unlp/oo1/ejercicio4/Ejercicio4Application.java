package ar.edu.unlp.oo1.ejercicio4;

public class Ejercicio4Application {
    public static void main(String[] args) {

        Balanza bal = new Balanza();
        Producto queso = new Producto("Queso", 0.1, 140);
        Producto jamon = new Producto("Jamón", 0.1, 90);
        System.out.println();

        System.out.println("Balanza sin productos");
        System.out.println("---------------------");
        System.out.println("Cantidad de Productos: " + bal.getCantidadDeProductos());
        System.out.println("Peso Total: " + bal.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + bal.getPrecioTotal());

        Ticket ticket0 = bal.emitirTicket();
        System.out.println();
        System.out.println("Ticket sin productos");
        System.out.println("---------------------");
        System.out.println("Cantidad de Productos: " + ticket0.getCantidadDeProductos());
        System.out.println("Peso total: " + ticket0.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + ticket0.getPrecioTotal());
        System.out.println("Fecha: " + ticket0.getFecha());
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Balanza con queso");
        System.out.println("-----------------");
        bal.agregarProducto(queso);
        System.out.println("Cantidad de Productos: " + bal.getCantidadDeProductos());
        System.out.println("Peso Total: " + bal.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + bal.getPrecioTotal());

        Ticket ticket = bal.emitirTicket();
        System.out.println();
        System.out.println("Ticket con queso");
        System.out.println("---------------------");
        System.out.println("Cantidad de Productos: " + ticket.getCantidadDeProductos());
        System.out.println("Peso total:" + ticket.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + ticket.getPrecioTotal());
        System.out.println("Fecha: " + ticket.getFecha());
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Balanza con queso y jamon");
        System.out.println("---------------------");
        bal.agregarProducto(jamon);
        System.out.println("Cantidad de Productos: " + bal.getCantidadDeProductos());
        System.out.println("Peso Total: " + bal.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + bal.getPrecioTotal());

        Ticket ticket2 = bal.emitirTicket();
        System.out.println();
        System.out.println("Ticket con queso y jamon");
        System.out.println("---------------------");
        System.out.println("Cantidad de Productos: " + ticket2.getCantidadDeProductos());
        System.out.println("Peso total:" + ticket2.getPesoTotal() + "Kg.");
        System.out.println("Precio Total: $" + ticket2.getPrecioTotal());
        System.out.println("Fecha: " + ticket2.getFecha());
        System.out.println("---------------------");
    }
}