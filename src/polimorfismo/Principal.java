package polimorfismo;

public class Principal {
    public static void main(String[] args) {
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 6.90;
        double arroz = 5.90;
        Integer batata = 5;
        Integer cenoura = 6;
        Integer melancia = 7;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);


        Carro fusca = new Carro();
        fusca.mover();


    }

}
