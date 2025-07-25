package logicacondicional;

public class EstruturaIfElse {
    public static void main(String[] args) {


  //      int idade = 30;

  //      if (idade >= 18) {//         System.out.println("Voce é maior de idade");
  //      } else {
 //           System.out.println("voce é menor de idade");
 //       }

  //      boolean estaChovendo = true;

 //      if(!estaChovendo){


//        System.out.println(" Vamos sair para passear");
   // }
   //     else

 //   {
 //       System.out.println("Vamos Ficar em etapaConstrucao.Casa");
 //   }

        boolean temDinheiro = true;
        boolean temCartao = true;

        if(temDinheiro && temCartao){
            System.out.println ("Pede um ifood e um ze delivery");
        }

        else if (temDinheiro || temCartao) {
            System.out.println (" Pede um Ifood");
        }

        else {
            System.out.println ("Não pede nada");
        }
 //exemplo de operador ternario abaixo

        String mensagem = (temDinheiro) ? "pede um ifood" : "come  o quem tem casa";
        System.out.println (mensagem);









    }

}








