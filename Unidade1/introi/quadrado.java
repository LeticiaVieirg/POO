
package unidade1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner leitor=new Scanner(System.in);
        float lado, resultado;
        System.out.println("Digite o valor do lado do quadrado: ");
        lado=leitor.nextInt();

        resultado=lado*lado;
        System.out.println("O valor do quadrado é: " + resultado);
        leitor.close();
    }
}
