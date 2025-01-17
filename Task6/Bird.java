package birds;

public  class Bird 
{

	String name;
	public void speak()
	{
		System.out.println("I am speaking");
	}
	public Bird(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return this.name;
	}
	
}