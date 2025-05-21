public package Java.classes.faculdade;

class RegistroAcad {

    private String nome;
    private String matricula;
    private double codigoCurso;
    private double percentualCob; //double que recebe de 0 a 1


    public void inicializaRegistro(String n, String m, int c, int p){
        nome=n; matricula=m; codigoCurso=c; percentualCob=p;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualCob;
    }
}
