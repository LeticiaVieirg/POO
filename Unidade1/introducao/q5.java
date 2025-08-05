package POO.Unidade1.introducao;

import java.util.Scanner;

// Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
// Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
// variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável
// de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.

public class q5 {
    public static void main(String[] args) {
        int numero, dezena, centena, unidade, UCD;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número de 3 dígitos: ");
        numero = sc.nextInt();

        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;

        UCD = (unidade * 100) + (centena * 10) + dezena;

        System.out.println(UCD);

        sc.close();
    }
}
