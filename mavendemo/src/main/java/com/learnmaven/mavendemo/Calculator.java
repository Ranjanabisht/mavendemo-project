package com.learnmaven.mavendemo;

public class Calculator {
	
	public int Sum(int a, int b)
	{
		return a+b;
	}
	public int Diff(int a, int b)
	{
		return a-b;
	}
	public int Mul(int a, int b)
	{
		return a*b;
	}
	public double Div(int a, int b)
	{
		if(b==0)
		{
			return 0.0;
		}
		return a/b;
	}

}
