package POO.Unidade1.introducao;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do setor (111 ou 222):");
        int codigo = scanner.nextInt();
        System.out.println("Digite o valor original do produto:");
        double valor = scanner.nextDouble();
        double valorComDesconto = 0;
        String setor = "";
        switch (codigo) {
            case 111:
                setor = "Cama, mesa e banho";
                if (valor > 100) {
                    valorComDesconto = valor * 0.6; // 40% de desconto
                } else if (valor >= 50) {
                    valorComDesconto = valor * 0.8; // 20% de desconto
                } else {
                    valorComDesconto = valor * 0.9; // 10% de desconto
                }
                break;
            case 222:
                setor = "Eletros";
                if (valor > 500) {
                    valorComDesconto = valor * 0.9; // 10% de desconto
                } else {
                    valorComDesconto = valor; // Sem desconto
                }
                break;
            default:
                System.out.println("Setor Inválido");
                return;
        }

        System.out.printf("Setor: %s%n", setor);
        System.out.printf("Valor com desconto: R$ %.2f%n", valorComDesconto);
    }
}
