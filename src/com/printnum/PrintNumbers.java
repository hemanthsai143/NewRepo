package com.printnum;

public class PrintNumbers {

	public static void main(String[] args) {
		String primeNumber=" ";
	
		for(int i=1;i<=1000;i++)
		{
			int counter=0;
			for(int j=2;j<=i-1;j++)
			{
			
				if(i%j==0)
				{
					counter++;
				}
					
		}
         if(counter==0)
         {
        	 primeNumber=primeNumber+i+" ";
         }
         
	}
		System.out.println(primeNumber);

}
}
