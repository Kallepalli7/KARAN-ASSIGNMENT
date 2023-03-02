package week1.day2;


public class Palindrome {
	public static void main(String arg[])	
{
    int num=123421,temp,sum,rem;
    temp=num;
    for(sum=0;num>0;num=num/10)
    {
    rem=num%10;
    sum=(sum*10)+rem;
    }
   if(sum==temp)
	System.out.println(temp+" is a palindrome number ");
              else
	System.out.println(temp+" is not a palindrome number ");
              
}
}