package br.uniesp.POO.Ted2;

import java.util.Scanner;

public class Ted03ForIfElse {
    public static void main(String[] args) {

        float altura, somaMasculina = 0, mediaMasculina = 0, maiorAltura = 0, menorAltura = 40;
        int sexo, qntMasculina=0, qntFeminina=0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Para o sexo Masculino, digite 1, para o Feminino, digite 2: ");
            sexo = entrada.nextInt();
            System.out.println("Sua altura: ");
            altura = entrada.nextFloat();

            if (sexo == 2) {
                qntFeminina++;
            }

                else if(sexo == 1) {
                qntMasculina++;
                somaMasculina = somaMasculina + altura;
            }
                    else {
                        System.out.println("Esta opção não existe!!!");
                    }
                    if (altura > maiorAltura){
                        maiorAltura = altura;
                    }
                    if (altura < menorAltura){
                        menorAltura = altura;
                    }
                   }
                    mediaMasculina = somaMasculina / qntMasculina;
                    System.out.println("A média da altura masculina é igual a: " + mediaMasculina);
                    System.out.println("A maior altura é: " + maiorAltura + " sendo a menor: " + menorAltura);
                    System.out.println("O número de registros do sexo feminino é: " +qntFeminina);
            }

        }

