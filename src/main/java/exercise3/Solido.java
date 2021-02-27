package exercise3;

public class Solido {

    protected int altezza, larghezza, profondita;
    
    public Solido(){
      this.altezza = 10;
      this.larghezza = 25;
      this.profondita = 30;
    }

    public Solido (int altezza, int larghezza, int profondita){
      this.altezza = altezza;
      this.larghezza = larghezza;
      this.profondita = profondita;
    }

    public int calcVolume(){
      int v = altezza * larghezza * profondita;
      return v;
    }

    public String dettagli(){
        //qui il corpo
        String s = "Questo solido ha una h di" + this.altezza + " una larghezza di " + this.larghezza + " e ha una profondità di " + this.profondita;
        return s;
    }
    
    public boolean confrontoSolidi(Solido solido){
      boolean equalAlt = this.altezza==solido.altezza;
      boolean equalL = this.larghezza==solido.larghezza;
      boolean equalP = this.profondita==solido.profondita;
      return equalAlt && equalAlt && equalP;
    }


    
}


// https://www.tutorialspoint.com/java/java_inheritance.htm
// public class Cubo extends Solido{
//       Cubo(int altezza, int larghezza, int profondita){
//         super(altezza, larghezza, profondita)
//       }

//       public double getVolume(){
//         // qui trovare un modo per fare il return di volume
//       }
// }