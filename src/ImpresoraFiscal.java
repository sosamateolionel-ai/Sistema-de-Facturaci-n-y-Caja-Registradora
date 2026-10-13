public class ImpresoraFiscal {

    public void imprimirDocumento(Factura factura) {

        System.out.println("\n==============================================");
        System.out.println("               TICKET FISCAL");
        System.out.println("==============================================");
        System.out.println("Factura N°: " + factura.getNumero());
        System.out.println("Cliente   : " + factura.getCliente());
        System.out.println("----------------------------------------------");
        System.out.printf("%-20s %4s %9s %9s%n", "Descripción", "Cant", "P.Unit", "Subtotal");
        System.out.println("----------------------------------------------");

        for (ItemFactura item : factura.getItems()) {
            System.out.printf("%-20s %4d %9.2f %9.2f%n",
                    item.getDescripcion(),
                    item.getCantidad(),
                    item.getPrecioUnitario(),
                    item.getSubtotal());
        }

        System.out.println("----------------------------------------------");
        System.out.printf("%-35s %9.2f%n", "TOTAL:", factura.calcularTotal());
        System.out.println("==============================================");
    }
}