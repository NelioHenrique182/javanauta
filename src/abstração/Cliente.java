package abstração;

public class Cliente extends Endereço implements Pessoa{
    private String nome;
    private String documento;

    public Cliente(String rua, String cidade, String estado, String cep, String nome,
                   String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
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
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
    @Override
    public void mostrarEndereco(){
        System.out.println ("Endereço do cliente " + getRua() + "," + getCidade() +", ," + getEstado() + "," + getCep());


    }

}
