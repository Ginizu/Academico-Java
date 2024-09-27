package edu.dio.primeirasemana;
public class Variavel {
    public static void main(String[] args) {
        int anoFabricacao = 2021; // Toda variável é declarada em minúsculas, caso a palavra seja composta a primeira letra da segunda palavra deve estar em maiúscula, respeitando assim a camelCase.
        int ano = 2024; // Está é uma variável mutavél, o ano pode ser alterado, sabemos disso pois é declarada em letras minúsculas.
        //Quando queremos que a variável seja um valor imutavél exite uma regra para isso.
        String BR = "Brasil";
        final String BRAZIL = "Brasil";//Quando a variável é escrita em letras maiúsculas entendemos que ela é Final, ou seja o valor não pode ser alterado.
        //Alguns exemplos a seguir de variáveis UPPERCASE:
        double PI = 3.14; 
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;
        //Existem algumas regras de como podem ser declarada as variáveis.
        //Devem conter apenas letras, simbolos liberados: _(underline), $ ou números de 0 a 9.
        //Devem se iniciar por letras ou os simbolos liberados, exceto por números.
        //Iniciar com letras minúsculas.
        //Não conter espaços.
        //Não usar palavras-chaves.
        //Nome único dentro do escopo.

        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

        //int numero&um = 1; - Simbolos proibidos.
        //int 1numero = 1; - Variável não pode começar por números.
        //int numero um = 1; - não pode haver espaços.
        //int long = 1; - long faz parte das palavras chaves dentro da linguagem.



    }
}
