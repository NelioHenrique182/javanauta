package contaBancaria;

public class Agencia {
    public static void main(String[] args) {
        Contabancaria minhaConta = new Contabancaria("Henrique ", 500);

        minhaConta.setTitular("Nélio Henrique");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println ( "O titular da conta é: " + titularConta + " e o saldo final é " + saldoFinal);

        Contabancaria contaMinhaMae = new Contabancaria("Maria");
        System.out.println ( "O titular da conta é: " + contaMinhaMae.getTitular() + " e o saldo final é " + contaMinhaMae.getSaldo());
        

    }
}
