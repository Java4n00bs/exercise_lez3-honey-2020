package exercise1;

public class IMain {
    public static void main(String[] args) {
        Impiegato impiegato1 = new Impiegato("Jane", "Aurea", 600);
        Impiegato impiegato2 = new Impiegato("Barry", "Allen", 20000)
        
        System.out.println(impiegato1.aumentoSalario(10));
        System.out.println(impiegato2.aumentoSalario(5));

        

    }
}

/**
 * Come compilare dei sorgenti che utilizzano classi dello stesso package?
 *
 *  1)  mi posiziono nella cartellla che CONTIENE il package,
 *      in questo caso dentro la cartella /java.
 *  2)  compilo tutto il package, usando:  javac /<nomedelpackage>/*.java
 *  3)  se non ci sono errori di compilazione, posso eseguire
 *      la mia classe Main, ma nel formato <nomedelpackage>/Main,
 *      ovvero preceduta dal nome del suo stesso package.
 *
 */
