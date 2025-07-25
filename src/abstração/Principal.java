package abstração;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das flores", "São Paulo",
                "1547", "SP", "06145-082", "Joao Paulo",
                "00000000","Vendedor");
        Cliente joana = new Cliente("Rua das rosas", "Rio de janeiro",
                "RJ","00000000", "Joana De Assis", "000000");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();

    }
}
