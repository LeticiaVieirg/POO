package Java.classes.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Let", 1.7);

        pessoa.setNome(null);
        System.out.println(pessoa.getNome());

        //fazem as mesmas coisas os dois abaixo
        System.out.println(pessoa.toString());
        System.out.println(pessoa);
        
    }
}
