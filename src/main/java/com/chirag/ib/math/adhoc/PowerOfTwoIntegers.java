package com.chirag.ib.math.adhoc;

public class PowerOfTwoIntegers
{
	
	public Long pow(int a, int n)
	{
		if(n==0)
			return new Long(1);
		else if(n==1)
			return new Long(a);
		else
		{
			Long tempResult = pow(a, n/2);
			if(n%2==0)
				return tempResult * tempResult;
			else
				return tempResult * tempResult * a;
		}
	}
	
	public boolean isPower(int a)
	{
		if(a == 1)
            return true;
		
		double sqrtA = Math.sqrt(a);
		double logA = Math.log(a);
		
        for(int i = 1; i <= sqrtA; i++){
            double p = logA / Math.log(i);
            if(Double.isFinite(p) &&  p-Math.floor(p)<0.0000000001)
                return true;
        }
        return false;
    }

	public static void main(String[] args)
	{
		PowerOfTwoIntegers obj = new PowerOfTwoIntegers();
		
		/*System.out.println("Power of (2, 3) = " + obj.pow(2, 3));
		System.out.println("Power of (2, 3) = " + obj.pow(2, 0));
		System.out.println("Power of (2, 3) = " + obj.pow(10, 10));*/
		
		//System.out.println("Power of (2, 3) = " + obj.isPower(3));
		//System.out.println("Power of (2, 3) = " + obj.isPower(0));
		//System.out.println("Power of (2, 3) = " + obj.isPower(10));
		//System.out.println("Power of (2, 3) = " + obj.isPower(16));
		System.out.println("Power of (2, 3) = " + obj.isPower(536870912));
		
	}
	
}
