package src;

public class TestBanco {

    public static void main(String[] args) {

        CuentaAhorro cuentaAna = new CuentaAhorro("AH001", "Ana Perez", 50000, "2024-01-15");

        CuentaCorriente cuentaLuis = new CuentaCorriente("CC001", "Luis Gomez", 20000);

        CuentaEmpresarial cuentaTech = new CuentaEmpresarial(
                "EM001",
                "Tech Solutions",
                200000,
                "Tech Solutions",
                "123456789-0"
        );

        CuentaAhorro cuentaMaria = new CuentaAhorro("AH002", "Maria Lopez", 15000, "2024-02-01");

        System.out.println("----- INFORMACIÓN INICIAL -----");
        System.out.println();

        cuentaAna.mostrarInfo();
        System.out.println();

        cuentaLuis.mostrarInfo();
        System.out.println();

        cuentaTech.mostrarInfo();
        System.out.println();

        cuentaMaria.mostrarInfo();
        System.out.println();

        System.out.println("----- OPERACIONES -----");
        System.out.println();

        System.out.println("Ana Perez deposita $10000");
        cuentaAna.depositar(10000);
        System.out.println();

        System.out.println("Luis Gomez retira $25000");
        cuentaLuis.retirar(25000);
        System.out.println();

        System.out.println("Tech Solutions retira $10000");
        cuentaTech.retirar(10000);
        System.out.println();

        System.out.println("Maria Lopez intenta retirar $20000");
        cuentaMaria.retirar(20000);
        System.out.println();

        System.out.println("----- INTERESES -----");
        System.out.println();

        cuentaAna.aplicarInteres();
        cuentaLuis.aplicarInteres();
        cuentaTech.aplicarInteres();
        cuentaMaria.aplicarInteres();

        System.out.println();

        System.out.println("----- ESTADO FINAL -----");
        System.out.println();

        cuentaAna.mostrarInfo();
        System.out.println();

        cuentaLuis.mostrarInfo();
        System.out.println();

        cuentaTech.mostrarInfo();
        System.out.println();

        cuentaMaria.mostrarInfo();
        System.out.println();

        System.out.println("----- RESUMEN -----");
        System.out.println();

        int totalCuentas = 4;

        double saldoTotal =
                cuentaAna.getSaldoInicial() +
                        cuentaLuis.getSaldoInicial() +
                        cuentaTech.getSaldoInicial() +
                        cuentaMaria.getSaldoInicial();

        double promedioSaldo = saldoTotal / totalCuentas;

        CuentaBancaria cuentaMayorSaldo = cuentaAna;

        if (cuentaLuis.getSaldoInicial() > cuentaMayorSaldo.getSaldoInicial()) {
            cuentaMayorSaldo = cuentaLuis;
        }

        if (cuentaTech.getSaldoInicial() > cuentaMayorSaldo.getSaldoInicial()) {
            cuentaMayorSaldo = cuentaTech;
        }

        if (cuentaMaria.getSaldoInicial() > cuentaMayorSaldo.getSaldoInicial()) {
            cuentaMayorSaldo = cuentaMaria;
        }

        System.out.println("Total de cuentas: " + totalCuentas);
        System.out.println("Saldo total: $" + saldoTotal);
        System.out.println("Saldo promedio: $" + promedioSaldo);
        System.out.println("Cuenta con mayor saldo: " + cuentaMayorSaldo.getNumeroCuenta());
        System.out.println("Titular: " + cuentaMayorSaldo.getTitular());
        System.out.println("Saldo: $" + cuentaMayorSaldo.getSaldoInicial());

    }
}