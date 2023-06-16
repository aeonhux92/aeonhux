import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese mes de su factura:");
        String nombreStr = scanner.nextLine();
        System.out.println("Ingrese el subtotal de su factura:");
        Double montoStr = scanner.nextDouble();
        double montoMasIva = montoStr*0.19;
        double montoTotal = montoStr+montoMasIva;

        String  nombreFactura = "La factura de " +  nombreStr;

        String monto = " tiene un subtotal de " + montoStr;

        String facturaImpuesto = ", con un total de impuestos trasladados (IVA) de " + montoMasIva;

        String totalFactura = ", dando un total de " + montoTotal;

        String mensaje = nombreFactura + monto + facturaImpuesto + totalFactura;
        System.out.println(mensaje);
                

    }
}
