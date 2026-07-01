public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public CuentaBancaria (String numeroCuenta, String titular, double saldo, double tasaInteres){
        if (saldo < 0){
            System.out.printIn("El saldo inicial no puede ser negativo");
        }
        else if (tasaInteres < 0){
            System.out.printIn("La tasa de interes no puede ser negativo");
        }
        else {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
        }
    }
        public void depositar (double monto){
            if (monto > 0){
                saldo += monto;
                System.out.printIn("Se ingresaron $: " + monto);
                System.out.printIn("Tu nuevo saldo es: " + saldo);
            }
            else {
                System.out.printIn("Error, monto a depositar debe ser mayor a 0");
            }
        }

        public abstract void retirar (double monto);
        public void aplicarInteres (){
            double interes = saldo * (tasaInicial/100);
            saldo += interes;
            System.out.printIn("Interes generado: " + interes);
            System.out.printIn("Saldo actualizado: " + saldo);
        }

        public void mostrarInfo (){
            System.out.printIn("Número de cuenta: " + numeroCuenta);
            System.out.printIn("Titular: " + titular);
            System.out.printIn("Su saldo es: " + saldo);
            System.out.printIn("Tasa de interes: " + tasaInteres + "%");
        }
}
