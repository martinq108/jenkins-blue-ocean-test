package com.example.lib2;

import com.example.lib1.Lib1;

public class Lib2 {

	public int multiply(int a, int b) {
		int result = 0;
		Lib1 lib1 = new Lib1();
		for (int i = 0; i < a; i++) {
			result = lib1.add(result, b);
		}
		return result;
	}
}
