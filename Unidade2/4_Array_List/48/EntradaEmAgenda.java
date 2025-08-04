class EntradaEmAgenda{

  private int hora;
  private inr dia;
  private int mes;
  private int ano;
  private String assunto;

  public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
    
    this.hora=hora;
    this.dia=dia;
    this.mes=mes;
    this.ano=ano;
    this.assunto=assunto;
  }

  public boolean ehNoDia(int dia, int mes, int ano){
    if(this.dia==dia && this.mes==mes && this.ano==ano){
      return true;
    } else{
      return false;
    }
  }
  
  @Override
  public String toString(){
    return "Evento: "+hora+" || "+dia+"/"+mes+"/"+ano "\n Assunto: "+assunto;
  }
}
