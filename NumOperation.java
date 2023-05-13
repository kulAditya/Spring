package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumOperation {

	public static void HCF(int m,int n)
	{
//		List <Integer>factorsM=new ArrayList<>();
//		List <Integer>factorsN=new ArrayList<>();
//		int hcf=0;
//		
//		
//			for(int i=1;i<=m;i++)
//			{
//				if(m%i==0)
//				factorsM.add(i);
//			}
//		
//			for(int i=1;i<=n;i++)
//			{
//				if(n%i==0)
//				factorsN.add(i);
//			}
//			
//			if(m>n)
//			{
//				for(int i=factorsN.size()-1;i>=0;i--)
//				{
//					int max=0;
//					
//					if(m%factorsN.get(i)==0 && factorsN.get(i)>hcf)
//					{
//						hcf=factorsN.get(i);
//						
//					}
//						
//				}
//			}
//			else
//			{
//				for(int i=factorsM.size()-1;i>=0;i--)
//				{
//					int max=0;
//					if(n%factorsM.get(i)==0 && factorsM.get(i)>hcf)
//					{
//						hcf=factorsM.get(i);
//					}
//						
//				}
//			}
//	System.out.println(hcf);
//		return hcf; 
		
		int hcf=0;
		
		for(int i=1;i<=m&&i<=n;i++)
		{
			if(m%i==0&&n%i==0)
				hcf=i;
		}
		
		System.out.println(" HCF: "+hcf);
	}
	public static int  LCM(int m,int n)
	{
		int lcm=1;
		while(lcm<=m*n)
		{	
			if(lcm%m==0 && lcm%n==0)
			{
				System.out.println(" LCM: "+lcm);
				break;
			}
			else
			{
				lcm++;
			}
		}
		
		
		return lcm;
		
	}
	public static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
		//	System.out.print(0+" ");
		//	System.out.print(1+" ");
			
			for(int j=n-i-1;j<n;j++)
			{
				System.out.print(0+" ");
				System.out.print(" ");	
				System.out.print(1+" ");
				System.out.print(" ");	
			
			}
			
			
			System.out.println(0+"\n ");
			
		}
	}
		public static void NumberPattern(int n)
		{
			  int i, j, k, l, a;

		   
		        int rows =n;
		        a = rows;

		        
		        int length = ("" + rows).length();
		        String str = " %" + length + "s";

		     
		        for (i = 1; i <= rows; i++)
		        {
		            for (j = a; j > 0; j--)
		            {
		                System.out.printf(str, " ");
		            }

		            for (j = 1; j <= (2*rows); j++)
		            {
		                if (j == (rows+1))
		                {
		                    continue;
		                }

		                if (j < (rows+1))
		                {
		                    k = j;
		                }
		                else
		                {
		                    k = ((2*rows)-j+1);
		                }

		                if (k >= (rows+1-i))
		                {
		                    l = (int)Math.pow(2, (i+k-rows-1));
		                    String str1 = "" + l;
		                    System.out.printf(str, str1);
		                }
		            }
		            a--;
		            System.out.println();
		        
				
			}
		
	}
		
		public static void fibonacchi(int n)
		{
			int a=0;
			int b=1;
			int	c;
			
			while(n>0)
			{
				System.out.println(a);
				c=a+b;
				a=b;
				b=c;
			n--;
			}
		}
	public static void main(String[] args) {
		//HCF(16,8);
	//	int ans=LCM(105,35);
	//	Map <Integer,Integer>set=new HashMap<>();
		Set<Integer>set=new HashSet<>();
		System.out.println(set.add(6));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
	//	String str="rohit ";
		//str="Sharma";
	//	System.out.println(str);
	//	pattern(6);
	//	NumberPattern(8);
		 fibonacchi(10);
}
}