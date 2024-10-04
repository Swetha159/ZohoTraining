package tasks;
import myexceptions.TaskException;



public class Task {
	public static void validateInput(String input ,String inputName) throws TaskException
	{
		if(input==null)
		{
			throw new TaskException(inputName +" is empty ");
		}
	}
	public static int findLength(String input) throws TaskException
	{	
		validateInput(input,"string");
		return input.length();
	}
	
	public static char[] convertToCharArray(String input) throws TaskException
	{
		validateInput(input,"string");
		return input.toCharArray();
	}
	
	public static char findPositionValue(String input,int positionFromLast) throws TaskException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<positionFromLast)
		{
			throw new TaskException("The position value is greater than the size of the string");
		}
		return input.charAt(length-positionFromLast);
	}
	public static int findNumberOfOccurences(String input , char character) throws TaskException
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
	
	public static int findGreatestPosition(String input , char character) throws TaskException
	{
		validateInput(input,"string");
		if(input.indexOf(character)==-1)
		{
			throw new TaskException("The character is not found in the string ");
		}
		return input.lastIndexOf(character);
	}	 
	public static String findSuffix(String input,int numberOfCharacters) throws TaskException 
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new TaskException("The number of characters is greater than the size of the string");
		}
		return input.substring(findLength(input)-numberOfCharacters);
	}
	
	public static String findPrefix(String input,int numberOfCharacters) throws TaskException
	{
		validateInput(input,"string");
		int length = findLength(input);
		if(length<numberOfCharacters)
		{
			throw new TaskException("The number of characters is greater than the size of the string");
		}
		return input.substring(0,numberOfCharacters);
	}

	public static String replacePrefix(String input,int numberOfCharacters,String substitute) throws TaskException
	{
		validateInput(input,"string");
		validateInput(substitute,"substitute");
		if(numberOfCharacters!=substitute.length())
		{
			throw new TaskException("Size of the characters to be replaced is not same as the size of the substitute string");
		}
		return input.replace(findPrefix(input,numberOfCharacters),substitute);
	}
	
	public static boolean checkStartsWith(String input,String prefix) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(prefix,"prefix");
		return input.startsWith(prefix);
	}
	
	public static boolean checkEndsWith(String input,String suffix) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(suffix,"suffix");
		return input.endsWith(suffix);
	}

	public static String convertLowerCase(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.toLowerCase();
	}
	public static String convertUpperCase(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.toUpperCase();
	}
	public static String reverseString(String input) throws TaskException 
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

	public static String concatenateStrings(String input,String delimiterToSplit , String delimiterToConcatenate) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		validateInput(delimiterToConcatenate,"delimiter to concatenate");
		if(input.contains(delimiterToSplit)!=true)
		{
			throw new TaskException("The delimiter to split is not found");
		}
	        return input.replace(delimiterToSplit,delimiterToConcatenate);	 
	}
	public static String[] encloseInStringArray(String input,String delimiterToSplit) throws TaskException 
	{
		validateInput(input,"string");
		validateInput(delimiterToSplit,"delimiter to split");
		if(input.contains(delimiterToSplit)!=true)
		{
			throw new TaskException("The delimiter to split is not found in the string ");
		}
	        return input.split(delimiterToSplit);	 
	}

	public static String mergeWithDelimiter(String[] stringArray , String delimiter) throws TaskException 
	{
		if(stringArray==null)
		{
			throw new TaskException("String Array is empty ");
		}
		validateInput(delimiter,"delimiter");
		return String.join(delimiter,stringArray);
	}
	public static boolean checkEqualityCaseSensitive(String input1,String input2) throws TaskException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equals(input2);
	}
	public static boolean checkEqualityCaseInSensitive(String input1,String input2) throws TaskException 
	{
		validateInput(input1,"string1");
		validateInput(input2,"string2");
		return input1.equalsIgnoreCase(input2);
	}
	public static String removeLeadingAndTrailingSpace(String input) throws TaskException 
	{
		validateInput(input,"string");
		return input.trim();
	}

}


