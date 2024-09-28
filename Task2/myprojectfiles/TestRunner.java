package test;
import birds.Bird;
import child.Parrot;
import java.util.Scanner;
class TestRunner
{
	public static void main(String args[])
	{
		Bird bird = new birds.Bird();
		Parrot parrot = new child.Parrot();
		Scanner sc = new java.util.Scanner(System.in);
		bird.fly();
		parrot.fly();
		parrot.speak();
	
	}
}