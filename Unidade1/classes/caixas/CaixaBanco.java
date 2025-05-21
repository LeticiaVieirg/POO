public class CaixaBanco{
    public static int clientesAtentidos = 0;
    private int numeroCaixa;

    public CaixaBanco (int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa " + numeroCaixa + " antendendo o cliente " + ++clientesAtentidos);
    } 

    public String toString(){
        return "Numero Caixa = " +numeroCaixa;
    }   
}
