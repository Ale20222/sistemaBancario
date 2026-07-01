public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;
    private double porcentajeComisionSobregiro;

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public double getPorcentajeComisionSobregiro() {
        return porcentajeComisionSobregiro;
    }

    public CuentaCorriente (String numeroCuenta, String titular, double saldo, double limiteSobregiro, double porcentajeComisionSobregiro) {
        super(numeroCuenta, titular, saldo, 0.0);
        this.limiteSobregiro = limiteSobregiro;
        this.porcentajeComisionSobregiro = porcentajeComisionSobregiro;
    }

    public CuentaCorriente (String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo, 0.0);
        this.limiteSobregiro = 50000;
        this.porcentajeComisionSobregiro = 5.0;
    }
    @Override
    public void retirar(double monto){
        if (monto <= saldo + limiteSobregiro){
            saldo -= monto;
            if (saldo < 0){
                double montoSobregiro = saldo * -1;
                double comision = montoSobregiro * (porcentajeComisionSobregiro/100);
                saldo -= comision;
                System.out.prinIn("Retiro exitoso");
                System.out.prinIn("La comision por el sobregiro es: " + comision);
            }
            System.out.prinIn("Su saldo es: " + saldo);
        }
        else {
            System.out.prinIn("Error, el monto supera el limite de sobregiro permitido");
        }
    }
    @Override
    public void mostrarInfo (){
        super.mostrarInfo ();
        System.out.prinIn("El limite de sobregiro es: " + limiteSobregiro);
        System.out.prinIn("El porcentaje de comision de sobregiro es: " + porcentajeComisionSobregiro);
    }
}
