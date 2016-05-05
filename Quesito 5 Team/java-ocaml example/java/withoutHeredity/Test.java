
class Test {

    public static void main(String[] args){

    	Studente s = new Studente("Paolo", "Dessì", 18, "Informatica", 36412);

        System.out.println("\n"+s.getNome()+"\n"+s.getCognome()+"\n"+s.getEta()+"\n");
        System.out.println(s.getUniversita()+"\n"+s.getMatricola()+"\n");
    }

}
