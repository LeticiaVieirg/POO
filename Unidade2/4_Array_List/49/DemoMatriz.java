class DemoMAtriz{

  public static void main(String [] args){

    Matriz matriz1 = new Matriz(1,2,3,4);
    Matriz matriz2 = new Matriz(2,5,6,7);

    System.out.println(matriz1);
    System.out.println("O determinante da matriz equivale a "+matriz1.determinante());

    System.out.println(matriz2);
    System.out.println("O determinante da matriz equivale a "+matriz2.determinante())

  }
}
