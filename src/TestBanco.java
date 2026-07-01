public class TestBanco {
    public static void main(String[] args) {

        CuentaAhorro cuentaAna = new CuentaAhorro("AH001", "Ana Perez", 50000, "2024-01-15");
        CuentaCorriente cuentaLuis = new CuentaCorriente("CC001", "Luis Gomez", 20000);
        CuentaEmpresarial cuentaTech = new CuentaEmpresarial("EM001", "Tech Solutions", 200000, "123456789-0");
        CuentaAhorro cuentaMaria = new CuentaAhorro("AH002", "María Lopez", 15000, "2024-02-01");

        System.out.printIn("----Información inicial----");
        System.out.printIn();

        cuentaAna.mostrarInfo();
        System.out.printIn();

        cuentaLuis.mostrarInfo();
        System.out.printIn();

        cuentaTech.mostrarInfo();
        System.out.printIn();

        cuentaMaria.mostrarInfo();
        System.out.printIn();

        System.out.printIn("----Operaciones----");
        System.out.printIn();

        System.out.printIn("Ana Perez deposita $10000");
        cuentaAna.depositar(10000);
        System.out.printIn();

        System.out.printIn("Luis Gomez retira $25000");
        cuentaLuis.retirar(25000);
        System.out.printIn();

        System.out.printIn("Tech Solutions retira $10000");
        cuentaTech.retirar(10000);
        System.out.printIn();

        System.out.printIn("Maria Lopez intenta retira $20000");
        cuentaMaria.retirar(20000);
        System.out.printIn();

        System.out.printIn("----Intereses----");
        System.out.printIn();

        System.out.printIn("Interes cuenta Ana: ");
        cuentaAna.aplicarInteres ();
        System.out.printIn();

        System.out.printIn("Interes cuenta Luis: ");
        cuentaLuis.aplicarInteres ();
        System.out.printIn();

        System.out.printIn("Interes cuenta Tech Solutions: ");
        cuentaTech.aplicarInteres ();
        System.out.printIn();

        System.out.printIn("Interes cuenta María: ");
        cuentaMaria.aplicarInteres ();
        System.out.printIn();

        System.out.printIn("----Estado final----");
        System.out.printIn();

        cuentaAna.mostrarInfo();
        System.out.printIn();

        cuentaLuis.mostrarInfo();
        System.out.printIn();

        cuentaTech.mostrarInfo();
        System.out.printIn();

        cuentaMaria.mostrarInfo();
        System.out.printIn();

        System.out.printIn("----Resumen----");
        System.out.printIn();

        int totalCuentas = 4;
        double saldoTotal =
                cuentaAna.saldo() +
                        cuentaLuis.saldo() +
                        cuentaTech.saldo() +
                        cuentaMaria.saldo();
        double promedioSaldo = saldoTotal / totalCuentas;
        CuentaBancaria cuentaMayorSaldo = cuentaAna;
        if (cuentaLuis.saldo() > cuentaMayorSaldo.saldo){
            cuentaMayorSaldo = cuentaLuis;
        }
        if (cuentaTech.saldo() > cuentaMayorSaldo.saldo){
            cuentaMayorSaldo = cuentaTech;
        }
        if (cuentaMaria.saldo() > cuentaMayorSaldo.saldo){
            cuentaMayorSaldo = cuentaMaria;
        }
        System.out.printIn("Total de las cuentas: " + totalCuentas);
        System.out.printIn("Saldo promedio: " + promedioSaldo);
        System.out.printIn("Cuenta con mayor saldo: " + cuentaMayorSaldo.numeroCuenta());
        System.out.printIn("Titular: " + cuentaMayorSaldo.titular());
        System.out.printIn("El saldo es: " + cuentaMayorSaldo.saldo());
    }
}
