package com.qincloud.test;

import java.util.Scanner;

public class ����װ�� {

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
		System.out.println("���봬������");
		first = s.nextInt();
		
		System.out.println("����n�������");
		n = s.nextInt();
		while(n > 5)
		{
			System.out.println("������С��5����");
			n = s.nextInt();
		}
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.println("�������"+i+"����װ������");
			a[i] = s.nextInt();
		}
		Backtrack(1);
		
		System.out.println("��������Ϊ"+best);
	}
}
