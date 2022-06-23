public class Casa{
  private int matricula;
  private String endereco;
  private Double valor;
  private Proprietario proprietario;

  public Casa(){
    this.matricula=0;
    this.endereco=" ";
    this.valor=0.0;
    this.proprietario= new Proprietario();
 }

  public Casa(int matricula,String endereco,Double valor,Proprietario prop){
    this.matricula=matricula;
    this.endereco=endereco;
    this.valor=valor;
    this.proprietario= prop;
  }

  public int getMat(){
    return matricula;
  }
  public void setMat(int mat){
    this.matricula=mat;
  }
  public String getEnd(){
    return endereco;
  }
  public void setEnd(String end){
    this.endereco=end;
  }public double getVal(){
    return valor;
  }
  public void setVal(Double val){
    this.valor=val;
  
  }
  public String getProp(){
    return "Nome: "+proprietario.getNome()+" CPF: "+proprietario.getCpf();
  }
  public void setProp(Proprietario prop){
    this.proprietario=prop;
  }
  
  
}
