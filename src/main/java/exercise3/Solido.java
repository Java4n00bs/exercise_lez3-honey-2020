package exercise3;

public class Solido {

    int altezza, larghezza, profondita;
    // come spiegato Solido qui sotto non c'entra con la costruzione degli altri Solidi in SMain bensì interno a Solido.java stesso
    // sembrava ovvio ma non per me *o*
    public Solido(){
      // this attribuisce caratteristiche in questo contesto? mi sembra corretto visto che dice questo e non altrove
      this.altezza = 10;
      this.larghezza = 25;
      this.profondita = 30;
    }

    public Solido (int altezza, int larghezza, int profondita){
      this.altezza = altezza;
      this.larghezza = larghezza;
      this.profondita = profondita;
    }

    public int volume(){
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

public class Cubo extends Solido{
      Cubo(int altezza, int larghezza, int profondita){
        super(altezza, larghezza, profondita)
      }

      public double getVolume(){
        // qui trovare un modo per fare il return di volume
      }
}