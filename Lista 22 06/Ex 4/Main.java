class Main {
  public static void main(String[] args) {

    Cartao c1= new Cartao();

    c1.setSaldo(10);

    c1.queroCafe(5);
    c1.pegueiCafe();
    
    System.out.println("O cartao tem: "+c1.getSaldo()+" creditos");
  }
}
