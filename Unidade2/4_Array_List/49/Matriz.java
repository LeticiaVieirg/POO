class Matriz {
  private float matriz[][];

  public Matriz(float m1, float m2, float m3, float m4){
    matriz = new float[2][2];

    matriz[0][0]=m1;
    matriz[0][1]=m2;
    matriz[1][0]=m3;
    matriz[0][0]=m4;
  }

  public float determinante(){
    return ((m1*m4)-(m3*m2));
  }

  @Override
  public String toString(){
    return "Matriz \n | " + this.matriz[0][0] + " " + this.matriz[0][1] "| \n"+
                       "| " + this.matriz[1][0] + " " + this.matriz[1][1] "| \n "
  }
}
