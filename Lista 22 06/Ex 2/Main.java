class Main {
  public static void main(String[] args) {

    Casa residencia= new Casa(123,"Manoel_Tavares",15000.00,new Proprietario(123.00,"Jonas"));

 

    System.out.println("Matricula: "+residencia.getMat());
    System.out.println("Endereco: "+residencia.getEnd());
    System.out.println("Valor: "+residencia.getVal());
    System.out.println("Proprietario: "+residencia.getProp());
  }
}
