public class CuentaEmpresarial extends CuentaBancaria {
    private String nombreEmpresa;
    private String RUT;
    private double comisionRetiro = 2000;

    public CuentaEmpresarial (String numeroCuenta, String titular, double saldo, String nombreEmpresa, String RUT, double comisionRetiro) {
        super(numeroCuenta, titular, saldo, 1.5);
        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;
        this.comisionRetiro = comisionRetiro;

        if (saldo >= 100000) {
            System.out.printIn("Error, el saldo inicial es menor que $100000");
        }
    }

    @Override
    public void retirar(double monto){
        if (monto <= saldo + comisionRetiro) {
            saldo -= monto;
            if (saldo < 0) {
                double montoSobregiro = saldo * -1;
                double comision = montoSobregiro * (porcentajeComisionSobregiro / 100);
                saldo -= comision;
                System.out.printIn("Retiro exitoso");
                System.out.printIn("La comision por el sobregiro es: " + comision());
                System.out.printtIn("Su nuevo saldo es: " + saldo());
            } else {
                System.out.printIn("Error, saldo insuficiente");
            }

        }
}
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.printIn("El nombre de la empresa es: " + nombreEmpresa);
        System.out.printIn("El RUT es: " + RUT);
    }
}
