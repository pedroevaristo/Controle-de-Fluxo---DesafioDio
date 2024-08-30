package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        Integer parametro_1 = scan.nextInt();
        System.out.println("Digite o segundo parametro");
        Integer parametro_2 = scan.nextInt();

        try {
            contar(parametro_1,parametro_2);

        }catch(ParametrosInvalidosException e){
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    private static void contar(Integer comp_1, Integer comp_2) throws ParametrosInvalidosException{
        if(comp_1 < comp_2){
            int contagem = comp_2 - comp_1;
            for(Integer i = 1; i <= contagem; i++){
                System.out.println(i);
            }
        }
    }


    public class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String mensagem){
            super(mensagem);
        }
    }


}
