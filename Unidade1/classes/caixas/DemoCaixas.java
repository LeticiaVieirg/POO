public class DemoCaixas{
    public static void main(String[] args) {
        CaixaBanco c1 = new CaixaBanco (1);
        CaixaBanco c2 = new CaixaBanco (2);
        CaixaBanco c3 = new CaixaBanco (3);
        CaixaBanco c4 = new CaixaBanco (4);
        CaixaBanco c5 = new CaixaBanco (5);

        c1.iniciaAtendimento();
        c2.iniciaAtendimento();
        c5.iniciaAtendimento();
        c1.iniciaAtendimento();
        System.out.println ("Caixas:" + CaixaBanco.clientesAtentidos);
    }
}
