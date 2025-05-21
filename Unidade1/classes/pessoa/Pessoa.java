package Java.classes.pessoa;

public class Pessoa {
    private String nome;
    private double alt;



    public Pessoa(String nome, double alt){
        this.nome=nome;
        this.alt=alt;
    }


    public String getNome(){
        return this.nome;
    }

    //recebe o que o usuario vai digitar
    public void setNome(String nome){
        this.nome=nome;

        //nao altera quando recebe string vazia
        if(!nome.isEmpty()) this.nome=nome;
    }


    public String toString(){
        String res=" ";
        res+= "nome: " + nome;
        res+= "altura" + alt;
        return res;
    }


    public double getAlt() {
        return alt;
    }


    public void setAlt(double alt) {
        this.alt = alt;
    }
}
