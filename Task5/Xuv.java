package cars;
import vehicle.Car;

public class Xuv extends Car
{
	private int seats;
	private int airbags;
	private String model;
	private String color ;
	
	public int getSeats()
	{
		return seats;
	}
	public int getAirbags()
	{
		return airbags;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public void setSeats(int value)
	{
		this.seats=value;
	}
	public void setAirbags(int value)
	{
		this.airbags=value;
	}
	public void setModel(String string)
	{
		this.model=string;
	}
	public void setColor(String string)
	{
		this.color=string;
	}
	public Xuv()
	{
		super("Called from Xuv class constructor");
	}
}