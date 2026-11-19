package ejer19noviembre;

public class MetodoPago {
    private String titular;
    private double limite;

    public MetodoPago(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public double calcularComision(double monto) {
        return 0.0;
    }

    public String mostrarInformacion() {
        return "Titular: " + titular + "\nLimite: " + limite;
    }
}