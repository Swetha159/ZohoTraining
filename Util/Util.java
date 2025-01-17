package utility;
import exceptions.TaskException;
import java.util.ArrayList;

public class Util
{
	public static void validateInput(Object input ,String inputName) throws TaskException
	{
		if(input==null)
		{
			throw new TaskException(inputName +" is empty ");
		}
	}
	public static void checkBoundary(int inputValue , int boundaryValue) throws TaskException
	{
		validateInput(inputValue , "Input Value");
		validateInput(boundaryValue , "Boundary Value");
		if(0>=inputValue || inputValue>boundaryValue)
		{
			throw new TaskException("The input value is out of range");
		}
	} 
	
	public static int findLength(Object input) throws TaskException 
	{
    		validateInput(input, "string or stringBuilder");
    
    		if (input instanceof String) 
		{
       			return ((String) input).length();
   		} 
		else if (input instanceof StringBuilder) 
		{
        		return ((StringBuilder) input).length();
    	} 
		else if(input instanceof ArrayList)
		{
			return ((ArrayList)input).size();
		}
		else 
		{
       		throw new TaskException("Unsupported input type ");
   		}
	}


}

