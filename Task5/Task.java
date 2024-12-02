package tasks;
import vehicle.Swift;
import vehicle.Car;

public class Task
{
	public Car callSubClassSetters(Swift car,int seats , int airbags , String model, String color)
	{
	 	car.setSeats(seats);
		car.setAirbags(airbags);
		car.setModel(model);
		car.setColor(color);
		return car;
	}
	public Car callCarSetters(Car car , int yearOfMake,String engineNumber , String type)
	{
		car.setYearOfMake(yearOfMake);
		car.setEngineNumber(engineNumber);
		car.setType(type);
		return car;
	}
	
	
}