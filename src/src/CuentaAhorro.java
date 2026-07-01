package src;

public class CuentaAhorro extends CuentaBancaria {

    private String fechaApertura;

    public CuentaAhorro(String numeroCuenta, String titular, double saldo, String fechaApertura) {

        super(numeroCuenta, titular, saldo, 2.5);

        if (saldo >= 10000) {
            this.fechaApertura = fechaApertura;
        } else {
            System.out.println("Error, el saldo mínimo para abrir la cuenta es de $10000.");
        }

    }
    @Override
    public void retirar(double monto) {

        if (monto <= saldo) {

            saldo -= monto;

            System.out.println("Retiro exitoso.");
            System.out.println("Su saldo es: $" + saldo);

        } else {

            System.out.println("No tiene saldo suficiente.");

        }

    }
    @Override
    public void mostrarInfo() {

        super.mostrarInfo();

        System.out.println("Fecha de apertura: " + fechaApertura);

    }
}