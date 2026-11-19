package ejer19noviembre;

public class BilleteraDigital extends MetodoPago {
    private String proveedor;

    public BilleteraDigital(String titular, double limite, String proveedor) {
        super(titular, limite);
        this.proveedor = proveedor;
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.015; // 1.5% de comisión
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nProveedor: " + proveedor;
    }
}