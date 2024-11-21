package tasks;
import exceptions.TaskException;
import utility.Util;

public class Task
{
	public StringBuilder getStringBuilder() throws TaskException
	{
		return new StringBuilder();
	}
	public StringBuilder appendString(StringBuilder stringBuilder , String inputString) throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		return stringBuilder.append(inputString);
	}
	public StringBuilder appendStringsWithDelimiter(String[] stringArray ,String delimiter ) throws TaskException
	{
		StringBuilder stringBuilder = getStringBuilder();
		Util.validateInput(stringArray,"String Array");
		Util.validateInput(delimiter,"delimiter");
		for(int i=0;i<stringArray.length; i++)
		{
			appendString(stringBuilder,stringArray[i]);
			if(i!=stringArray.length-1)
			{
				appendString(stringBuilder,delimiter);
			}	
		}
		return stringBuilder;
		
	}
	public StringBuilder insertStringAfterDelimiter(StringBuilder stringBuilder , String inputString,String delimiter) throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(delimiter,"delimiter");
		Util.validateInput(inputString,"input string");
		stringBuilder.insert(findIndex(stringBuilder , delimiter)+1,inputString);
		return stringBuilder;
	}
	public StringBuilder deleteString(StringBuilder stringBuilder,String delimiter) throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(delimiter,"delimiter");
		return stringBuilder.delete(0,findIndex(stringBuilder , delimiter));
	} 
	public StringBuilder replaceDelimiter(StringBuilder stringBuilder,String delimiter , char replacingDelimiter)throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(stringBuilder,"delimiter");
		while(findIndex(stringBuilder , delimiter)!=-1)
		{
			stringBuilder.setCharAt(findIndex(stringBuilder , delimiter),replacingDelimiter);
			
		}
		return stringBuilder;
	}
	public StringBuilder reverseStringBuilder(StringBuilder stringBuilder)throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		return stringBuilder.reverse();
	}
	public int findIndex(StringBuilder stringBuilder , String delimiter )throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(stringBuilder,"delimiter");
		return stringBuilder.indexOf(delimiter);
	}
	public int findLastIndex(StringBuilder stringBuilder , String substring)throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(substring,"substring");
		return stringBuilder.lastIndexOf(substring);
	}
	public StringBuilder deleteSubstring(StringBuilder stringBuilder ,int startIndex , int endIndex)throws TaskException
	{
		 Util.validateInput(stringBuilder,"StringBuilder");
		 return stringBuilder.delete(startIndex,endIndex);
	}
	public StringBuilder replaceSubstring(StringBuilder stringBuilder , int startIndex , int endIndex , String substitute )throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		Util.validateInput(substitute,"substitute");
		return stringBuilder.replace(startIndex, endIndex , substitute);
	}
	public boolean checkLength(StringBuilder stringBuilder)throws TaskException
	{
		Util.validateInput(stringBuilder,"StringBuilder");
		if(Util.findLength(stringBuilder)>=10)
		{
			return true ;
		}
		return false;
	}

	
}