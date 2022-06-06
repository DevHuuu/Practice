package chap6.exercise;

public class PeopleTest {
	public static void main(String[] args) {

		people peopleJames = new people();
		
		peopleJames.age = 40;
		peopleJames.name = "James";
		peopleJames.isMarried = true;
		peopleJames.children = 3;
		
		peopleJames.peopleinfo();
	}
}
