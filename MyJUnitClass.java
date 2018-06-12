package ProgrammingKnowledge;

public class MyJUnitClass {

	public int add(int a, int b)
	{
		return a+b;
	}
	public int subtract(int a, int b)
	{
		return a-b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public int divide(int a, int b)
	{
		if(b == 0)
		{
			throw new IllegalArgumentException("Number cannot be divided by 0!!!");
		}
		return a/b;
	}
	public String ConCat(String a, String b)
	{
		return a+b;
	}
	
}
