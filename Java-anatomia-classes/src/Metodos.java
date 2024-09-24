public class Metodos {
        public static void main(String[] args) {
            //Toda variável segue a seguinte estrutura:
            // Tipo NomeBemDefinido = Atribuição (Opcional em alguns casos)

            String meuNome = "Ginizu";

            int idade = 23;
            double altura = 1.62;
            //Dog spike;

            //Ao declarar metodos ele segue a seguinte estrutura:
            //TipoRetorno NomeObjetivoNoInfinitivo Parametro(S)

            //int somar (int numeroUm, int numeroDois);
            //String  formatarCep (long cep); 

            String primeiroNome = "Giovanna";
            String segundoNome = "Diniz";

            String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
            System.out.println(nomeCompleto);
}

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
