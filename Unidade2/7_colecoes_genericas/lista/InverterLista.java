import java.util.LinkedList;

public class InverterLista {
    public static void main(String[] args) {
        LinkedList<Character> lista = new LinkedList<>();

        // Adicionando 10 caracteres
        for (char c = 'A'; c <= 'J'; c++) {
            lista.add(c);
        }

        System.out.println("Lista original: " + lista);

        // Criar a lista invertida manualmente
        LinkedList<Character> invertida = new LinkedList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertida.add(lista.get(i));
        }

        System.out.println("Lista invertida: " + invertida);
    }
}
