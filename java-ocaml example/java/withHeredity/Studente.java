/*
 * With extends : 20 lines + reusable class (Persona)
*/

public class Studente extends Persona {

    private String universita;
    private int matricola;

    public Studente(String n, String c, int e, String u, int m){
        super(n, c, e);
    	universita = u;
    	matricola = m;
    }

    public String getUniversita() {
        return universita;
    }

    public int getMatricola() {
        return matricola;
    }

}
