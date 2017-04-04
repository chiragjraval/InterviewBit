package com.chirag.ib.string.parsing;

public class ValidNumber
{
	private boolean isInteger(String in)
	{
		return in.matches("-*[0-9]+");
	}
	
	private boolean isFloat(String in)
	{
		return in.matches("-*[0-9]*\\.[0-9]+");
	}
	
	public boolean validNumber(String a)
	{
		if(a==null || a.isEmpty())
			return false;
		
		String aTrim = a.trim();
		
		if(aTrim.contains("e"))
		{
			String real = aTrim.substring(0, aTrim.indexOf("e"));
			String exponent = aTrim.substring(aTrim.indexOf("e")+1, aTrim.length());
			return (isInteger(real) || isFloat(real)) && isInteger(exponent);
		}
		else
		{
			return isInteger(aTrim) || isFloat(aTrim);
		}
		
		/*if(aTrim.matches("-*[0-9]+"))
			return true;
		else if(aTrim.matches("-*[0-9]*\\.[0-9]+"))
			return true;
		else if(aTrim.matches("-*[0-9]*\\.[0-9]+e-*[0-9]+"))
			return true;
		
		return false;*/
	}
}
