class Main {

   public static Double converterParaQuilometros(Double milhas){
    return milhas*1.6;
  }

  public static Double converterParaLitros(Double galoes){
    return galoes*3.79;
  }
  public static void main(String[] args) {

    Double galoes=5.0, milhas=23.0;

    Double litros=Main.converterParaLitros(galoes);
    Double quilometros=Main.converterParaQuilometros(milhas);

    System.out.print(" Milhas: "+milhas + " =" + " Quilometros: ");
    System.out.format("%.2f", quilometros);
    System.out.println(" ");
    System.out.println(" Galoes: "+galoes+ " = "+" Litros: "+litros);
  }
}
