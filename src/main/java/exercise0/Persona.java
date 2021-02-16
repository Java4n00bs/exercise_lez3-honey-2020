package exercise0;


public class Persona {
    String nome, cognome;
    int eta;


    public Persona (){
      this.nome = "hello";
      this.cognome= "world";
      this.eta = 0;
    }

    public Persona(String nome, String cognome, int eta){
      this.nome = nome;
      this.cognome = cognome;
      this.eta = eta;
    }

    public String dettagli(){
        String d = "La persona si chiama " + this.nome + " " + this.cognome + " e ha " + this.eta + " anni.";
        return d;
    }
}
