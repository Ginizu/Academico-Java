import java.util.Date;

public class OperadoresAri {
    public static void main(String[] args) throws Exception {
       int soma = 4 + 5;
       int sub = 32 - 4;
       int multi = 20 * 3;
       int div = 15 / 3;
       int modulo = 18 % 3;
       double resultado = (15 * 3) + (20 / 4);

       // operador de adição quando ultilizado em vairvaeis de texto efetua a concatenação de texto

       String nomeCompleto = "Linguagem " + "Java";

       System.out.println(nomeCompleto);
        //Concatenações e seus resultados

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1" +(1+1+1);

        System.out.println(concatenacao);

    }
}
