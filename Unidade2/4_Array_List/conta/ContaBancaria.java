import java.util.ArrayList;

public class ContaBancaria {
    private double saldoFinal;
    private ArrayList<Float> translacoes;

    public ContaBancaria(){
        saldoFinal = 0;
        translacoes = new ArrayList<>();
    }

    public String toString(){
        String resposta = "==============\n";

        for (Float float1 : translacoes) {
            resposta += float1 + "\n";
        }

        resposta += "Saldo: "+ saldoFinal + "\n";
        return resposta;
    }

    public void transacao(float valor){
        if (saldoFinal + valor >=  0) {
            saldoFinal += valor;
            translacoes.add(valor);          
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}