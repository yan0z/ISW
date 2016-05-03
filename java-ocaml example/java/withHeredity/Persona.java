
public class Persona {

    private String nome;
    private String cognome;
    private int eta;

    public Persona(String n, String c, int e){
        nome = n;
    	cognome = c;
    	eta = e;
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

}
