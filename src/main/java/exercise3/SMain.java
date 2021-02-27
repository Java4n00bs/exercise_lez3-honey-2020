package exercise3;

public class SMain {
    public static void main(String[] args) {

      Solido solido1 = new Solido(10, 10, 50);
      Solido solido2 = new Solido(40, 20, 80);
      Solido solido3 = new Solido(1, 2, 3);

      System.out.println(solido1.dettagli());
      System.out.println(solido2.dettagli());
      System.out.println(solido3.dettagli());

      System.out.println(solido1.calcVolume());
      System.out.println(solido2.calcVolume());
      System.out.println(solido3.calcVolume());

      Solido cubo= new Cubo(3);

      cubo.confrontoSolidi(cubo);

      Solido sfera1 = new Sfera(10);
      System.out.println(sfera1.dettagliSfera());
      
    }
}
