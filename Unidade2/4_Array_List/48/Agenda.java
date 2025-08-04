class Agenda{
  
  ArrayList<EntradaEmAgenda> agenda;

  public Agenda{
    agenda=new ArrayList<>();
  }

  public void adicionaEmAgenda(EntradaEmAgenda entrada){
    agenda.add(entrada);
  }

  public void listaDia(int dia, int mes, int ano){
    boolean valido=false;
    
    for(EntradaEmAgenda entrada : agenda){
      if(EntradaEmAgenda.ehNoDia(dia, mes, ano)){
        System.out.println(entrada);
        valida=true;
      }
    }if(!valida){
      System.out.println("Sem compromisso")
    }
  }
  
}
