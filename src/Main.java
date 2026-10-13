//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ImpresoraFiscal impresora = new ImpresoraFiscal();
    CajaRegistradora caja = new CajaRegistradora(impresora);

    Factura factura = new Factura(1001, "Lucía Fernández");
    factura.agregarItem(new ItemFactura("Milanesa con papas", 2, 4500.0));
    factura.agregarItem(new ItemFactura("Ensalada César", 1, 2800.0));
    factura.agregarItem(new ItemFactura("Gaseosa 500ml", 3, 1200.0));

    caja.cerrarVenta(factura);

}
