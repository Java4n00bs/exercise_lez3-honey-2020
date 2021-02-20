package exercise3;

public class SMain {
    public static void main(String[] args) {

      Solido solido1 = new Solido(10, 10, 50);
      Solido solido2 = new Solido(40, 20, 80);
      Solido solido3 = new Solido(1, 2, 3);

      System.out.println(solido1.dettagli());
      System.out.println(solido2.dettagli());
      System.out.println(solido3.dettagli());

      System.out.println(solido1.volume());
      System.out.println(solido2.volume());
      System.out.println(solido3.volume());
    }
}
