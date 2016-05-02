
class Impiegato {

    private String nome;
    private double salario;
    private String matricola;
    private int anniDiServizio;

    public Impiegato(String n, double s, String m, int ads){
       nome = n;
       salario = s;
       matricola = m;
       anniDiServizio = ads;
    }

    public void incrementaSalario(double percentuale){
       salario *= 1 + percentuale / 100;
    }

    public double getSalario(){
        return salario;
    }

    public int getAnniServizio(){
        return anniDiServizio;
    }

}
