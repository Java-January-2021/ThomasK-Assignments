public class Bat extends MammalClass {


	public void fly() {
		System.out.println("flap flip flap flip");
		energylevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Ooh my little pretty one, my pretty one, When ya gonna gimme some time? Corona! My Corona! My Corona!");
		energylevel += 25;
	}
	public void attackTown() {
		System.out.println("crackle crackle crackle");
		energylevel -= 100;
	}
}