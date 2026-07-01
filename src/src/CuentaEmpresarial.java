package src;

public class CuentaEmpresarial extends CuentaBancaria {

    private String nombreEmpresa;
    private String RUT;
    private double comisionRetiro = 2000;

    public CuentaEmpresarial(String numeroCuenta, String titular, double saldo,
                             String nombreEmpresa, String RUT) {

        super(numeroCuenta, titular, saldo, 1.5);

        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;

        if (saldo < 100000) {
            System.out.println("Error, el saldo mínimo es de $100000.");
        }
    }
    @Override
    public void retirar(double monto) {

        if (monto + comisionRetiro <= saldo) {
            saldo -= monto;
            saldo -= comisionRetiro;

            System.out.println("Retiro exitoso.");
            System.out.println("Comisión por retiro: $" + comisionRetiro);
            System.out.println("Nuevo saldo: $" + saldo);

        } else {
            System.out.println("Error, saldo insuficiente.");

        }

    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("RUT: " + RUT);

    }
}