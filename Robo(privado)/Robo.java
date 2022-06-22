public class Robo{
  private String nome;
  private Ponto coordenadas;

  public Robo(){
    this.nome=" ";
    this.coordenadas = new Ponto();
  }
  public Robo(String nomer, Ponto cod){
    this.nome= nomer;
    this.coordenadas = cod;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }
  public Ponto getCoordenadas(){
    return coordenadas;
  }
  public void setCoord(Ponto cord){
    this.coordenadas=cord;
  }

  public void irCima(){
    this.coordenadas.setY(coordenadas.getY()+1);
  }
  public void irBaixo(){
    this.coordenadas.setY(coordenadas.getY()-1);
  }
  public void irDireita(){
    this.coordenadas.setX(coordenadas.getX()+1);
  }
  public void irEsquerda(){
    this.coordenadas.setX(coordenadas.getX()-1);
  }
  public void teleporte(int linha, int coluna){
    this.coordenadas.setX(linha);
    this.coordenadas.setY(coluna);
  }
  public String informaCoordenada(){
    return "    X-"+coordenadas.getX()+ "     Y-"+coordenadas.getY(); 
}
}
