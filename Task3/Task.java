package tasks;
import myexceptions.MismatchException;
import myexceptions.EmptyException;


public class Task {
	public  void validateInput(String input ,String inputName) throws EmptyException
	{
		if(input==null)
		{
			throw new EmptyException(inputName +" is empty ");
		}
	}
	public  int findLength(String input) throws EmptyException
	{	
		validateInput(input,"string");
		return input.length();
	}
	
	public  char[] convertToCharArray(String input) throws EmptyException
	{
		validateInput(input,"string");
		return input.toCharArray();
	}
	
	public  char findPositionValue(String input,int positionFromLast) throws EmptyException , MismatchException
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<positionFromLast)
		{
			throw new MismatchException("The position value is greater than the size of the string");
		}
		return input.charAt(length-positionFromLast);
	}
	public  int findNumberOfOccurences(String input , char character) throws EmptyException
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
	
	public  int findGreatestPosition(String input , char character) throws EmptyException,MismatchException
	{
		validateInput(input,"string");
		if(input.indexOf(character)==-1)
		{
			throw new MismatchException("The character is not found in the string ");
		}
		return input.lastIndexOf(character);
	}	 
	public  String findSuffix(String input,int numberOfCharacters) throws EmptyException , MismatchException
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new MismatchException("The number of characters is greater than the size of the string");
		}
		return input.substring(findLength(input)-numberOfCharacters);
	}
	
	public  String findPrefix(String input,int numberOfCharacters) throws EmptyException,MismatchException
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new MismatchException("The number of characters is greater than the size of the string");
		}
		return input.substring(0,numberOfCharacters);
	}

	public  String replacePrefix(String input,int numberOfCharacters,String substitute) throws EmptyException,MismatchException
	{
		validateInput(input,"string");
		validateInput(substitute,"substitute");
		if(numberOfCharacters!=substitute.length())
		{
			throw new MismatchException("Size of the characters to be replaced is not same as the size of the substitute string");
		}
		return input.replace(findPrefix(input,numberOfCharacters),substitute);
	}
	
	public  boolean checkStartsWith(String input,String prefix) throws EmptyException 
	{
		validateInput(input,"string");
		validateInput(prefix,"prefix");
		return input.startsWith(prefix);
	}
	
	public  boolean checkEndsWith(String input,String suffix) throws EmptyException 
	{
		validateInput(input,"string");
		validateInput(suffix,"suffix");
		return input.endsWith(suffix);
	}

	public  String convertLowerCase(String input) throws EmptyException 
	{
		validateInput(input,"string");
		return input.toLowerCase();
	}
	public  String convertUpperCase(String input) throws EmptyException 
	{
		validateInput(input,"string");
		return input.toUpperCase();
	}
	public  String reverseString(String input) throws EmptyException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		char[] reversedString =new char[length];
		int j=0;
		for (int i =length-1;i>=0;i--)
		{
			reversedString[j] = input.charAt(i);
			j++;
		}
		
		return String.valueOf(reversedString);
	}

	public  String concatenateStrings(String input,String delimiterToSplit , String delimiterToConcatenate) throws EmptyException , MismatchException
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		validateInput(delimiterToConcatenate,"delimiter to concatenate");
		if(input.contains(delimiterToSplit)!=true)
		{
			throw new MismatchException("The delimiter to split is not found");
		}
	        return input.replace(delimiterToSplit,delimiterToConcatenate);	 
	}
	public  String[] encloseInStringArray(String input,String delimiterToSplit) throws EmptyException , MismatchException
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		if(input.contains(delimiterToSplit)!=true)
		{
			throw new MismatchException("The delimiter to split is not found in the string ");
		}
	        return input.split(delimiterToSplit);	 
	}

	public  String mergeWithDelimiter(String[] stringArray , String delimiter) throws EmptyException 
	{
		if(stringArray==null)
		{
			throw new EmptyException("String Array is empty ");
		}
		validateInput(delimiter,"delimiter");
		return String.join(delimiter,stringArray);
	}
	public boolean checkEqualityCaseSensitive(String input1,String input2) throws EmptyException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equals(input2);
	}
	public  boolean checkEqualityCaseInSensitive(String input1,String input2) throws EmptyException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equalsIgnoreCase(input2);
	}
	public  String removeLeadingAndTrailingSpace(String input) throws EmptyException 
	{
		validateInput(input,"string");
		return input.trim();
	}

}


