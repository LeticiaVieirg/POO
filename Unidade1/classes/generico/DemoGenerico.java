public class DemoGenerico {
    public static void main(String[] args) {
        Generico <String>  = new Generico<> ("Java", "Python", "Java");
        g1.imprimir();
        
        Generico <Integer> g2 = new Generico<>(1, 2, 1);
        g2.imprimir();

        Generico <Double> g3 = new Generico<>(3.14, 2.71, 3.14);
        g3.imprimir();


        System.out.println("Iguais: " + g1.contarIguais());
        System.out.println("Iguais: " + g2.contarIguais());
        System.out.println("Iguais: " + g3.contarIguais());
    }
}
