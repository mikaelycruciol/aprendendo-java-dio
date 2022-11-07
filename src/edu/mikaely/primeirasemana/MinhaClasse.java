package edu.mikaely.primeirasemana;

import java.sql.SQLOutput;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Mikaely";
        String segundoNome = "Cruciol";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
