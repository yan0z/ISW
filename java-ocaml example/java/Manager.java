
class Manager extends Impiegato {

    public Manager(String n, double s, String m, int ads){
        super(n, s, m, ads);
    }

    public void incrementaSalario(double percentuale){
        // Aggiunge alla percentuale lo 0.5% per ogni anno di servizio
        double bonus = 0.5 * getAnniServizio();
        super.incrementaSalario(percentuale + bonus);
    }

}
