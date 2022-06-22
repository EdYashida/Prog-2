public class Main {
  public static void main(String[] args) {
    Robo rob[]=new Robo[3];

    rob[0]=new Robo("TARS",new Ponto(0,0));
    rob[1]=new Robo("Ultron",new Ponto(10,10));
    rob[2]=new Robo("BB8",new Ponto(5,15));

   rob[0].teleporte(47,19);
   rob[1].irCima();
   rob[1].irCima();
   rob[2].irDireita();
   rob[2].irBaixo();
    
  for(int i=0;i<=2;i++){
    System.out.println("Robo: "+rob[i].getNome()+"    Coordenadas: "+rob[i].informaCoordenada());
  }
    
  }
}
