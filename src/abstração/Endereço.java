package abstração;

public abstract class Endereço {
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    public Endereço() {
    }

    public Endereço(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereço(String rua, String cidade, String numero, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void mostrarEndereco(){
        System.out.println ("Endereço " + rua + "," + cidade +"," + numero + "," + estado + "," + cep);

    }
}
