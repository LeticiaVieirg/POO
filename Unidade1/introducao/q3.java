
package POO.Unidade1.introducao;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        double graus=ler.nextDouble();
        double rad=Math.toRadians(graus);

        double seno=Math.sin(rad);
        double cos=Math.cos(rad);
        double tangente=Math.tan(rad);

        System.out.println("Digite o valor do grau: ");
        graus=ler.nextDouble();

        System.out.println("Seno: "+seno);
        System.out.println("Cosseno: "+cos);
        System.out.println("Tangente: "+tangente);

        double cossecante=1/seno;
        double secante=1/cos;
        double cotangente=1/tangente;

        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: "+ secante);
        System.out.println("Cotangente: "+ cotangente);

        ler.close();
    }
}
