package com.chirag.ib.string.parsing;

import java.util.ArrayList;
import java.util.Collections;

public class ValidIpAddresses
{
	private boolean isPositiveInteger(String in)
	{
		return in.matches("[0-9]+");
	}
	
	public int isValidIpAddress(final String a)
	{
		if(a==null || a.trim().isEmpty())
			return 0;
		
		String aTrim = a.trim();
		String[] tokens = aTrim.split("\\.");
		
		if(tokens.length!=4)
			return 0;
		
		for (String token : tokens) {
			if(!isPositiveInteger(token)) return 0;
		}
		
		return 1;
	}
	
	
	private boolean checkToken(String token)
	{
		if(token==null || token.trim().isEmpty())
			return false;
		else if(token.length()>1 && token.charAt(0)=='0')
			return false;
		else if(Integer.valueOf(token)>=0 && Integer.valueOf(token)<=255)
			return true;
		else
			return false;
	}
	
	public ArrayList<String> restoreIpAddresses(String a)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if(a==null || a.length()>12 || a.length()<4)
			return result;
		
		for(int i=1; i<4; i++)
		{
			String firstToken = a.substring(0, i);
			if(!checkToken(firstToken)) continue;
			
			for(int j=1; i+j<a.length() && j<4; j++)
			{
				String secondToken = a.substring(i, i+j);
				if(!checkToken(secondToken)) continue;
				
				for (int k = 1; i + j + k < a.length() && k < 4; k++)
	            {
	                String thirdToken = a.substring(i + j, i + j + k);
	                String fourthToken = a.substring(i + j + k);
	                if (checkToken(thirdToken) && checkToken(fourthToken))
	                {
	                    String ipAddress  =  firstToken + "." + secondToken + "." + thirdToken + "." + fourthToken;
	                    result.add(ipAddress);
	                }
	            }
			}
		}
		
		Collections.sort(result);
		return result;
	}
	
}
