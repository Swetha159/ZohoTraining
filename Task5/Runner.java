package test;
import java.util.Scanner;
import cars.Swift;
import cars.SCross;
import cars.Xuv;
import vehicle.Car;
import birds.BirdAbstract;
import birds.ParrotMod;
import birds.Bird;
import birds.Duck;
import java.util.InputMismatchException;

public class Runner 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			int choice=0,seats,airbags,yearOfMake;
			String model,color,engineNumber,type;
			Swift swift;
			Xuv xuv;
			Car car;
			SCross sCross;
			while(choice!=11)
			{
				try{	
					System.out.println("Choose from the given options:\n1.Create Swift instance and call getters and setters of that alone\n2.Create XCross instance and call getters and setters of that and also super class\n3.Identify Car Type\n4.Call operateOnSwift(Swift swift) with Swift , Car , Xuv,SCross object as argument\n5.Demonstrate method overriding\n6.Demonstrate Overloaded Constructor\n7.Demonstrate Abstract Class(method should not be abstract)\n8.Demonstrate Abstract Class(method should be abstract)\n9.Exit\nEnter your choice :");
					choice = scan.nextInt();
					switch(choice)
					{
						case 1:
							swift = new Swift();
							System.out.println("Enter no. of seats :");
							seats = scan.nextInt();
							System.out.println("Enter no. of airbags:");
							airbags = scan.nextInt();
							scan.nextLine();
							System.out.println("Enter the model name:" );
							model = scan.nextLine();
							System.out.println("Enter the color:");
							color = scan.nextLine();
							swift.setSeats(seats);
							swift.setAirbags(airbags);
							swift.setModel(model);
							swift.setColor(color);
							printCarDetails(swift);
							break;
						case 2:
							sCross = new SCross();
							System.out.println("Enter no. of seats :");
							seats = scan.nextInt();
							System.out.println("Enter no. of airbags:");
							airbags = scan.nextInt();
							scan.nextLine();
							System.out.println("Enter the model name:" );
							model = scan.nextLine();
							System.out.println("Enter the color:");
							color = scan.nextLine();
							System.out.println("Enter year of make:");
							yearOfMake = scan.nextInt();
							scan.nextLine();
							System.out.println("Enter the engine number:" );
							engineNumber = scan.nextLine();
							System.out.println("Enter the type:");
							type = scan.nextLine();
							sCross.setSeats(seats);
							sCross.setAirbags(airbags);
							sCross.setModel(model);
							sCross.setColor(color);
							sCross.setYearOfMake(yearOfMake);
							sCross.setEngineNumber(engineNumber);
							sCross.setType(type);
							printCarDetails(sCross);
							break;
						case 3 :
							swift = new Swift();
							identifyCarType(swift);
							xuv = new Xuv();
							identifyCarType(xuv);
							sCross = new SCross();
							identifyCarType(sCross);
							break;
						case 4 :
							swift = new Swift();
							operateOnSwift(swift);		
							//Car obj = new Swift(); 	
							//operateOnSwift(obj);
							//sCross = new SCross();
							//operateOnSwift(sCross);
							//xuv = new Xuv();
							//operateOnSwift(xuv);
							break;
						case 5:
							sCross = new SCross();
							sCross.maintenance();
							car = new SCross();
							car.maintenance();
							car = new Car();
							car.maintenance();
							swift = new Swift();
							swift.maintenance();
							break;
						case 6 :
							xuv = new Xuv();
							//xuv = new Xuv("Overloaded Constructor");
							break;
						case 7:
							//BirdAbstract bird = new BirdAbstract();
							ParrotMod parrot = new ParrotMod();
							parrot.fly();
							parrot.speak();
							break;
						case 8 :
							Duck duck = new Duck();
							duck.fly();
							duck.speak();
							break;
						default :
							System.out.println("Invalid Choice");
					}
				}
				catch(InputMismatchException e)
				{
				System.out.println("Enter valid input");
				scan.nextLine();
				}
			}
		}
		finally
		{
		scan.close();
		}
	}
	public static void identifyCarType(Car car) 
	{
        if (car instanceof Swift) 
		{
        	System.out.println("Hatch");
        } 
		else if (car instanceof Xuv) 
		{
            System.out.println("SUV");
        } 
		else if (car instanceof SCross) 
		{
            System.out.println("Sedan");
        } 
		else 
		{
        	System.out.println("Unknown Car Type");
       	}
        }
	public static void operateOnSwift(Swift swift) 
	{
        	System.out.println("Handling Swift");
	}
	public static  void printCarDetails(Car car)
	{
		if (car instanceof Swift) 
		{
        	System.out.println("No. of Seats :"+ ((Swift) car).getSeats());
			System.out.println("No. of airbags :"+ ((Swift) car).getAirbags());
			System.out.println("Model Name :"+ ((Swift) car).getModel());
			System.out.println("Color :"+ ((Swift) car).getColor());
		}
		else if (car instanceof Xuv) 
		{
        	System.out.println("No. of Seats :"+ ((Xuv) car).getSeats());
			System.out.println("No. of airbags :"+ ((Xuv) car).getAirbags());
			System.out.println("Model Name :"+ ((Xuv) car).getModel());
			System.out.println("Color :"+ ((Xuv) car).getColor());
		}
		else if (car instanceof SCross) 
		{
        	System.out.println("No. of Seats :"+ ((SCross) car).getSeats());
			System.out.println("No. of airbags :"+ ((SCross) car).getAirbags());
			System.out.println("Model Name :"+ ((SCross) car).getModel());
			System.out.println("Color :"+ ((SCross) car).getColor());
		}
		else
		{
			System.out.println("Year of make : "+car.getYearOfMake());
			System.out.println("Engine number : :"+car.getEngineNumber());
			System.out.println("Type:"+car.getType());
		}
	}
	
	
	
}