public class Cartao{
  private int saldo, recaraga;

  public void setSaldo(int saldo){
    this.saldo=saldo;
  }
  public void pegueiCafe(){
    this.saldo--;
  }
  public int getSaldo(){
    return this.saldo;
  }
  public void queroCafe(int recarga){
    this.saldo= this.saldo+recarga;
  }
}
