package src;
public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    protected double saldo;
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
    public CuentaBancaria(String numeroCuenta, String titular, double saldo, double tasaInteres) {

        if (saldo < 0) {
            System.out.println("El saldo inicial no puede ser negativo.");
        } else if (tasaInteres < 0) {
            System.out.println("La tasa de interés no puede ser negativa.");
        } else {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldo;
            this.tasaInteres = tasaInteres;
        }
    }
    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Se ingresaron $" + monto);
            System.out.println("Tu nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Error, el monto debe ser mayor que 0.");
        }
    }
    public abstract void retirar(double monto);

    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        saldo += interes;

        System.out.println("Interés generado: $" + interes);
        System.out.println("Saldo actualizado: $" + saldo);

    }
    public void mostrarInfo() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tasa de interés: " + tasaInteres + "%");
    }

}