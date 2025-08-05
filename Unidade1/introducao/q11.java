package POO.Unidade1.introducao;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as coordenadas do primeiro ponto (x y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Digite as coordenadas do segundo ponto (x y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        String posicao = "";
        if (y2 > y1) posicao += "acima ";
        else if (y2 < y1) posicao += "abaixo ";
        
        if (x2 > x1) posicao += "à direita";
        else if (x2 < x1) posicao += "à esquerda";
        
        System.out.println("O segundo ponto está " + (posicao.isEmpty() ? 
        "na mesma posição" : posicao));
    }
}
