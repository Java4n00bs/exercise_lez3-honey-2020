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
      double aumento = salario * (percentuale/100);
      salario += aumento;

      // ok qui segna giustamente che c'è un'incompatibilità di tipi perché prima io dichiaro che dd è di tipo String e poi da citrulla metto due variabili di tipo double con salario che era int sin dalla partenza
      // posso fare un System.out print tutto oppure trasformare il salario e aumento in stringhe ma non mi conviene visto che devono essere riutilizzate fuori ed altrove, in IMmain devono poi essere confrontati come numeri non stringhe
      // la forza, io devo apprendere 👾

      // originale
      // String dd = "il salario aumentato del " + aumento + " è ora pari a " + salario;

      return aumento;
    }
    String dd = "il salario aumentato del " + aumento + " è ora pari a " + salario;

    System.out.println(dd);

}
