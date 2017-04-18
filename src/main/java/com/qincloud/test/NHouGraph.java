package com.qincloud.test;

import java.math.*;
import java.util.ArrayList;
import java.util.List;

public class NHouGraph {
	private int n;
	private int[] x = new int[22];
	private int sum;
	private List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public void init() {
		for (int i = 0; i <= x.length; i++) {
			x[i] = 0;
		}
		
	}

	public boolean Place(int k) {
		for (int j = 1; j < k; j++) {
			if ((Math.abs(k - j) == Math.abs(x[j] - x[k])) || (x[j] == x[k]))
				return false;
		}
		return true;
	}

	public void Backtrack(int t) {
		if (t > n) {
			sum++;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 1 ; i <= n ; i++) {
				list.add(x[i]);
			}
			lists.add(list);
		} else {
			for (int i = 1; i <= n; i++) {
				x[t] = i;
				if (Place(t))
					Backtrack(t + 1);
			}
		}
	}

	public List<List<Integer>> getLists() {
		return lists;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int[] getX() {
		return x;
	}
}
