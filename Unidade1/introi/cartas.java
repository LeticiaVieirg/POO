package unidade1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da carta (1-13):");
        int valor = scanner.nextInt();
        
        System.out.println("Digite o naipe (1-4):");
        int naipe = scanner.nextInt();
        
        String nomeValor = "";
        String nomeNaipe = "";
        
        // Determina o nome do valor
        switch (valor) {
            case 1: nomeValor = "Ás"; break;
            case 2: nomeValor = "Dois"; break;
            case 3: nomeValor = "Três"; break;
            case 4: nomeValor = "Quatro"; break;
            case 5: nomeValor = "Cinco"; break;
            case 6: nomeValor = "Seis"; break;
            case 7: nomeValor = "Sete"; break;
            case 8: nomeValor = "Oito"; break;
            case 9: nomeValor = "Nove"; break;
            case 10: nomeValor = "Dez"; break;
            case 11: nomeValor = "Valete"; break;
            case 12: nomeValor = "Dama"; break;
            case 13: nomeValor = "Rei"; break;
            default:
                System.out.println("Valor de carta inválido!");
                return;
        }
        
        // Determina o nome do naipe
        switch (naipe) {
            case 1: nomeNaipe = "Ouros"; break;
            case 2: nomeNaipe = "Paus"; break;
            case 3: nomeNaipe = "Copas"; break;
            case 4: nomeNaipe = "Espadas"; break;
            default:
                System.out.println("Naipe inválido!");
                return;
        }
        
        System.out.println("Carta: " + nomeValor + " de " + nomeNaipe);
    }
}
