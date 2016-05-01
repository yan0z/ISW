
class Test {

    public static void main(String[] args){

        Manager manager = new Manager("Paolo", 1000, "12365", 10);

        System.out.println(manager.getSalario());

        manager.incrementaSalario(10);

        System.out.println(manager.getSalario());
	}

}
