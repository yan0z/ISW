
public class Song extends Playable {

	private String name;
	
	public Song(String n) {
		name = n;
	}

	public void play() {
		System.out.println(name);
	}

}
