package ejer19noviembre;

public class Main {
    public static void main(String[] args) {
        MetodoPago pago1 = new Tarjeta("Karem", 1000, "1234");
        MetodoPago pago2 = new Transferencia("Domenica", 2000, "Produbanco");
        MetodoPago pago3 = new BilleteraDigital("Juan", 500, "Deuna");

        Compra compra1 = new Compra(100, pago1);
        Compra compra2 = new Compra(100, pago2);
        Compra compra3 = new Compra(100, pago3);

        System.out.println("--- Compra 1 (Tarjeta) ---");
        System.out.println(compra1.mostrarInformacion());

        System.out.println("\n--- Compra 2 (Transferencia) ---");
        System.out.println(compra2.mostrarInformacion());

        System.out.println("\n--- Compra 3 (Billetera Digital) ---");
        System.out.println(compra3.mostrarInformacion());
    }
}