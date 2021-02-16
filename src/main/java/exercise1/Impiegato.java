package exercise1;


public class Impiegato {
    String nome, cognome;
    int salario;

    public Impiegato(String nome, String cognome, int salario){
      this.nome = nome;
      this.cognome = cognome;
      this.salario = salario;
    }

    
    public String dettagli(){
        //qui il corpo
        String d = "La persona si chiama " + this.nome + " " + this.cognome + " e ha un salario di " + this.salario;
        return d;
    }

    
    public void aumentaSalario(double percentuale){
      double aumento = salario * (this.percentuale/100);
      salario += aumento;
      String dd = "il salario aumentato del " + aumento + " è ora pari a " + salario;

      return dd && salario;
    }

}
