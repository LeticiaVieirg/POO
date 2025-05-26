package unidade1;

/*crescimento populacional */
public class q17 {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double taxaCrescimentoA = 0.035; // 3.5%
        double taxaCrescimentoB = 0.01;  // 1%
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Levará " + anos + " anos para a população de A ultrapassar ou igualar a de B.");
        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
    }
}
