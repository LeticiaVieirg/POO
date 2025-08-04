class DemoAgenda{
  public static void main(String [] args){
    Agenda agenda1= new Agenda();

    agenda1.adicionaCompromisso(new EntradaEmAgenda(2, 6, 2056, "A"));

    int dia1=2;
    int mes1=6;
    int ano1=2026;

    System.out.println("Compromisso nesse dia: ");
    agenda1.listaDia(dia1, mes1, ano1);
  }
}
