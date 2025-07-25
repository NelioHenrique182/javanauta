package contaBancaria;

public class Contabancaria {
    // Atributos Privados
    private String titular;
    private double saldo;


    // Getter e Setter - métodos padrões para acessar e modificar os atributos

    // Metodo para obter o titular
    public String getTitular(){
        return titular;

    }

    // metodo para modificar o titular
    public void setTitular(String titular){
        this.titular = titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor com atributos
    public Contabancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem atributos
    public Contabancaria() {
    }

    //construtor com 1 atributo
    public Contabancaria(double saldo){
        this.saldo = saldo;

    }
     //construtor que inicializa a conta bancaria com saldo 0
    public Contabancaria(String titular){
        this.titular = titular;
        this.saldo = 0;

    }
}
