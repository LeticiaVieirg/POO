/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

package POO.Unidade1.introducao;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int minutosTot, minutosRest, horas, dias;

        Scanner leitor=new Scanner(System.in);

        System.out.println("\nInforme o valor: ");
        minutosTot = leitor.nextInt();

        dias=minutosTot/1440;
        horas=(minutosTot%1440)/60;
        minutosRest=(minutosTot%1440)%60;


        System.out.println("Equivale a "+ dias +" dias, "+ horas+" horas "
        + minutosRest + " minutos\n");

        leitor.close();
    }
}


// 1 dia = 24*60=1440 minutos 
// 1 hora = 60 minutos
