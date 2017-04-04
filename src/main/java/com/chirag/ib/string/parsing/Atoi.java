package com.chirag.ib.string.parsing;

public class Atoi
{
	public int atoi(String a)
	{
		if(a==null || a.trim().isEmpty())
			return 0;
		
		String aTrim = a.trim();
		StringBuilder numStringBuilder = new StringBuilder();
		
		int i=0;
		if(aTrim.charAt(i)=='-')
		{
			numStringBuilder.append(aTrim.charAt(i));
			i++;
		}
		else if(aTrim.charAt(i)=='+')
			i++;
		
		for (; i<aTrim.length(); i++) {
			if(aTrim.charAt(i)>='0' && aTrim.charAt(i)<='9')
				numStringBuilder.append(aTrim.charAt(i));
			else
				break;
		}
		
		int result = 0;
		String numString = numStringBuilder.toString();
		if(!numString.equals("-") && numString.length()>0)
		{
			try
			{
				result = Integer.parseInt(numString);
			}
			catch (NumberFormatException ex)
			{
				if(numString.charAt(0)=='-')
					result = Integer.MIN_VALUE;
				else
					result = Integer.MAX_VALUE;
			}
		}
		
		return result;
	}
}
