package utility;
import exceptions.TaskException;

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
		if(0>=inputValue || inputValue>boundaryValue)
		{
			throw new TaskException("The input value is out of range");
		}
	} 
	public static int findLength(String input) throws TaskException
	{	
		validateInput(input,"string");
		return input.length();
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
		else 
		{
       		throw new TaskException("Unsupported input type ");
   		}
	}


}

