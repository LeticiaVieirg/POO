package unidade1;

/*Fatorial recursivo */
public class q19 {
    public static void main(String[] args) {
        fatorialFormatado(5, 0);
    }

    public static int fatorialFormatado(int n, int nivel) {
        if (n == 0) {
            printNivel(nivel);
            System.out.println("0! = 1");
            return 1;
        }
        
        printNivel(nivel);
        System.out.print(n + "! = ");
        int resultado = n * fatorialFormatado(n - 1, nivel + 1);
        System.out.println(resultado);
        return resultado;
    }

    private static void printNivel(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
    }
}
