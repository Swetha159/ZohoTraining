package tasks;
import myexceptions.TaskException;



public class Task {
	public  void validateInput(String input ,String inputName) throws TaskException
	{
		if(input==null)
		{
			throw new TaskException(inputName +" is empty ");
		}
	}
	public  int findLength(String input) throws TaskException
	{	
		validateInput(input,"string");
		return input.length();
	}
	
	public  char[] convertToCharArray(String input) throws TaskException
	{
		validateInput(input,"string");
		return input.toCharArray();
	}
	
	public  char findPositionValue(String input,int positionFromLast) throws TaskException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(positionFromLast<1&&length<positionFromLast)
		{
			throw new TaskException("The position value is greater than the size of the string");
		}
		return input.charAt(length-positionFromLast);
	}
	public  int findNumberOfOccurences(String input , char character) throws TaskException
	{
		validateInput(input,"string");
		char[] charArray =convertToCharArray(input) ;
		int count =0;
		for(char c : charArray )
		{
			if(c==character)
			{
				count++;
			}
		}
		return count;
	}
	
	public  int findGreatestPosition(String input , char character) throws TaskException
	{
		validateInput(input,"string");
		int index = input.lastIndexOf(character);
		if(index==-1)
		{
			throw new TaskException("The character is not found in the string ");
		}
		return index ;
	}	 
	public  String findSuffix(String input,int numberOfCharacters) throws TaskException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new TaskException("The number of characters is greater than the size of the string");
		}
		return input.substring(findLength(input)-numberOfCharacters);
	}
	
	public  String findPrefix(String input,int numberOfCharacters) throws TaskException
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new TaskException("The number of characters is greater than the size of the string");
		}
		return input.substring(0,numberOfCharacters);
	}

	public  String replacePrefix(String input,int numberOfCharacters,String substitute) throws TaskException
	{
		validateInput(input,"string");
		validateInput(substitute,"substitute");
		return input.replace(findPrefix(input,numberOfCharacters),substitute);
	}
	
	public  boolean checkStartsWith(String input,String prefix) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(prefix,"prefix");
		return input.startsWith(prefix);
	}
	
	public  boolean checkEndsWith(String input,String suffix) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(suffix,"suffix");
		return input.endsWith(suffix);
	}

	public  String convertLowerCase(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.toLowerCase();
	}
	public  String convertUpperCase(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.toUpperCase();
	}
	public  String reverseString(String input) throws TaskException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		char[] reversedString =new char[length];
		 for (int i = 0; i < length; i++) 
		{
        	reversedString[i] = input.charAt(length - 1 - i);
    	}
		return String.valueOf(reversedString);
	}

	public  String concatenateStrings(String input,String delimiterToSplit , String delimiterToConcatenate) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		validateInput(delimiterToConcatenate,"delimiter to concatenate");
		// if(input.contains(delimiterToSplit))
		// {
		// 	throw new TaskException("The delimiter to split is not found");
		// }
	        return input.replace(delimiterToSplit,delimiterToConcatenate);	 
	}
	public  String[] encloseInStringArray(String input,String delimiterToSplit) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		// if(input.contains(delimiterToSplit))
		// {
		// 	throw new TaskException("The delimiter to split is not found in the string ");
		// }
	        return input.split(delimiterToSplit);	 
	}

	public  String mergeWithDelimiter(String[] stringArray , String delimiter) throws TaskException 
	{
		if(stringArray==null)
		{
			throw new TaskException("String Array is empty ");
		}
		validateInput(delimiter,"delimiter");
		return String.join(delimiter,stringArray);
	}
	public  boolean checkEqualityCaseSensitive(String input1,String input2) throws TaskException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equals(input2);
	}
	public  boolean checkEqualityCaseInSensitive(String input1,String input2) throws TaskException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equalsIgnoreCase(input2);
	}
	public  String removeLeadingAndTrailingSpace(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.trim();
	}

}


