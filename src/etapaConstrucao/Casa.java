package etapaConstrucao;

public class Casa {
    public static void main(String[] args) {
        // Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        // Inicializando os atributos (variaveis) (caracteristicas) casa
        casa.numerobanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = " Cinza ";

        //Chamada da função (método) da ordem;
        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Branco");

        casa.alterarCaracteristicas(100, 2, 2, "Madeira");


        int resultado = casa.somarMetragem();
        System.out.println (resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numerobanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();
        





    }

}
