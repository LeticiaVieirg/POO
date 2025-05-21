package Java.classes.eventos;

public class EventoAcademico {

    private String nomeDoEvento;
    private String localEvento;
    private int numeroParticipante;

    public void mostraEvento(){
        System.out.println("nome: "+ nomeDoEvento);
        System.out.println("Local: "+ localEvento);
        System.out.println("numero Participantes: "+ numeroParticipante);
    }

    /*contrutor -> forma 1 de fazer
    EventoAcademico(String n, String l, int p){
        nomeDoEvento=n;
        localEvento=(l.isEmpty()? "UFRN" : l);
        numeroParticipante=(p>0? p : 1);
    }*/

    EventoAcademico(String nomeDoEvento, String localEvento, int numeroParticipante){
        this.nomeDoEvento=nomeDoEvento;
        this.localEvento=(localEvento.isEmpty()? "UFRN" : localEvento);
        this.numeroParticipante=(numeroParticipante>0? numeroParticipante : 1);
    }


//this -> chama o metodo mostra evento para o mesmo objeto
//referencia atributos e metodos da propria
}
