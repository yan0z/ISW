/*
 * Without extends : 37 lines
*/

public class Studente {

    private String nome;
    private String cognome;
    private int eta;
    private String universita;
    private int matricola;

    public Studente(String n, String c, int e, String u, int m){
        nome = n;
    	cognome = c;
    	eta = e;
    	universita = u;
    	matricola = m;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
	    return eta;
    }

    public String getUniversita() {
	    return universita;
    }

    public int getMatricola() {
	    return matricola;
    }

}
