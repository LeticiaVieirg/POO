public class TrianguloPascal {
    public static void main(String[] args) {
        int numeroLinhas;
        Scanner leitor = new Scanner(System.in);

        
        System.out.println("Digite o número de linhas para o Triângulo de Pascal: ");
        numeroLinhas = leitor.nextInt();

       
        int[][] triangulo = new int [numeroLinhas][];

        for (int l = 0; l < triangulo.length; l++) {
            triangulo[l] = new int[l + 1];
            triangulo[l][0] = 1;
            triangulo[l][l] = 1;

            for (int c = 1; c < l; c++) {
                triangulo[l][c] = triangulo[l-1][c-1] + triangulo[l-1][c];
            }
        }

       
        for (int l = 0; l < triangulo.length; l++) {
            for (int c = 0; c < triangulo[l].length; c++) {
                System.out.print(triangulo[l][c] + " ");
            }
            System.out.println();
        }
        leitor.close(); 
    }
}