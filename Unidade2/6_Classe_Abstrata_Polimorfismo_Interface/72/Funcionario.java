
class Funcionario{
  private double horaTrabalhada;
  private Strig nome;
  private UUID id;
  private int idade;

  Funcionario(String nome){
    this.nome=nome;
    this.id=UUID.randomUUID();
    this.idade=18;
    this.horaTrabalhada=2.0;
  }

  Funcionario(String nome, double horaTrabalhada){
    this.nome=nome;
    this.id=UUID.randomUUID();
    this.idade=18;
    this.horaTrabalhada=horaTrabalhada;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  
  public int getId(){
    return id;
  }

  public int getIdade(){
    return idade;
  }

  public void setIdade(){
    this.idade=idade;
  }

  public double gethoraTrabalhada(){
    return horaTrabalhada;
  }

  public double setHoraTrabalhada(double horaTrabalhada){
    this.horaTrabalhada=horaTrabalhada;
  }

  public double salarioMensal(int horasTrabalhadas){
    return horaTrabalhada*horasTrabalhadas;
  }

  @Override
  public String toString(){
    return "Funcionario\n Nome: "+nome+"| ID: "+id+" | Salario: "+salario; 
  }
}
