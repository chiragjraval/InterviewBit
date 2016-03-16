package com.chirag.ib.string.parsing;

import java.math.BigInteger;

public class CompareVersionNumbers
{
	static class Version implements Comparable<Version>
	{
		private BigInteger[] versionNums;
		
		public Version(String versionStr)
		{
			String[] versionNumStrs = versionStr.split("\\.");
			versionNums = new BigInteger[versionNumStrs.length];
			
			for(int i=0;i<versionNumStrs.length; i++)
				versionNums[i] = new BigInteger(versionNumStrs[i]);
		}

		public int compareTo(Version o)
		{
			int i = 0;
			
			for(; i<this.versionNums.length && i<o.versionNums.length; i++)
			{
				int cmp = this.versionNums[i].compareTo(o.versionNums[i]);
				if(cmp!=0) return cmp;
			}
			
			if(i==this.versionNums.length && i==o.versionNums.length)
				return 0;
			else if(i==this.versionNums.length)
			{
				for(; i<o.versionNums.length; i++)
					if(o.versionNums[i].compareTo(BigInteger.ZERO)>0)
						return -1;
				return 0;
			}
			else
			{
				for(; i<this.versionNums.length; i++)
					if(this.versionNums[i].compareTo(BigInteger.ZERO)>0)
						return 1;
				return 0;
			}
		}
		
		@Override
		public String toString()
		{
			StringBuilder res = new StringBuilder();
			res.append("[");
			for (BigInteger versionNum : versionNums) res.append(versionNum + ",");
			res.append("]");
			return res.toString();
		}
	}
	
	public int compareVersionNumbers(String a, String b)
	{
		Version version1 = new Version(a);
		Version version2 = new Version(b);
		return version1.compareTo(version2);
	}
}
