package Java.classes.circulo;

public class Circulo{
    private double raio;
    private final static double pi = 3.1415;

    public Circulo (double raio){
        this.raio = raio;
    }

    public double perimetroCirculo(){
        return 2*pi*raio;
    }

    public String toSting(){
        return "raio = " + raio;
    }
}
