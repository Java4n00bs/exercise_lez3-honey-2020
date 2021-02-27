package main.java.exercise3;

public class Sfera extends Solido{
  double raggio;
  double PiGreco = 3.14;
  
  // se estendo con super il lato che è di solido almeno mi permette di inserire il parametro raggio come fosse un lato, l'uno serve a non ripetere un valore che gli do di predefinito così non mi segna che mancano parametri
  public Sfera(double raggio){
    super(raggio, 1, 1);
  }

  public double getVolume(){
    double raggioT = raggio * raggio * raggio;
    double volume = (4* piGreco * raggioT)/3;
    return volume;
  }

  // ho dovuto creare un nuovo metodo dettagli perché accedere a quello originale non ha senso visto che ha valori di natura diversa, esempio profondita
  // il raggio può essere considerato un lato, un'altezza come vogliamo
  public String dettagliSfera(){
        //qui il corpo
        String det = "Questa sfera ha una r di" + this.raggio + " e il volume di  " + this.getVolume();
        return det;
    }
}