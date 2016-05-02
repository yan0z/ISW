
public class Advertising extends Playable {

	public String name;
	
	public Advertising(String n) {
		name = n;
	}

	public void play() {
		System.out.println(name);
	}

}
