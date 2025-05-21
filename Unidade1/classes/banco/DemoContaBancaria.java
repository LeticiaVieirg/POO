public class DemoBanco{

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Leti", 23.24F, false);
        ContaBancaria conta2 = new ContaBancaria("Ana");
        System.out.println(conta);
        System.out.println(conta2);
    }
}
