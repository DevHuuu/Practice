package chap8._interface.exercise;

public class Dog implements Soundable{

	@Override
	public String sound() {
		String sound = "멍멍";
		return sound;
	}
	
}
