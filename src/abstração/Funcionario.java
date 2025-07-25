package abstração;

public class Funcionario extends Endereço implements Pessoa {
    private String nome;
    private String Documento;
    private String cargo;

    public Funcionario(String rua, String cidade, String numero, String estado, String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        Documento = documento;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return Documento;
    }

    @Override
    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public void mostrarEndereco(){
        System.out.println ("Endereço do funcionario " + getRua() + "," + getCidade() +"," + getNumero() + "," + getEstado() + "," + getCep());


    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", Documento='" + Documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
