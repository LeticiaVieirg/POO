public class DemoFuncionario{

  public static void main(String[] args){

    Funcionario f1=new Funcionario("Lina");

    f1.setHoraTrabalhada(10.5);
    f1.idade(42);

    System.out.println(f1);
    System.out.println("Salario: "+f1.salarioMensal());
  }
}
