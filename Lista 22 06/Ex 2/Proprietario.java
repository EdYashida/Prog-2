public class Proprietario{
  private double cpf;
  private String nome;

  public Proprietario(){
    this.cpf=0;
    this.nome="";
  }
  public Proprietario(Double CPF, String NOME){
    this.cpf=CPF;
    this.nome=NOME;
  }

  public void setCpf(Double CPF){
    this.cpf=CPF;
  }
  public Double getCpf(){
    return cpf;
  }
  public void setNome(String NOME){
    this.nome=NOME;
  }
  public String getNome(){
    return nome;
  }
  
}
