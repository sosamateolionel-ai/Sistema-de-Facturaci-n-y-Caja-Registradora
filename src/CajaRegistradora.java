public class CajaRegistradora {

    private ImpresoraFiscal impresora; // asociación: referencia a la impresora

    public CajaRegistradora(ImpresoraFiscal impresora) {
        this.impresora = impresora;
    }

    public void cerrarVenta(Factura factura) {

        if (factura.getItems().isEmpty()) {
            System.out.println("Caja: la factura " + factura.getNumero() + " no tiene ítems, no se puede cerrar la venta.");
            return;
        }

        System.out.println("Caja: cerrando venta de la factura " + factura.getNumero() + "...");

        impresora.imprimirDocumento(factura);
    }
}