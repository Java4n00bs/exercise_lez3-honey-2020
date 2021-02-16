package exercise0;


public class Persona {
    String nome;
    String cognome;
    int eta;


    public String dettagli(nome, cognome, eta){
        String pNome = this.nome;
        String pCognome = this.cognome;
        String pEta = this.eta.toString();
        return pNome + pCognome + pEta;
    }
}
