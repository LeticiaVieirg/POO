
package unidade1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        float num1, num2, num3,soma, media;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        num1 = leitor.nextFloat();

        System.out.println("Digite o segundo valor: ");
        num2= leitor.nextFloat();

        System.out.println("Digite o terceiro valor: ");
        num3=leitor.nextFloat();

        soma=num1+num2+num3;

        media=(soma)/3;

        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);

        leitor.close();
    }
}
