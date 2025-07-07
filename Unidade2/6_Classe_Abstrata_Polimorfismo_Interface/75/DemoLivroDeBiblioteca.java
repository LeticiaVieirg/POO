public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Machine Learning - Python", "Leticia", "DBooks", 2021, false,
                "7 ,  G", "Use the lenguagem with optminization");
        livro.empresta();
        livro.devolve();

        System.out.println(livro.qualAutor());
        System.out.println(livro.qualLivro());
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
        
        System.out.println(livro);
        livro.empresta();
        System.out.println(livro.estaEmprestado() ? "Esta emprestado" : "Nao esta emprestado");
    }
}
