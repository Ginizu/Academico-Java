import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        //Existem key words na linguagem, ou seja, palavras que não podem ser usadas como objeto 
        //São chamados também de tipos primitivos: int, byte, short, long, float, double, boolean e char
        double salarioMinimo = 2500;
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98776832787L; // se começar com zero, talvez tenha que ser outro tipo. Deve terminar com L
        Float pi = 3.14F; 

        final double VALOR_DE_PI = 3.14;

        
       String nome = "Fumaça";
       double peso = 68.40;
       char genero = 'M';
       boolean doadorOrgao = false;
       Date dataNascimento = new Date();

        System.out.println(VALOR_DE_PI);

    }
}
