package unidade1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);

        double c, f;
        System.out.println("Informe a temperatura em Graus Celcius: ");
        c=leitor.nextFloat();

        f=(c*1.8)+32;
        System.out.println("Valor convertido para Fareinther: "+f);

        leitor.close();
    }
}
