package ejer19noviembre;

public class Transferencia extends MetodoPago {
    private String banco;

    public Transferencia(String titular, double limite, String banco) {
        super(titular, limite);
        this.banco = banco;
    }

    @Override
    public double calcularComision(double monto) {
        return 1.50; // Comisión fija de 1.50
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nBanco: " + banco;
    }
}