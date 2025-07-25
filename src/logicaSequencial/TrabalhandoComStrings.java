package logicaSequencial;

public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Joana";
        String nomeDois = "Joana";

       int tamanhoString =  nome.length();
       boolean saoIguais = nome.equals(nomeDois);
        System.out.println("Ola " +  nome.toLowerCase()  + " seu nome tem " + tamanhoString +  " caracteres ");
        System.out.println ("Os nomes são iguais? " + saoIguais);

    }
}
