//write a class who represent a sport time. Classes atribute + Method + Test app

package unidade1.questoes;

import unidade1.classes.Time;

public class 01 {
  public static void main(String[] args) {
    Time flamengo = new Time ("Flamengo", "Serie A");
    Time corinthians = new Time ("Corinthias", "Serie B");
    Time vasco = new Time ("Vasco", "Serie C");

    flamengo.registrarJogo(3,1);
    corinthians.registrarJogo(1,3);
    vasco.registrarJogo(2,2);

    System.out.println(flamengo);
    System.out.println(corinthians);
    System.out.println(vasco);
  }
    
}
