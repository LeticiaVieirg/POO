ContaTerminal.java
import java.util.Scanner;


public class ContaTerminal{
	public static void main(String [ ] args){ 
		
		provate String nome;
		Scanner leitor = new Scanner(System.in);
		
		System.out.printl("Seja Bem Vindo(a/e)!");
		System.out.printl("Informe seu nome: ");
		String nome = leitor.nextLina();
		
		System.out.printl("Conta de "+nome+" criada!");
		
	}
}
