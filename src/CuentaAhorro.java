public class CuentaAhorro extends CuentaBancaria {
    private String fechaApertura;

    public CuentaAhorro (String numeroCuenta, String titular, double saldo, String fechaApertura){
        super(numeroCuenta, titular, saldo, 2.5);
        if (saldo >= 10000){
            this.fechaApertura = fechaApertura;
        }
        else {
            System.out.printIn("Error, el saldo minimo para abrir la cuenta es de $10000");
        }
    }
        @Override
    public void retirar (double monto){
            if (monto <= saldo){
                saldo -= monto;
                System.out.printIn("Retiro exitoso");
                System.out.printIn("Su saldo es: " + saldo);
            }
            else {
                System.out.printIn("No tiene dinero : ");
            }
        }
        @Override
    public void mostrarInfo () {
            super.mostrarInfo ();
            System.out.printIn("Fecha de apertura: " + fechaApertura);
    }
}
