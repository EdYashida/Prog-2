public class Ponto{
  private int x;
  private int y;

  public Ponto(){
  this.x=0;
  this.y=0;
  }

  public Ponto(int x, int y){
    this.x=x;
    this.y=y;
  }

  public void setX(int novox){
      this.x=novox;
  }
  public int getX(){
    return x;
  }
  public void setY(int novoy){
    this.y=novoy;
  }
  public int getY(){
    return y;
  }
}
