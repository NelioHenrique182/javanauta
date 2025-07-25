package etapaConstrucao;

public class PlantaCasa implements Construcao {
    //Atributos

    public   int metragem;
    public   int numeroQuartos;
    public int numerobanheiros;
    public String cor;
    public  String material;

    @Override
    public void construir(){

        System.out.println (" A casa foi construida. as caracteristicas são: ");
        System.out.println ("Metragem " + metragem);
        System.out.println ("Numero de quartos  " + numeroQuartos);
        System.out.println ("numero de banheiros " + numerobanheiros);
        System.out.println ("Material " + material);
    }
    // Anotação
    @Override
    public void pintar(String cor) {
        System.out.println ("pintando a casa com a cor " + cor);

    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintar(){
        System.out.println ("A casa foi pintada de " + cor);

    }

    public void mudarCorParede(String novaCor){
        cor=novaCor;
        pintar();
    }

    public int somarMetragem (){
       return metragem * numerobanheiros + numeroQuartos;

    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numerobanheiros = banheiros;
        material = mat;
        construir();
    }
}

