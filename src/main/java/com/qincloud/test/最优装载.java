package com.qincloud.test;

import java.util.Scanner;

public class 最优装载 {

	public static int[] a = new int[5];
	public static int n = 0;
	public static int best = 0;
	public static int cw = 0;
	public static int first = 0;
	public static void  Backtrack(int i)
	{
		if(i > n)
		{
			if(cw > best)
			{
				best = cw;
			    System.out.println("must proority solution is:"+best);
			    System.exit(0);
			}
		}
		if(cw+a[i] < first)
		{
			System.out.println(i);
			cw += a[i];
			Backtrack(i+1);
			cw -= a[i];
			Backtrack(i+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入船的重量");
		first = s.nextInt();
		
		System.out.println("输入n数组个数");
		n = s.nextInt();
		while(n > 5)
		{
			System.out.println("请输入小于5的数");
			n = s.nextInt();
		}
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.println("请输入第"+i+"个集装箱重量");
			a[i] = s.nextInt();
		}
		Backtrack(1);
		
		System.out.println("最优重量为"+best);
	}
}
