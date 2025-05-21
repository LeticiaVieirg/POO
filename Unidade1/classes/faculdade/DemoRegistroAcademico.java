package Java.classes.faculdade;

public class DemoRegistroAcad {
    public static void main(String[] args) {

        RegistroAcad micael= new RegistroAcad();

        micael.inicializaRegistro("Micael", "2023011296", 1212, 60);

        double valor1= micael.calculaMensalidade();
        System.out.println("Mensalidade de Micael: "+ valor1);

        //da 0 pq nao inicializou os objetos
        RegistroAcad roberto = new RegistroAcad();
        double valor2= roberto.calculaMensalidade();
        System.out.println("Mensalidade de Rafael: "+ valor2);
    }
}
