package unidade1;
import java.util.Scanner;

/*fibonacci */
public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n (>0):");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Série de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
